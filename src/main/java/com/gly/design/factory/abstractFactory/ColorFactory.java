package com.gly.design.factory.abstractFactory;

import org.springframework.util.StringUtils;

public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(StringUtils.isEmpty(color)){
            return null;
        }
        if("RED".equalsIgnoreCase(color)){
            return new Red();
        }
        if("GREEN".equalsIgnoreCase(color)){
            return new Green();
        }
        if("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }
}
