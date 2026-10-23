import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("resource.txt")) {
            writer.write("Hello, Java!");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        try (FileReader reader = new FileReader("resource.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        try (FileReader reader = new FileReader("missing.txt")) {
            System.out.println(reader.read());
        } catch (IOException e) {
            System.out.println("Ресурс не найден: " + e.getMessage());
        }
    }
}
