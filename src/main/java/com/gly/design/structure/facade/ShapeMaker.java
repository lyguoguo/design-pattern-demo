package com.gly.design.structure.facade;

public class ShapeMaker {
    private  Circle circle;
    private  Rectangle rectangle;
    private  Square square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public  void circleDraw(){
        circle.draw();
    }

    public  void rectangleDraw(){
        rectangle.draw();
    }

    public  void squareDraw(){
        square.draw();
    }
}
