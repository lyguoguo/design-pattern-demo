package com.gly.design.behavior.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
