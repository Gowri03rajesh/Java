import Arithmetic.*;
import java.util.Scanner;

public class TestArithmetic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            Addition add = new Addition();
            Subtraction sub = new Subtraction();
            Multiplication mul = new Multiplication();
            Division div = new Division();

            System.out.println("\nResults:");
            System.out.println("Addition = " + add.calculate(a, b));
            System.out.println("Subtraction = " + sub.calculate(a, b));
            System.out.println("Multiplication = " + mul.calculate(a, b));
            System.out.println("Division = " + div.calculate(a, b));

        }
    }
}