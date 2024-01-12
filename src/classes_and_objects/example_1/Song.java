package classes_and_objects.example_1;

public class Song {
    String title;
    int duration;
    Performer performer;


    void display(){
        System.out.println("Название песни: " + title);
        System.out.println("Продолжительность: " + duration);
        System.out.println("Исполнитель: " + performer.name);
    }
}
