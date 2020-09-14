package com.gly.design.structure.adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Player Mp4 FileName:"+fileName);
    }
}
