package inheritance.git_task_1;

public class Book {
    private String title;
    private Status status;

    public Book(String title) {
        this.title = title;
        this.status = Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
