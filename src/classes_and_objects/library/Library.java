package classes_and_objects.library;

public class Library {
    Book availableBook;

    void lendBookStudent(Student student) {
        if (availableBook != null && student.borrowedBook == null) {
            student.borrowedBook = availableBook;
            System.out.println("Передали студенту " + student.name + " книгу '" + availableBook.title + "'");
            availableBook = null;
        } else {
            System.out.println("Ошибка: не получилось передать книгу студенту " + student.name);
        }
    }

    void returnBookStudent(Student student) {
        if (availableBook == null && student.borrowedBook != null){
            availableBook = student.borrowedBook;
            System.out.println("Студент по имени " + student.name + " возвращает книгу '" + student.borrowedBook.title + "' в библиотеку");
            student.history += student.borrowedBook.title + " ";
            student.borrowedBook = null;
        }  else {
            System.out.println("Ошибка: студент " + student.name + " не смог возвращать книгу");
        }
    }
}
