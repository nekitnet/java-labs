import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Path path = Path.of("f");
        Random random = new Random();

        try (FileWriter writer = new FileWriter(path.toFile())) {
            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(100) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка создания файла: " + e.getMessage());
            return;
        }

        System.out.println("=== Числа из файла ===");
        int greaterThan60 = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int value = Integer.parseInt(line.trim());
                System.out.println(value);
                if (value > 60) {
                    greaterThan60++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        System.out.println();
        System.out.println("Чисел больших 60: " + greaterThan60);
    }
}
