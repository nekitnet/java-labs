public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма не может быть отрицательной");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств", amount, balance);
        }
        balance -= amount;
    }
}
