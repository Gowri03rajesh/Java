



class Product {
    String pcode;
    String pname;
    double price;

    Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}

public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Keyboard", 750.00);
        Product p2 = new Product("P002", "Mouse", 750.00);
        Product p3 = new Product("P003", "Monitor", 750.00);

        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }
        System.out.println("Product with lowest price");
        System.out.println("Code : " + lowest.pcode);
        System.out.println("Name :" + lowest.pname);
        System.out.println("Price :" + lowest.price);
    }
}