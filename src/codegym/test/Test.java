package codegym.test;

import codegym.shape.Circle;
import codegym.shape.Rectangle;
import codegym.shape.Shape;
import codegym.shape.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3.2);
        shapes[1] = new Circle(4.3);
        shapes[2] = new Rectangle(3.4, 2.6);

        int randomNumber;

        for(int i = 0; i < shapes.length; i++){
            randomNumber = ((int)Math.random()*99)+1;
            shapes[i].resize(randomNumber);
        }

        for(int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i].toString());
        }
        //System.out.println(shapes[0].toString());
    }
}
