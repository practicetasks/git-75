package classes_and_objects.example_1;

public class Main {
    public static void main(String[] args) {
        Performer performer = new Performer();
        performer.name = "David Bowie";

        Song song1 = new Song();
        song1.title = "song1";
        song1.duration = 90;
        song1.performer = performer;

        Song song2 = new Song();
        song2.title = "song2";
        song2.duration = 180;
        song2.performer = performer;

        song1.display();
        song2.display();


    }
}
