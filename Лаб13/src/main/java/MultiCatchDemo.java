public class MultiCatchDemo {

    static void parseValue(String value) {
        try {
            if (value == null) {
                throw new NullPointerException("value is null");
            }
            int number = Integer.parseInt(value);
            int result = 100 / number;
            System.out.println(result);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e);
        }
    }

    static void correctOrder() {
        try {
            parseValue("0");
        } catch (ArithmeticException e) {
            System.out.println("специфичное исключение");
        } catch (Exception e) {
            System.out.println("общее исключение");
        }
    }

    public static void main(String[] args) {
        parseValue("abc");
        parseValue(null);
        parseValue("0");
        parseValue("10");
        correctOrder();
    }
}
