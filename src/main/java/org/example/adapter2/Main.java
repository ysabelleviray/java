package org.example.adapter2;


public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayerImpl();
        VideoPlayer videoPlayer = new VideoPlayerImpl();
        MediaPlayer videoAdapter = new MediaAdapter(videoPlayer);

        System.out.println("Audio Player:");
        audioPlayer.playAudio("song.mp3");

        System.out.println("Video Player through Adapter:");
        videoAdapter.play("video", "movie.mp4");
    }
}