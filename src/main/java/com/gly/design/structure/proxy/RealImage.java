package com.gly.design.structure.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Disable "+fileName);
    }

    private void loadFromDisk(){
        System.out.println("Loading "+fileName);
    }
}
