public class Eagle extends Bird {
    private double flightAltitude;

    public Eagle(String name, String species, double wingspan, double flightAltitude) {
        super(name, species, wingspan);
        this.flightAltitude = flightAltitude;
    }

    public String getFlightStyle() {
        return "Парящий полет";
    }

    public void fly() {
        System.out.println("Орел парит на высоте " + flightAltitude + " м");
    }

    public double getFlightAltitude() {
        return flightAltitude;
    }
}
