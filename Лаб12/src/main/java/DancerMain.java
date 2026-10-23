import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DancerMain {

    public static void printDancers(List<Dancer> dancers, int level) {
        System.out.println("Танцоры уровня " + level + ":");
        for (Dancer d : dancers) {
            if (d.getLevel() == level) {
                System.out.println("  " + d.getId() + " " + d.name
                        + " - средний балл: " + String.format("%.2f", d.getAverageScore()));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        List<Dancer> dancers = new ArrayList<>();
        dancers.add(new Dancer(1, "Анна", "бальный", 3, List.of(5, 4, 5)));
        dancers.add(new Dancer(2, "Борис", "хип-хоп", 2, List.of(2, 3, 2)));
        dancers.add(new Dancer(3, "Вера", "современный", 4, List.of(4, 5, 4)));
        dancers.add(new Dancer(4, "Глеб", "балет", 1, List.of(3, 2, 3)));
        dancers.add(new Dancer(5, "Дарья", "джаз", 3, List.of(5, 5, 4)));
        dancers.add(new Dancer(6, "Егор", "контемп", 2, List.of(2, 2, 4)));
        dancers.add(new Dancer(7, "Жанна", "народный", 5, List.of(4, 4, 5)));
        dancers.add(new Dancer(8, "Игорь", "брейк", 3, List.of(3, 4, 3)));

        System.out.println("=== Исходный список ===");
        dancers.forEach(System.out::println);
        System.out.println();

        // 1. Удалить танцоров со средним баллом < 3
        Iterator<Dancer> it = dancers.iterator();
        while (it.hasNext()) {
            Dancer d = it.next();
            if (d.getAverageScore() < 3) {
                it.remove();
                System.out.println("Удалён: " + d.name);
            }
        }
        System.out.println();

        // 2. Повысить уровень танцоров со средним баллом >= 4
        for (Dancer d : dancers) {
            if (d.getAverageScore() >= 4) {
                d.setLevel(d.getLevel() + 1);
                System.out.println("Повышен: " + d.name + " -> уровень " + d.getLevel());
            }
        }
        System.out.println();

        // 3. Печать танцоров на уровне 4
        printDancers(dancers, 4);

        // 4. Сортировка по убыванию среднего балла, при совпадении - по алфавиту
        dancers.sort(Comparator.comparingDouble(Dancer::getAverageScore).reversed()
                .thenComparing(d -> d.name));

        System.out.println("=== Отсортированный список (ID, имя, средний балл) ===");
        for (Dancer d : dancers) {
            System.out.println(d.id + " " + d.name + " " + String.format("%.2f", d.getAverageScore()));
        }
    }
}
