import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Task2 {
    public static void main(String[] args) {
        Path path = Path.of("f");
        int count = 0;

        try (BufferedReader console = new BufferedReader(new java.io.InputStreamReader(System.in));
             FileWriter writer = new FileWriter(path.toFile())) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int value = Integer.parseInt(console.readLine().trim());
                writer.write(value + "\n");
                count++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не целое число");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.getMessage());
            return;
        }

        System.out.println("Записано чисел: " + count);
        System.out.println();
        System.out.println("=== Числа из файла ===");

        int multiple4Not8 = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int value = Integer.parseInt(line.trim());
                System.out.println(value);
                if (value % 4 == 0 && value % 8 != 0) {
                    multiple4Not8++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        System.out.println();
        System.out.println("Чисел, кратных 4 и не кратных 8: " + multiple4Not8);
    }
}
