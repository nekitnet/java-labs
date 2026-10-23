public class Product {
    private String name;
    private double price;
    private int quantity;

    private static int totalProducts = 0;
    private static double totalValue = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
        totalValue += price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public static double getTotalValue() {
        return totalValue;
    }

    public static double getAveragePrice() {
        if (totalProducts == 0) {
            return 0;
        }
        return totalValue / totalProducts;
    }

    public static void main(String[] args) {
        new Product("Хлеб", 1.5, 10);
        new Product("Молоко", 2.2, 5);
        new Product("Сыр", 8.9, 3);
        new Product("Яйца", 4.5, 2);

        System.out.println("Всего товаров: " + Product.getTotalProducts());
        System.out.println("Общая стоимость: " + Product.getTotalValue());
        System.out.println("Средняя цена: " + Product.getAveragePrice());
    }
}
