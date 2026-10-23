public class ThrowThrowsDemo {

    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        if (age < 18) {
            throw new RuntimeException("Вы должны быть совершеннолетним");
        }
        System.out.println("Возраст " + age + " подтвержден");
    }

    public static void readFile(String path) throws java.io.FileNotFoundException, java.io.IOException {
        java.io.FileReader file = new java.io.FileReader(path);
        file.close();
    }

    public static void processFile() {
        try {
            readFile("data.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (java.io.IOException e) {
            System.out.println("Ошибка чтения файла!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(25);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkAge(-5);
        } catch (RuntimeException e) {
            System.out.println("Поймано: " + e.getMessage());
        }

        processFile();
    }
}
