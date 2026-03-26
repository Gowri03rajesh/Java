package Graphics;

public class Triangle implements Figure {
    double base, height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}