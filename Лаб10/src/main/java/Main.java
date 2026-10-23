import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Playable> games = new ArrayList<>();
        games.add(new BoardGame("Монополия", 4));
        games.add(new BoardGame("Шахматы", 2));
        games.add(new BoardGame("Uno", 6));
        games.add(new VideoGame("Minecraft", "PC"));
        games.add(new VideoGame("GTA V", "PlayStation 5"));

        for (int i = 0; i < games.size(); i++) {
            Playable g = games.get(i);
            g.play();
            g.pause();
            g.stop();
            System.out.println();
        }

        BoardGame bg1 = new BoardGame("Монополия", 4);
        BoardGame bg2 = new BoardGame("Шахматы", 2);
        VideoGame vg1 = new VideoGame("Minecraft", "PC");
        VideoGame vg2 = new VideoGame("GTA V", "PlayStation 5");

        bg1.save();
        bg2.save();
        vg1.save();
        vg2.save();
        System.out.println();

        bg1.load();
        vg2.load();
        System.out.println();

        System.out.println(bg1.getName() + " сохранена: " + bg1.isSaved());
        System.out.println(bg2.getName() + " сохранена: " + bg2.isSaved());
        System.out.println(vg1.getName() + " сохранена: " + vg1.isSaved());
        System.out.println(vg2.getName() + " сохранена: " + vg2.isSaved());
    }
}
