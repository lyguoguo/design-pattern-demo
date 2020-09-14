package com.gly.design.structure.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5,2,3,new GreenCircle());
        circle1.draw();

        Circle circle2 = new Circle(7,3,6,new RedCircle());
        circle2.draw();
    }
}
