package Graphics;

public class Square implements Figure {
    double side;

    public Square(double s) {
        side = s;
    }

    public double area() {
        return side * side;
    }
}