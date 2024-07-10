package org.example.adapter2;

public class VideoPlayerImpl implements VideoPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing video file: " + fileName);
    }
}
