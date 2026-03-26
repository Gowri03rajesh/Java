import Graphics.*;
import java.util.Scanner;

public class TestGraphics {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length and breadth of rectangle: ");
            Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
            System.out.println("Area of Rectangle = " + r.area());

            System.out.print("\nEnter base and height of triangle: ");
            Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble());
            System.out.println("Area of Triangle = " + t.area());

            System.out.print("\nEnter side of square: ");
            Square s = new Square(sc.nextDouble());
            System.out.println("Area of Square = " + s.area());

            System.out.print("\nEnter radius of circle: ");
            Circle c = new Circle(sc.nextDouble());
            System.out.println("Area of Circle = " + c.area());

        }
    }
}