package com.gly.design.factory.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShapeCache {

    private static Map<String,Shape> map = new HashMap<>();

    public static Shape getShape(String id){
        Shape shape = map.get(id);
        return (Shape) shape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        map.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        map.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        map.put(square.getId(),square);
    }
}
