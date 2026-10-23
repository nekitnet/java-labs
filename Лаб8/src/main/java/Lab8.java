public class Lab8 {
    public static void main(String[] args) {
        Music[] playlist = new Music[5];
        playlist[0] = new RockSong("Bohemian Rhapsody", "Queen", 6, true);
        playlist[1] = new RockSong("Stairway to Heaven", "Led Zeppelin", 8, true);
        playlist[2] = new RockSong("Smells Like Teen Spirit", "Nirvana", 5, false);
        playlist[3] = new ClassicalSong("Симфония №5", "Бетховен", 7, "Берлинский оркестр");
        playlist[4] = new ClassicalSong("Времена года", "Вивальди", 8, "Венский оркестр");

        for (int i = 0; i < playlist.length; i++) {
            playlist[i].displayInfo();
            System.out.println();
        }

        for (int i = 0; i < playlist.length; i++) {
            Music song = playlist[i];
            if (song instanceof RockSong) {
                System.out.print(song.getTitle() + ": ");
                ((RockSong) song).playSolo();
            } else if (song instanceof ClassicalSong) {
                System.out.print(song.getTitle() + ": ");
                ((ClassicalSong) song).conduct();
            }
        }
    }
}

