package com.gly.design.factory.abstractFactory;

import org.springframework.util.StringUtils;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(StringUtils.isEmpty(type)){
            return null;
        }
        if("SHAPE".equalsIgnoreCase(type)){
            return new ShapeFactory();
        }
        if("COLOR".equalsIgnoreCase(type)){
            return new ColorFactory();
        }
        return null;
    }
}
