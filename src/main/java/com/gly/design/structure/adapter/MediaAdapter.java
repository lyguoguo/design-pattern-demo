package com.gly.design.structure.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if("VLC".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }else if("MP4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if("VLC".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }else if("MP4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
