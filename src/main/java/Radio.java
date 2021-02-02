public class Radio extends Component implements IPlay, IVolume{
    private String make;
    private String model;

    public Radio(String make, String model){
        super(make, model);
    }

    public String play(){
        return "Playing Sting on Radio 1";
    }

    public void turnUpVolume(int volumeUp) {
        //Increase volume by volumeUp amount
    }

    public void turnDownVolume(int volumeDown) {
        // Decrease volume by volumeUp amount
    }
}
