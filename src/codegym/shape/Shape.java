package codegym.shape;

public abstract class Shape implements Readable{
    public abstract double getArea();
    public abstract double getPerimeter();

    public abstract String toString();

    public abstract void resize(double percent);
}
