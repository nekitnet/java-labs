public class TryCatchFinallyDemo {

    static int methodWithReturn() {
        try {
            return 1;
        } finally {
            System.out.println("finally выполняется даже при return");
        }
    }

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Это выполнится обязательно");
        }

        try {
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс вне границ массива!");
        }

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Обращение к null объекту");
        }

        try {
            int number = Integer.parseInt("abc");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Некорректное преобразование строки: " + e.getMessage());
        }

        try {
            int[] data = {1, 2, 3};
            System.out.println(data[99]);
        } catch (ArithmeticException e) {
            System.out.println("Никогда не выполнится");
        } catch (Exception e) {
            System.out.println("Общий перехват: " + e);
        }

        System.out.println("return = " + methodWithReturn());

        System.out.println("getMessage(): " + catchAndPrint());
        System.out.println("toString(): " + catchToString());
    }

    static String catchAndPrint() {
        try {
            Integer.parseInt("x");
            return "ok";
        } catch (NumberFormatException e) {
            return e.getMessage();
        }
    }

    static String catchToString() {
        try {
            int[] a = new int[1];
            a[5] = 0;
            return "ok";
        } catch (Exception e) {
            return e.toString();
        }
    }
}
