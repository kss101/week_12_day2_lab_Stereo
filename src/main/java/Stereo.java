public class Stereo {
    Radio radio = new Radio("Yamaha", "J2000");
    CDPlayer cdPlayer = new CDPlayer("Toshiba", "XYM", 5);
    RecordDeck recordDeck = new RecordDeck("Yamaha", "MorriseySad", 80);
    private String name;

    public Stereo(Radio radio, CDPlayer cdPlayer, RecordDeck recordDeck, String name){
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.name = name;
    }

    public void playRadio(){
        radio.play();
    }

    public void playCD(){
        cdPlayer.play();
    }

    public void playRecord(){
        recordDeck.play();
    }

    public void volumeUp(){
        radio.turnUpVolume(10);
    }
}
