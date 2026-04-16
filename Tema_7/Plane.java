public class Plane {
    private String planeID;
    private int totalEnginePower;

    public Plane(String planeID, int totalEnginePower){
        this.planeID = planeID;
        this.totalEnginePower = totalEnginePower;
    }

    public String getPlaneID(){ 
        return planeID; 
    }
    public int getTotalEnginePower(){ 
        return totalEnginePower; 
    }

    public void takeOff(){

    }

    public void fly(){

    }

    public void land(){

    }

    public static void main(String[] args) throws Exception{
        Plane p1 = new Boeing("0123", 528, 200);
        Plane p2 = new Concorde("0134", 982, 400);
        Plane p3 = new Mig("6845", 1455);
        Plane p4 = new TomCat("8173", 5893);

        p1.fly();
        p4.land();
        p2.takeOff();
        ((Mig)p3).launchMissile();
        ((FighterPlane)p3).launchMissile();
    }

}
