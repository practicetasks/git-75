package arrays.example_4;

public class Performer {
    String name;
    Song[] songs;

    void addSong(Song song) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] == null) {
                // Сохра
                songs[i] = song;
                song.performerName = name;
                return;
            }
        }
        System.out.println("Песня не добавлена");
    }
}
