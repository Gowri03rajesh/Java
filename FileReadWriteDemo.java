import java.io.*;
import java.util.Scanner;

public class FileReadWriteDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "data.txt";

        try {
            FileWriter fw = new FileWriter(fileName); 
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Enter text to write to the file (type 'exit' to stop):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                bw.write(line);
                bw.newLine();
            }

            bw.close();
            fw.close();
            System.out.println("Data written to " + fileName);

            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("\nContents of the file:");
            String contentLine;
            while ((contentLine = br.readLine()) != null) {
                System.out.println(contentLine);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}