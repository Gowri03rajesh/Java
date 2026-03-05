import java.util.Scanner;

// Interface with prototypes for area() and perimeter()
interface Shape {
    void area();
    void perimeter();
}

// Circle class implementing Shape
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }

    public void perimeter() {
        double p = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + p);
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        double a = length * width;
        System.out.println("Area of Rectangle: " + a);
    }

    public void perimeter() {
        double p = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + p);
    }
}

// Main class with menu
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double w = sc.nextDouble();
                    Rectangle rect = new Rectangle(l, w);
                    rect.area();
                    rect.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}