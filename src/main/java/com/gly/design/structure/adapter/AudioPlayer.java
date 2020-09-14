package com.gly.design.structure.adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if("MP3".equalsIgnoreCase(audioType)){
            System.out.println("Player Mp3 FileName:"+fileName);
        }else if("VLC".equalsIgnoreCase(audioType) || "MP4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("not valid audioType.");
        }
    }
}
