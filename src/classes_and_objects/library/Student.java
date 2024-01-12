package classes_and_objects.library;

public class Student {
    int id;
    String name;
    String history = "";
    Book borrowedBook;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Имя студента: " + name);
        System.out.println("Текущая книга: " + (borrowedBook != null ? borrowedBook.title : "null"));
        System.out.println("История: " + history);
    }
}

