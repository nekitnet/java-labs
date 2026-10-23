public class BoardGame implements Playable, Saveable {
    private String name;
    private int players;
    private boolean saved;

    public BoardGame(String name, int players) {
        this.name = name;
        this.players = players;
        this.saved = false;
    }

    public void play() {
        System.out.println("Настольная игра " + name + " запущена, игроков: " + players);
    }

    public void pause() {
        System.out.println("Настольная игра " + name + " на паузе");
    }

    public void stop() {
        System.out.println("Настольная игра " + name + " остановлена");
    }

    public void save() {
        saved = true;
        System.out.println("Настольная игра " + name + " сохранена");
    }

    public void load() {
        System.out.println("Настольная игра " + name + " загружена");
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }

    public boolean isSaved() {
        return saved;
    }
}
