public class Wardrobe extends Furniture {
    int doors;

    public Wardrobe(String name, int id, String material, int doors) {
        super(name, id, material);
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Шкаф " + super.toString() + ", дверей=" + doors;
    }
}
