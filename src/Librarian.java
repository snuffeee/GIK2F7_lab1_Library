public class Librarian {


    public void issueBook(){
    }

    public void returnBook(){
    }

    public void collectFine(User user, int amountFine) {
        user.payFine(amountFine);
    }

    public void searchBook(Library library, Book book) {
        if (library.getBookList().contains(book)) {
            System.out.println(book.toString());
        } else {
            System.out.println("The book your were looking for was not found!");
        }
    }

    public void issueMembership(){
    }


}
