public class Furniture {
    String name;
    int id;
    String material;

    public Furniture(String name, int id, String material) {
        this.name = name;
        this.id = id;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (id=" + id + ", материал=" + material + ")";
    }
}
