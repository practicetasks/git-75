package arrays.example_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Performer performer = new Performer();
        performer.name = "David Bowie";
        performer.songs = new Song[3];

        Song song = new Song();
        song.title = "song1";
        song.genre = "rock";

        performer.addSong(song);
        song.display();

        System.out.println(Arrays.toString(performer.songs));
    }
}
