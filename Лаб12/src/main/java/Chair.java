public class Chair extends Furniture {
    String backrest;

    public Chair(String name, int id, String material, String backrest) {
        super(name, id, material);
        this.backrest = backrest;
    }

    @Override
    public String toString() {
        return "Стул " + super.toString() + ", спинка=" + backrest;
    }
}
