package com.gly.design.behavior.template;

public class Football  extends Game{
    @Override
    void initalize() {
        System.out.println("Football initalize");
    }

    @Override
    void startPlay() {
        System.out.println("Football start");
    }

    @Override
    void endPlay() {
        System.out.println("Football end");
    }
}
