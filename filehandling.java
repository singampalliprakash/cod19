import java.io.*;

public class FileReaderExample {
    public static void readFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println("File content displayed");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch (IOException e) {
            System.out.println("Error: Unable to read file");
        }
    }

    public static void main(String[] args) {
        readFile("data.txt"); 
    }
}
