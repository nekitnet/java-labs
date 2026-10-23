import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1 {
    public static void main(String[] args) {
        Path path = Path.of("shop.txt");

        try (FileWriter writer = new FileWriter(path.toFile())) {
            writer.write("Магазин: ТехноМир\n");
            writer.write("Адрес: г. Минск, ул. Примерная, д. 10\n");
            writer.write("Часы работы: 10:00 - 22:00\n");
            writer.write("Телефон: +375 29 123-45-67\n");
            writer.write("Продукция: бытовая техника, электроника\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        File file = path.toFile();
        System.out.println("=== Данные о файле ===");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Изменён: " + file.lastModified());
        System.out.println("Родительский каталог: " + file.getParent());
        System.out.println("Существует: " + file.exists());
        System.out.println("Можно читать: " + file.canRead());
        System.out.println("Можно писать: " + file.canWrite());
        System.out.println("Это каталог: " + file.isDirectory());
        System.out.println("Это обычный файл: " + file.isFile());

        System.out.println();
        System.out.println("=== Содержимое файла ===");
        try {
            Files.readAllLines(path).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
