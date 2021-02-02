public class RecordDeck {
    private String make;
    private String model;
    private int playSpeed;

    public RecordDeck(String make, String model, int playSpeed){
        this.make = make;
        this.model = model;
    }

    public String play(){
        return "Hipster music sounds";
    }
}
