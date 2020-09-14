package com.gly.design.factory.abstractFactory;

import org.springframework.util.StringUtils;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(StringUtils.isEmpty(shape)){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shape)){
            return new Circle();
        }
        if("SQUARE".equalsIgnoreCase(shape)){
            return new Square();
        }
        if("RECTANGLE".equalsIgnoreCase(shape)){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
