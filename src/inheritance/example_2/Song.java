package inheritance.example_2;

public class Song extends Media  {
    String performer;

    public Song(String title, String genre, int releaseYear, String performer) {
        super(title, genre, releaseYear);
        this.performer = performer;
    }

    @Override
    void display() {
        super.display();
        System.out.println("performer: " + performer);
        System.out.println();
    }
}
