import java.util.Scanner;

// User-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            try {
                if (num < 0) {
                    throw new NegativeNumberException("Negative number not allowed: " + num);
                }

                sum += num;
                count++;

            } catch (NegativeNumberException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of positive numbers = " + average);
        } else {
            System.out.println("No valid positive numbers entered.");
        }

        sc.close();
    }
}