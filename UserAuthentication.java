import java.util.Scanner;

// User-defined exception
class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}

// Main class
public class UserAuthentication {

    // Method to validate login
    static void authenticate(String username, String password)
            throws InvalidLoginException {

        String validUsername = "admin";
        String validPassword = "1234";

        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new InvalidLoginException("Invalid username or password");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        try {
            authenticate(user, pass);
            System.out.println("Login Successful!");
        } catch (InvalidLoginException e) {
            System.out.println("Authentication Failed: " + e.getMessage());
        }

        sc.close();
    }
}