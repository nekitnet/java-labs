public class TrainMain {

    public static void main(String[] args) {
        TicketOffice office = new TicketOffice();

        System.out.println("=== Создание поездов ===");
        try {
            office.addTrain(new Train("001М", "Минск - Витебск", 12, 600, 120.5));
            System.out.println("Создан: Минск - Витебск");
            office.addTrain(new Train("205Б", "Брест - Гомель", 8, 400, 100.0));
            System.out.println("Создан: Брест - Гомель");
            office.addTrain(new Train("742Д", "Гродно - Могилев", 16, 800, 140.0));
            System.out.println("Создан: Гродно - Могилев");
        } catch (InvalidTrainDataException e) {
            System.out.println("Ошибка создания поезда: " + e.getMessage());
        }

        try {
            office.addTrain(new Train("", "Минск - Витебск", 12, 600, 120.5));
        } catch (InvalidTrainDataException e) {
            System.out.println("Ожидаемая ошибка: " + e.getMessage());
        }

        try {
            office.addTrain(new Train("999Х", "Минск - Витебск", 0, 600, 120.5));
        } catch (InvalidTrainDataException e) {
            System.out.println("Ожидаемая ошибка: " + e.getMessage());
        }

        try {
            office.addTrain(new Train("998Х", "Минск - Витебск", 12, -5, 120.5));
        } catch (InvalidTrainDataException e) {
            System.out.println("Ожидаемая ошибка: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Список поездов ===");
        for (Train train : office.getTrains()) {
            System.out.println(train);
        }

        System.out.println();
        System.out.println("=== Покупка билетов ===");
        try {
            office.buyTicket("001М");
            office.buyTicket("001М");
            office.buyTicket("205Б");
        } catch (TrainNotFoundException | TicketException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Покупка несуществующего поезда ===");
        try {
            office.buyTicket("777Ж");
        } catch (TrainNotFoundException e) {
            System.out.println("Поймано: " + e.getMessage() + ", номер = " + e.getNumber());
        } catch (TicketException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Отмена билета ===");
        try {
            office.cancelTicket("001М");
        } catch (TrainNotFoundException | TicketException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            office.cancelTicket("742Д");
        } catch (TrainNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (TicketException e) {
            System.out.println("Поймано: " + e.getMessage()
                    + ", свободно: " + e.getAvailableSeats()
                    + ", продано: " + e.getSoldTickets());
        }

        System.out.println();
        System.out.println("=== Продажа всех мест в маленьком поезде ===");
        try {
            office.addTrain(new Train("010Т", "Тест - Тест", 1, 2, 90.0));
            office.buyTicket("010Т");
            office.buyTicket("010Т");
            office.buyTicket("010Т");
        } catch (InvalidTrainDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        } catch (TrainNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (TicketException e) {
            System.out.println("Поймано: " + e.getMessage()
                    + ", свободно: " + e.getAvailableSeats()
                    + ", продано: " + e.getSoldTickets());
        }

        System.out.println();
        System.out.println("=== Итоговое состояние ===");
        for (Train train : office.getTrains()) {
            System.out.println(train);
        }

        System.out.println();
        System.out.println("=== finally выполняется всегда ===");
        try {
            office.buyTicket("777Ж");
        } catch (TrainNotFoundException | TicketException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Операция завершена");
        }
    }
}
