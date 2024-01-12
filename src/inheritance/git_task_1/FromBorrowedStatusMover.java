package inheritance.git_task_1;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.BORROWED){
            System.out.println("ERROR");
            return;
        }
        

        System.out.println("Изменен статус книги из " + book.getStatus() + " в статус " + requestedStatus);
        book.setStatus(requestedStatus);
    }
}
