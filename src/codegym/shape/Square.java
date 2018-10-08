package codegym.shape;

import java.io.IOException;
import java.nio.CharBuffer;

public class Square extends Shape{
    private double size;

    public Square(double size) {
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double getArea(){
        return this.size*this.size;
    }

    @Override
    public double getPerimeter(){
        return this.size*4;
    }

    @Override
    public String toString(){
        return "Square\nSize: "+this.size+"\nArea: "+this.getArea()+"\nPerimeter: "+this.getPerimeter()+"";
    }

    @Override
    public void resize(double percent){
        double ratio = percent*this.size/100;
        this.size+=ratio;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
