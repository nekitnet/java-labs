public class Train {

    private String number;
    private String route;
    private int cars;
    private int seats;
    private double speed;
    private int availableSeats;
    private int soldTickets;

    public Train(String number, String route, int cars, int seats, double speed)
            throws InvalidTrainDataException {

        if (number == null || number.trim().isEmpty()) {
            throw new InvalidTrainDataException("Номер поезда не может быть пустым");
        }
        if (route == null || route.trim().isEmpty()) {
            throw new InvalidTrainDataException("Маршрут не может быть пустым");
        }
        if (cars <= 0) {
            throw new InvalidTrainDataException("Количество вагонов должно быть больше 0: " + cars);
        }
        if (seats <= 0) {
            throw new InvalidTrainDataException("Количество мест должно быть больше 0: " + seats);
        }
        if (speed <= 0) {
            throw new InvalidTrainDataException("Скорость должна быть больше 0: " + speed);
        }

        this.number = number;
        this.route = route;
        this.cars = cars;
        this.seats = seats;
        this.speed = speed;
        this.availableSeats = seats;
        this.soldTickets = 0;
    }

    public void buyTicket() throws TicketException {
        if (availableSeats <= 0) {
            throw new TicketException(
                    "Билеты на поезд " + number + " закончились", availableSeats, soldTickets);
        }
        availableSeats--;
        soldTickets++;
        System.out.println("Билет куплен. Осталось мест: " + availableSeats);
    }

    public void cancelTicket() throws TicketException {
        if (soldTickets <= 0) {
            throw new TicketException(
                    "Нет купленных билетов на поезд " + number, availableSeats, soldTickets);
        }
        soldTickets--;
        availableSeats++;
        System.out.println("Билет отменен. Свободно мест: " + availableSeats);
    }

    public String getNumber() {
        return number;
    }

    public String getRoute() {
        return route;
    }

    public int getCars() {
        return cars;
    }

    public int getSeats() {
        return seats;
    }

    public double getSpeed() {
        return speed;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public int getSoldTickets() {
        return soldTickets;
    }

    @Override
    public String toString() {
        return "Поезд " + number + " [" + route + "], вагонов: " + cars
                + ", мест: " + seats + ", скорость: " + speed + " км/ч"
                + ", свободно: " + availableSeats;
    }
}
