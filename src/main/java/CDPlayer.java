public class CDPlayer extends Component implements IPlay, IVolume{
    private int numOfCDs;

    public CDPlayer(String make, String model, int numOfCDs){
        super(make, model);
        this.numOfCDs = numOfCDs;
    }

    public String play(){
        return "La la la music sounds";
    }

    public void turnUpVolume(int volumeUp) {
        //Increase volume by volumeUp amount
    }

    public void turnDownVolume(int volumeDown) {
        // Decrease volume by volumeUp amount
    }
}
