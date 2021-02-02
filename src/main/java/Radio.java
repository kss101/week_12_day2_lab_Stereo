public class Radio extends Component {
    private String make;
    private String model;

    public Radio(String make, String model){
        super(make, model);
    }

    public String tuneRadioStation(){
        return "Playing Sting on Radio 1";
    }
}
