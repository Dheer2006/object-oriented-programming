import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String filename = "sample.txt";

        // Writing to file
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, this is a file handling example.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
