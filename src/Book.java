public abstract class Book {
    private String id;
    private String title;
    private String author;
    private int publishingYear;
    private BookStatus bookStatus;

    public Book(String id, String title, String author, int publishingYear, BookStatus bookStatus) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.bookStatus = bookStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nPublishing Year: " + publishingYear + "\nBook status: " + bookStatus;
    }
}
