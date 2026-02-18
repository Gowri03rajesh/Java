import java.util.Scanner;

class CPU {
    int price;

    // Inner class
    class Processor {
        int cores;
        String manufacturer;
    }

    // Static nested class
    static class RAM {
        int memory;
        String manufacturer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create CPU object
        CPU cpu = new CPU();

        System.out.println("Enter CPU price:");
        cpu.price = sc.nextInt();
        sc.nextLine();

        // Create Processor object
        CPU.Processor p = cpu.new Processor();

        System.out.println("Enter number of cores:");
        p.cores = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter processor manufacturer:");
        p.manufacturer = sc.nextLine();

        // Create RAM object
        CPU.RAM r = new CPU.RAM();

        System.out.println("Enter RAM memory (GB):");
        r.memory = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter RAM manufacturer:");
        r.manufacturer = sc.nextLine();

        // Print information
        System.out.println("\nCPU Price: " + cpu.price);
        System.out.println("Processor Cores: " + p.cores);
        System.out.println("Processor Manufacturer: " + p.manufacturer);
        System.out.println("RAM Memory: " + r.memory + " GB");
        System.out.println("RAM Manufacturer: " + r.manufacturer);

        sc.close();
    }
}
