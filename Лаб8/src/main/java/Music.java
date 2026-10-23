public class Music {
    private String title;
    private String artist;
    private int duration;

    public Music(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getGenre() {
        return "Неизвестный жанр";
    }

    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Исполнитель: " + artist);
        System.out.println("Длительность: " + duration + " мин");
        System.out.println("Жанр: " + getGenre());
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }
}
