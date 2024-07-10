package org.example.adapter2;

public class AudioPlayerImpl implements AudioPlayer {
    @Override
    public void playAudio(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }
}
