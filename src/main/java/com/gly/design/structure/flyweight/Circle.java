package com.gly.design.structure.flyweight;

public class Circle implements Shape {
    private String color;
    private int radius;
    private int x;
    private int y;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Circle draw(): color -> "+color+" ,x -> "+x+" ,y -> "+y+" ,radius -> "+radius);
    }
}
