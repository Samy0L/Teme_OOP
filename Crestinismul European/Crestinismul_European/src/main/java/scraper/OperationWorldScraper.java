package scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class OperationWorldScraper {

    public static void main(String[] args) {

        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (Exception ignored) {}

        String Url = "https://operationworld.org/locations/europe/";
        String output = "Statistica Europeana a Crestinismului.csv";

        try (PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream(output), "UTF-8"))) {

            writer.println("Country,Population,% Evangelical");

            Document doc_eu = Jsoup.connect(Url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                    .timeout(15000)
                    .get();

            Elements link_tari = doc_eu.select("a[href*='/locations/']");

            int c = 0;

            for (Element link : link_tari) {
                String href = link.attr("abs:href");

                String path = href.replaceAll("https://operationworld.org", "")
                                  .replaceAll("/$", "");
                String[] parti = path.split("/");
                if (parti.length != 3) continue;
                if (parti[2].equals("europe")) continue;

                String nume_tara = link.text().replace(" ›", "").trim();
                if (nume_tara.isEmpty()) continue;

                System.out.print("Procesez: " + nume_tara);

                try {
                    Thread.sleep(500);

                    Document doc_tara = Jsoup.connect(href)
                            .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                            .timeout(15000)
                            .get();

                    String pop = "";
                    String ev = "";

                    // parcurgem TOATE rândurile din TOATE tabelele
                    Elements toate_r = doc_tara.select("tr");

                    for (Element rand : toate_r) {
                        Elements cel = rand.select("td, th");
                        if (cel.size() < 2) continue;

                        String etc = cel.get(0).text().trim();
                        String val = cel.get(1).text().trim();

                        if (etc.equalsIgnoreCase("Population:")) {
                            pop = val.replace(",", "");
                        } else if (etc.equalsIgnoreCase("% Evangelical:")) {
                            ev = val.replace("%", "").trim();
                        }
                    }

                    // căutare secvențială prin toate celulele
                    if (pop.isEmpty()) {
                        Elements toate_cel = doc_tara.select("td, th");
                        for (int i = 0; i < toate_cel.size() - 1; i++) {
                            String text_cel = toate_cel.get(i).text().trim();
                            if (text_cel.equalsIgnoreCase("Population:")) {
                                pop = toate_cel.get(i + 1).text()
                                              .replace(",", "").trim();
                            } else if (text_cel.equalsIgnoreCase("% Evangelical:")) {
                                ev = toate_cel.get(i + 1).text()
                                             .replace("%", "").trim();
                            }
                        }
                    }

                    if (pop.isEmpty()) {
                        String text_final = doc_tara.body().text();
                        java.util.regex.Matcher mPop = java.util.regex.Pattern
                                .compile("Population:\\s*([\\d,]+)")
                                .matcher(text_final);
                        if (mPop.find()) {
                            pop = mPop.group(1).replace(",", "");
                        }

                        java.util.regex.Matcher mEv = java.util.regex.Pattern
                                .compile("% Evangelical:\\s*([\\d.]+)")
                                .matcher(text_final);
                        if (mEv.find()) {
                            ev = mEv.group(1);
                        }
                    }

                    System.out.println(" | Pop=" + pop + " | Ev=" + ev + "%");
                    writer.println("\"" + nume_tara + "\"," + pop + "," + ev);
                    c++;

                } catch (Exception e) {
                    System.err.println("EROARE: " + e.getMessage());
                    writer.println("\"" + nume_tara + "\",,");
                }
            }

            System.out.println("\nCSV generat: " + output);
            System.out.println("\nTari extrase: " + c);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}