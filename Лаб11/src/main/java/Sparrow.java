public class Sparrow extends Bird {
    private boolean isDomestic;

    public Sparrow(String name, String species, double wingspan, boolean isDomestic) {
        super(name, species, wingspan);
        this.isDomestic = isDomestic;
    }

    public String getFlightStyle() {
        return "Порхающий полет";
    }

    public void fly() {
        System.out.println("Воробей порхает между деревьями");
    }

    public boolean isDomestic() {
        return isDomestic;
    }
}
