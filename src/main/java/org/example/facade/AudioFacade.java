package org.example.facade;

public class AudioFacade {
    private Record record;
    private Effect effect;
    private Microphone microphone;

    public AudioFacade() {
        this.record = new Record();
        this.effect = new Effect();
        this.microphone = new Microphone();
    }

    public void turnOnAudio(){
        record.turnOnRecord();
        effect.turnOnEffect();
        microphone.turnOnMicrophone();
    }
}
