public class ClassicalSong extends Music {
    private String orchestra;

    public ClassicalSong(String title, String artist, int duration, String orchestra) {
        super(title, artist, duration);
        this.orchestra = orchestra;
    }

    public String getGenre() {
        return "Классика";
    }

    public void conduct() {
        System.out.println("Дирижер управляет оркестром: " + orchestra);
    }
}
