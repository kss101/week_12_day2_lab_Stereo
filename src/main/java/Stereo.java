public class Stereo {
    Radio radio = new Radio("Yamaha", "J2000");
    CDPlayer cdPlayer = new CDPlayer("Toshiba", "XYM", 5);
    RecordDeck recordDeck = new RecordDeck("Yamaha", "MorriseySad", 80);

    public Stereo(Radio radio, CDPlayer cdPlayer, RecordDeck recordDeck){
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
    }

    public void playRadio(){
        radio.tuneRadioStation();
    }

    public void playCD(){
        cdPlayer.play();
    }

    public void playRecord(){
        recordDeck.play();
    }

    public void volumeUp(){
        
    }
}
