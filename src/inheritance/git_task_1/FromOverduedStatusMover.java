package inheritance.git_task_1;

public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED, AVAILABLE -> {
                System.out.println("Изменен статус книги из " + book.getStatus() + " в статус " + requestedStatus);
                book.setStatus(requestedStatus);
            }
            default ->
                    System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + " невозможен");
        }
    }
}
