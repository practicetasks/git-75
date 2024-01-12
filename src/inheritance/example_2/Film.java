package inheritance.example_2;

public class Film extends Media {
    double rating;

    public Film(String title, String genre, int releaseYear, double rating) {
        super(title, genre, releaseYear);
        this.rating = rating;
    }


    @Override
    void display() {
        super.display();
        System.out.println("rating: " + rating);
    }
}
