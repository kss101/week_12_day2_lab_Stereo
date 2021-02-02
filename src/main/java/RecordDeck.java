public class RecordDeck extends Component{

    private int playSpeed;

    public RecordDeck(String make, String model, int playSpeed){
        super(make, model);
        this.playSpeed = playSpeed;
    }

    public String play(){
        return "Hipster music sounds";
    }
}
