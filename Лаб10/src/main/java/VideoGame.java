public class VideoGame implements Playable, Saveable {
    private String name;
    private String platform;
    private boolean saved;

    public VideoGame(String name, String platform) {
        this.name = name;
        this.platform = platform;
        this.saved = false;
    }

    public void play() {
        System.out.println("Видеоигра " + name + " запущена на " + platform);
    }

    public void pause() {
        System.out.println("Видеоигра " + name + " на паузе");
    }

    public void stop() {
        System.out.println("Видеоигра " + name + " остановлена");
    }

    public void save() {
        saved = true;
        System.out.println("Видеоигра " + name + " сохранена");
    }

    public void load() {
        System.out.println("Видеоигра " + name + " загружена");
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isSaved() {
        return saved;
    }
}
