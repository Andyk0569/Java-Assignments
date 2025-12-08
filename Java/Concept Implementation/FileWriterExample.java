import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("assignment_output.txt")) {

            writer.write("This is a test.");
            System.out.println("File written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
