package com.gly.design.behavior.template;

public class Cricket extends Game {
    @Override
    void initalize() {
        System.out.println("Cricket initalize");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket start");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket end");
    }
}
