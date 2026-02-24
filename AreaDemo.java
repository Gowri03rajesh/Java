import java.util.Scanner;

class Area {

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(int base, int height) {
        return 0.5 * base * height;
    }
}

public class AreaDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle = " + obj.area(r));
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                System.out.println("Area of Rectangle = " + obj.area(l, b));
                break;

            case 3:
                System.out.print("Enter base: ");
                int base = sc.nextInt();
                System.out.print("Enter height: ");
                int height = sc.nextInt();
                System.out.println("Area of Triangle = " + obj.area(base, height));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}