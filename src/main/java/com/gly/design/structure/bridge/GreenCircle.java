package com.gly.design.structure.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("GreenCircle radius:"+radius+" ,x:"+x+" ,y:"+y);
    }
}
