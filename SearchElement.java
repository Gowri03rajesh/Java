import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();

        // Linear search
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}

