package org.example.adapter2;

public class MediaAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public MediaAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String mediaType, String fileName) {
        if(mediaType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        } else {
            System.out.println("Invalid media type for MediaAdapter. Please use 'video'.");
        }
    }
}