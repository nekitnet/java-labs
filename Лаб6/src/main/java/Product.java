public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public double totalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        Product product = new Product("Ноутбук", 1299.99, 3);
        System.out.println("Товар: " + product.getName());
        System.out.println("Цена: " + product.getPrice() + ", кол-во: " + product.getQuantity());
        System.out.println("Общая стоимость: " + product.totalCost());
    }
}
