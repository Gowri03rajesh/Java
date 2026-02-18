import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

       
        System.out.println("\n1. Length of the string: " + str.length());

        if (str.length() >= 4) {
            System.out.println("2. Character at second position: " + str.charAt(1));
            System.out.println("   Character at fourth position: " + str.charAt(3));
        } else {
            System.out.println("2. String is too short to get 2nd and 4th characters.");
        }

        
        System.out.print("\nEnter start index for substring: ");
        int startIndex = sc.nextInt();
        sc.nextLine();  

        if (startIndex >= 0 && startIndex < str.length()) {
            System.out.println("3. Substring (start index only): " + str.substring(startIndex));
        } else {
            System.out.println("3. Invalid start index.");
        }

  
        System.out.print("\nEnter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        sc.nextLine();  

        if (start >= 0 && end <= str.length() && start < end) {
            System.out.println("4. Substring (start and end index): " + str.substring(start, end));
        } else {
            System.out.println("4. Invalid indices.");
        }

        System.out.print("\nEnter another string to concatenate: ");
        String str2 = sc.nextLine();
        String concatenated = str.concat(str2);
        System.out.println("5. Concatenated string: " + concatenated);

  
        System.out.print("\nEnter character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);
        sc.nextLine(); 

        String replacedString = str.replace(oldChar, newChar);
        System.out.println("6. String after replacement: " + replacedString);

        
        System.out.print("\nEnter a prefix to check: ");
        String prefix = sc.nextLine();

        if (str.startsWith(prefix)) {
            System.out.println("7. The string starts with \"" + prefix + "\"");
        } else {
            System.out.println("7. The string does NOT start with \"" + prefix + "\"");
        }

        System.out.println("8. Lowercase: " + str.toLowerCase());


        System.out.println("9. Uppercase: " + str.toUpperCase());

        sc.close();
    }
}
