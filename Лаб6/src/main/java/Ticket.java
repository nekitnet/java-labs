public class Ticket {
    private String event;
    private String seatNumber;
    private double price;

    public Ticket(String event, String seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getEvent() {
        return event;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void applyDiscount() {
        price = price * 0.9;
    }

    public void displayInfo() {
        System.out.println("Событие: " + event + ", место: " + seatNumber
                + ", цена: " + price);
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket("Концерт", "Ряд 5, место 12", 50.0);
        ticket.displayInfo();
        ticket.applyDiscount();
        System.out.println("После скидки 10%:");
        ticket.displayInfo();
    }
}
