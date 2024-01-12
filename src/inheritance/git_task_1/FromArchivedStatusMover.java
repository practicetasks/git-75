package inheritance.git_task_1;

public class FromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        if (book.getStatus() != Status.ARCHIVED) {
            System.out.println("ERROR");
            return;
        }

        switch (requestedStatus) {
            case AVAILABLE -> {
                System.out.println("Изменен статус книги из " + book.getStatus() + " в статус " + requestedStatus);
                book.setStatus(requestedStatus);
            }
            default ->
                    System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + " невозможен");
        }

    }
}
