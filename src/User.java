public abstract class User {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private int borrowLimitGeneralBooks;
    private int borrowLimitAudioBooks;

    public User(int id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nAddress: " + address + "\nPhonenumber: " + phoneNumber;
    }
}
