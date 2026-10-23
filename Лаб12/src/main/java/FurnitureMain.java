import java.util.HashMap;
import java.util.Map;

public class FurnitureMain {
    public static void main(String[] args) {

        Map<String, Furniture> furnitureMap = new HashMap<>();

        // 3 стола
        furnitureMap.put("Орех", new Table("Орех", 1, "дерево", 4));
        furnitureMap.put("Дуб", new Table("Дуб", 2, "дерево", 4));
        furnitureMap.put("Стекло", new Table("Стекло", 3, "стекло", 3));

        // 3 стула
        furnitureMap.put("Классик", new Chair("Классик", 4, "пластик", "прямая"));
        furnitureMap.put("Офис", new Chair("Офис", 5, "металл", "сетчатая"));
        furnitureMap.put("Кресло", new Chair("Кресло", 6, "дерево", "высокая"));

        // 2 шкафа
        furnitureMap.put("Купе", new Wardrobe("Купе", 7, "ЛДСП", 2));
        furnitureMap.put("Книжный", new Wardrobe("Книжный", 8, "дерево", 3));

        System.out.println("=== Ключи ===");
        for (String key : furnitureMap.keySet()) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println("=== Значения ===");
        for (Furniture f : furnitureMap.values()) {
            System.out.println(f);
        }

        System.out.println();
        System.out.println("Всего предметов: " + furnitureMap.size());
    }
}
