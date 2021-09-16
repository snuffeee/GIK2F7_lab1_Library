public class AudioBook extends Book {
    private double durationMinutes;

    public AudioBook(String id, String title, String author, int publishingYear, BookStatus bookStatus, double durationMinutes) {
        super(id, title, author, publishingYear, bookStatus);
        this.durationMinutes = durationMinutes;
    }
}
