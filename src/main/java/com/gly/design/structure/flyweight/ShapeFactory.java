package com.gly.design.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String,Shape> map = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) map.get(color);
        if(null == circle){
            circle = new Circle();
            map.put(color,circle);
            System.out.println("create circle of color: "+color);
        }
        return circle;
    }
}
