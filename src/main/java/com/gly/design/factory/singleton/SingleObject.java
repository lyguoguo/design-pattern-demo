package com.gly.design.factory.singleton;

public class SingleObject {

    private static SingleObject singleObject = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return singleObject;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
