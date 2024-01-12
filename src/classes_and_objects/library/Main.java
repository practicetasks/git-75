package classes_and_objects.library;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Библиотеки
        Library library = new Library();

        // Создаем объект Книги
        Book book = new Book();
        book.id = 1;
        book.title = "1984";
        book.author = "George Orwell";

        // Устанавливаем книгу в Библиотеку
        library.availableBook = book;

        // Создаем объект Студента
        Student student = new Student();
        student.id = 1;
        student.name = "Dima";

        // Передаем книгу Студенту
        library.lendBookStudent(student);
        student.display();

        // Студент возвращает книгу в Библиотеку
        library.returnBookStudent(student);
        student.display();


        // Создаем объект Студента
        Student student1 = new Student();
        student1.id = 2;
        student1.name = "Denis";

        // Передаем книгу Студенту
        library.lendBookStudent(student1);
        student1.display();


        // Создаем объект Книги
        Book book1 = new Book();
        book1.id = 2;
        book1.title = "Harry Potter: The Goblet of Fire";
        book1.author = "Joanne Rowling";

        // Устанавливаем книгу в Библиотеку
        library.availableBook = book1;

        library.lendBookStudent(student);
        student.display();
        library.returnBookStudent(student);
        student.display();
    }
}
