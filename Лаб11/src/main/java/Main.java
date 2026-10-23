public class Main {
    public static void main(String[] args) {
        Bird b1 = new Bird("Птица", "Неизвестный вид", 0.3);
        Eagle e1 = new Eagle("Орел", "Беркут", 2.0, 3000);
        Sparrow s1 = new Sparrow("Кеша", "Воробей", 0.2, true);

        b1.displayInfo();
        e1.displayInfo();
        s1.displayInfo();
        System.out.println();

        System.out.println("fly() без параметров:");
        b1.fly();
        e1.fly();
        s1.fly();
        System.out.println();

        System.out.println("fly(int distance):");
        b1.fly(10);
        e1.fly(50);
        s1.fly(2);
        System.out.println();

        System.out.println("fly(double height):");
        b1.fly(100.5);
        e1.fly(3000.0);
        s1.fly(15.5);
        System.out.println();

        System.out.println("b1: " + b1.getFlightStyle());
        System.out.println("e1: " + e1.getFlightStyle());
        System.out.println("s1: " + s1.getFlightStyle());
        System.out.println();

        Bird[] birds = {b1, e1, s1};
        for (int i = 0; i < birds.length; i++) {
            System.out.print(birds[i].name + " - " + birds[i].getFlightStyle() + " - ");
            birds[i].fly();
        }
        System.out.println();

        for (int i = 0; i < birds.length; i++) {
            if (birds[i] instanceof Eagle) {
                System.out.println(birds[i].name + " - это Орел");
            } else if (birds[i] instanceof Sparrow) {
                System.out.println(birds[i].name + " - это Воробей");
            } else {
                System.out.println(birds[i].name + " - это просто Птица");
            }
        }
    }
}
