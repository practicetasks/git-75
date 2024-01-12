package classes_and_objects;

public class LibraryBook {
    String title;
    String author;
    boolean isAvailable;
    String borrower;
    int daysBorrowed;

    // Метод для заимствования книги
    void borrow(String personName, int days) {
        System.out.println(personName);
        if (isAvailable) {
            isAvailable = false;
            borrower = personName;
            daysBorrowed = days;
            System.out.println(personName + " заимствовал(а) книгу \"" + title + "\" на " + days + " дней.");
        } else {
            System.out.println("Книга \"" + title + "\" уже заимствована.");
        }
    }

    // Метод для возврата книги
    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(borrower + " вернул(а) книгу \"" + title + "\".");
            // Проверка на просрочку
            if (daysBorrowed < 0) {
                System.out.println("Внимание! Книга возвращена с опозданием на " + (-daysBorrowed) + " дней.");
            }
            borrower = null;
            daysBorrowed = 0;
        } else {
            System.out.println("Книга \"" + title + "\" не была заимствована.");
        }
    }

    // Метод для обновления статуса просроченных дней
    void updateDaysBorrowed() {
        if (!isAvailable) {
            daysBorrowed--;
            if (daysBorrowed < 0) {
                System.out.println("Книга \"" + title + "\" просрочена. Необходимо вернуть книгу в библиотеку!");
            }
        }
    }

    // Метод для печати статуса книги
    void printStatus() {
        String status = isAvailable ? "доступна" : "заимствована " + borrower + ", дней осталось: " + daysBorrowed;
        System.out.println("Книга \"" + title + "\" " + status);
    }
}
