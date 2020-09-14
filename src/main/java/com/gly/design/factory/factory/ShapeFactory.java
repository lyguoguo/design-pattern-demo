package com.gly.design.factory.factory;

import org.springframework.util.StringUtils;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(StringUtils.isEmpty(shapeType)){
            return null;
        }
        switch (shapeType){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                break;
        }
        return null;
    }
}
