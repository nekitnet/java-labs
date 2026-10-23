import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Path path = Path.of("speed.txt");

        try (BufferedReader console = new BufferedReader(new java.io.InputStreamReader(System.in));
             FileWriter writer = new FileWriter(path.toFile())) {
            System.out.println("Введите 15 скоростей интернета (Мбит/с):");
            for (int i = 0; i < 15; i++) {
                System.out.print("Скорость " + (i + 1) + ": ");
                double speed = Double.parseDouble(console.readLine().trim());
                writer.write(speed + "\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не вещественное число");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;

        System.out.println();
        System.out.println("=== Данные из файла ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double speed = Double.parseDouble(line.trim());
                System.out.println(speed);
                sum += speed;
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        if (count > 0) {
            System.out.println();
            System.out.println("Количество измерений: " + count);
            System.out.println("Средняя скорость: " + (sum / count) + " Мбит/с");
        } else {
            System.out.println("Файл пуст");
        }
    }
}
