public class CustomExceptionDemo {

    static void validateAge(int age) {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Некорректный возраст", age);
        }
        System.out.println("Возраст " + age + " корректен");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        try {
            account.withdraw(150);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Запрошено: " + e.getAmount());
            System.out.println("Баланс: " + e.getBalance());
        }

        try {
            account.withdraw(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            validateAge(200);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage() + ", возраст = " + e.getAge());
        }
    }
}
