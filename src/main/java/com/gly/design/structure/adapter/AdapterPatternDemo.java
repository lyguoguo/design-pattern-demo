package com.gly.design.structure.adapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3","haha.mp3");
        audioPlayer.play("MP4","haha.mp4");
        audioPlayer.play("VLC","haha.vlc");
        audioPlayer.play("MP7","oth.mp3");
    }
}
