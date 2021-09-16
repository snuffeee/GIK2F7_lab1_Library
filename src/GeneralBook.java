public class GeneralBook extends Book {
    private int pageNumbers;

    public GeneralBook(String id, String title, String author, int publishingYear, BookStatus bookStatus, int pageNumbers) {
        super(id, title, author, publishingYear, bookStatus);
        this.pageNumbers = pageNumbers;
    }
}
