import java.util.Scanner;

class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    String bookName;
    String author;
    double price;

    Book(String publisherName, String bookName, String author, double price) {
        super(publisherName);
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
}

class Literature extends Book {

    Literature(String publisherName, String bookName, String author, double price) {
        super(publisherName, bookName, author, price);
    }

    void display() {
        System.out.println("Category: Literature");
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisherName);
        System.out.println("---------------------------");
    }
}

class Fiction extends Book {

    Fiction(String publisherName, String bookName, String author, double price) {
        super(publisherName, bookName, author, price);
    }

    void display() {
        System.out.println("Category: Fiction");
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisherName);
        System.out.println("---------------------------");
    }
}

public class BookDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Book Category (1-Literature, 2-Fiction): ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Book Name: ");
            String book = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Publisher Name: ");
            String publisher = sc.nextLine();

            if (choice == 1) {
                Literature l = new Literature(publisher, book, author, price);
                l.display();
            } else if (choice == 2) {
                Fiction f = new Fiction(publisher, book, author, price);
                f.display();
            } else {
                System.out.println("Invalid Category");
            }
        }

        sc.close();
    }
}