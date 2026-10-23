import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Path f = Path.of("f");
        Path g = Path.of("g");
        Path h = Path.of("h");
        Random random = new Random();

        try (FileWriter writer = new FileWriter(f.toFile())) {
            for (int i = 0; i < 20; i++) {
                writer.write(random.nextInt(100) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка создания файла f: " + e.getMessage());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(f.toFile()));
             FileWriter writerG = new FileWriter(g.toFile());
             FileWriter writerH = new FileWriter(h.toFile())) {
            String line;
            while ((line = reader.readLine()) != null) {
                int value = Integer.parseInt(line.trim());
                if (value % 9 == 0 && value % 2 != 0) {
                    writerG.write(value + "\n");
                } else {
                    writerH.write(value + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка обработки: " + e.getMessage());
            return;
        }

        System.out.println("=== Файл f (исходные числа) ===");
        printFile(f);
        System.out.println("=== Файл g (кратные 9 и не кратные 2) ===");
        printFile(g);
        System.out.println("=== Файл h (остальные числа) ===");
        printFile(h);
    }

    static void printFile(Path path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println();
    }
}
