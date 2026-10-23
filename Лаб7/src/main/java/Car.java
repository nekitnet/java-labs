public class Car {
    private String model;
    private int year;
    private int horsePower;

    private static int totalCars = 0;
    private static int totalHorsePower = 0;

    public Car(String model, int year, int horsePower) {
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
        totalCars++;
        totalHorsePower += horsePower;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public static int getTotalHorsePower() {
        return totalHorsePower;
    }

    public static double getAveragePower() {
        if (totalCars == 0) {
            return 0;
        }
        return (double) totalHorsePower / totalCars;
    }

    public static void main(String[] args) {
        new Car("Lada Granta", 2020, 98);
        new Car("Toyota Camry", 2021, 181);
        new Car("BMW X5", 2019, 340);
        new Car("Kia Rio", 2022, 123);
        new Car("Audi A6", 2020, 249);

        System.out.println("Всего автомобилей: " + Car.getTotalCars());
        System.out.println("Общая мощность: " + Car.getTotalHorsePower() + " л.с.");
        System.out.println("Средняя мощность: " + Car.getAveragePower() + " л.с.");
    }
}
