import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TicketOffice {

    private Map<String, Train> trains = new LinkedHashMap<>();

    public void addTrain(Train train) {
        trains.put(train.getNumber(), train);
    }

    public Train findTrain(String number) throws TrainNotFoundException {
        Train train = trains.get(number);
        if (train == null) {
            throw new TrainNotFoundException("Поезд " + number + " не найден", number);
        }
        return train;
    }

    public void buyTicket(String number) throws TrainNotFoundException, TicketException {
        findTrain(number).buyTicket();
    }

    public void cancelTicket(String number) throws TrainNotFoundException, TicketException {
        findTrain(number).cancelTicket();
    }

    public List<Train> getTrains() {
        return new ArrayList<>(trains.values());
    }
}
