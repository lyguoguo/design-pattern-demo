package com.gly.design.structure.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Player VLC FileName:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
