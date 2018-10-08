package codegym.shape;

import codegym.resize.Resizeable;

import java.io.IOException;
import java.nio.CharBuffer;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return this.width*this.height;
    }

    @Override
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    @Override
    public String toString(){
        return "Rectangle\nWidth: "+this.width+"\nHeight: "+this.height+"\nArea: "+this.getArea()+"\nPerimeter: "+this.getPerimeter()+"";
    }

    @Override
    public void resize(double percent){
        double tb = (this.width + this.height)/2;
        double ratio = percent*tb/100;
        this.width+=ratio;
        this.height+=ratio;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
