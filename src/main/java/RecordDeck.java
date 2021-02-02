public class RecordDeck extends Component implements IPlay, IVolume{

    private int playSpeed;

    public RecordDeck(String make, String model, int playSpeed){
        super(make, model);
        this.playSpeed = playSpeed;
    }

    public String play(){
        return "Hipster music sounds";
    }

    public void turnUpVolume(int volumeUp) {
        //Increase volume by volumeUp amount
    }

    public void turnDownVolume(int volumeDown) {
        // Decrease volume by volumeUp amount
    }
}
