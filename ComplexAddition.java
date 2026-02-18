import java.util.Scanner;

class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        int real1 = sc.nextInt();

        System.out.print("Enter imaginary part of first complex number: ");
        int imag1 = sc.nextInt();

        System.out.print("Enter real part of second complex number: ");
        int real2 = sc.nextInt();

        System.out.print("Enter imaginary part of second complex number: ");
        int imag2 = sc.nextInt();

        int realSum = real1 + real2;
        int imagSum = imag1 + imag2;

        System.out.println("\nSum of complex numbers:");
        System.out.println(realSum + " + " + imagSum + "i");

        sc.close();
    }
}
