public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;

    public Car(String brand, String model, int year, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        }
    }

    public void drive(int km) {
        if (km > 0) {
            mileage += km;
        }
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand + ", модель: " + model
                + ", год: " + year + ", пробег: " + mileage + " км");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2019, 45000);
        car.displayInfo();
        car.drive(100);
        System.out.println("Пробег после поездки: " + car.getMileage() + " км");
    }
}
