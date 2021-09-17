import java.util.ArrayList;

public abstract class User {
    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    private double fineAmount;
    private ArrayList<Book> borrowedBooks;
    private int borrowLimitGeneralBooks;
    private int borrowLimitAudioBooks;

    public User(int id, String name, String address, int phoneNumber, double fineAmount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.fineAmount = fineAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setDebt(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public int getBorrowLimitGeneralBooks() {
        return borrowLimitGeneralBooks;
    }

    public void setBorrowLimitGeneralBooks(int borrowLimitGeneralBooks) {
        this.borrowLimitGeneralBooks = borrowLimitGeneralBooks;
    }

    public int getBorrowLimitAudioBooks() {
        return borrowLimitAudioBooks;
    }

    public void setBorrowLimitAudioBooks(int borrowLimitAudioBooks) {
        this.borrowLimitAudioBooks = borrowLimitAudioBooks;
    }

    public abstract void borrowBook(Book book);

    public void returnBook(){
    }

    public void payFine(int amount) {
        fineAmount = fineAmount - amount;
    }

    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nAddress: " + address + "\nPhonenumber: " + phoneNumber + "\nDebt owed: " + fineAmount + " USD\n";
    }
}
