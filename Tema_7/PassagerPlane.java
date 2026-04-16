public class PassagerPlane extends Plane {
    private int maxPassagers;

    public PassagerPlane(String planeID, int totalEnginePower, int maxPassagers){
        super(planeID, totalEnginePower);
        this.maxPassagers = maxPassagers;
    }

    public int getMaxPassagers(){
        return maxPassagers;
    }
}
