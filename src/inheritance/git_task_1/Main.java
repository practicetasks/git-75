package inheritance.git_task_1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover statusMover = new FromAvailableStatusMover();
        System.out.println(book.getStatus());
        statusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());

        statusMover = new FromArchivedStatusMover();
        statusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());

    }
}
