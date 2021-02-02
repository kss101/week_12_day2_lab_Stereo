public class CDPlayer {
    private String make;
    private String model;
    private int numOfCDs;

    public CDPlayer(String make, String model, int numOfCDs){
        this.make = make;
        this.model = model;
    }

    public String play(){
        return "La la la music sounds";
    }
}
