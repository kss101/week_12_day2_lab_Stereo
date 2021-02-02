public class CDPlayer extends Component {
    private int numOfCDs;

    public CDPlayer(String make, String model, int numOfCDs){
        super(make, model);
        this.numOfCDs = numOfCDs;
    }

    public String play(){
        return "La la la music sounds";
    }
}
