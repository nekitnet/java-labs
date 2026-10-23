public class Bird {
    protected String name;
    protected String species;
    protected double wingspan;

    public Bird(String name, String species, double wingspan) {
        this.name = name;
        this.species = species;
        this.wingspan = wingspan;
    }

    public void fly() {
        System.out.println("Лечу");
    }

    public void fly(int distance) {
        System.out.println("Лечу " + distance + " км");
    }

    public void fly(double height) {
        System.out.println("Лечу на высоте " + height);
    }

    public String getFlightStyle() {
        return "Обычный полет";
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", вид: " + species + ", размах: " + wingspan + " м");
    }
}
