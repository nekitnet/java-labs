public class TicketException extends Exception {

    private int availableSeats;
    private int soldTickets;

    public TicketException(String message, int availableSeats, int soldTickets) {
        super(message);
        this.availableSeats = availableSeats;
        this.soldTickets = soldTickets;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public int getSoldTickets() {
        return soldTickets;
    }
}
