public class Table extends Furniture {
    int legs;

    public Table(String name, int id, String material, int legs) {
        super(name, id, material);
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Стол " + super.toString() + ", ножек=" + legs;
    }
}
