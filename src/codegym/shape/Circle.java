package codegym.shape;

import codegym.resize.Resizeable;

import java.io.IOException;
import java.nio.CharBuffer;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString(){
        return "Circle\nRadius: "+this.getRadius()+"\nArea: "+this.getArea()+"\nPerimeter: "+this.getPerimeter()+"";
    }

    @Override
    public void resize(double percent){
        double ratio = percent*this.radius/100;
        this.radius+=ratio;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }

}
