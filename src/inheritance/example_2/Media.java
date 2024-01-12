package inheritance.example_2;

public class Media {
    String title;
    String genre;
    int releaseYear;

    public Media(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    void display() {
        System.out.println("title: " + title);
        System.out.println("genre: " + genre);
        System.out.println("releaseYear: " + releaseYear);
    }
}
