import java.util.Scanner;

public class StringBufferOperations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        StringBuffer sb = new StringBuffer("HelloWorld");
        
       
        System.out.println("Original String: " + sb);
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
    
        sb.reverse();
        String reversedUpper = sb.toString().toUpperCase();
        System.out.println("Reversed and Uppercase String: " + reversedUpper);
      
        System.out.print("Enter another string to append: ");
        String userInput = sc.nextLine();
        
        sb.append(userInput);
        System.out.println("Final String after appending: " + sb);
        
        sc.close();
    }
}