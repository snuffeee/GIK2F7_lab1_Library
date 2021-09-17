import java.util.ArrayList;

public class Library {
    private String name;
    private String address;
    private String email;
    private int phoneNumber;
    private ArrayList<Book> bookList;
    private ArrayList<User> userList;


    public Library(String name, String address, String email, int phoneNumber, ArrayList<Book> bookList, ArrayList<User> userList) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bookList = bookList;
        this.userList = userList;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    // Library methods
    public void addUser (User user) {
        userList.add(user);
        System.out.println("User was added successfully!");
    }

    public void deleteUser (User user) {
        if (userList.contains(user)) {
            userList.remove(user);
            System.out.println("User: " + user.getName() + " was deleted successfully!");
            }
        else {
            System.out.println("The user was not found!");
        }
    }

    public void updateUserDetails (User user, int updateId, String updateName, String updateAddress, int updatePhoneNumber) {
        user.setId(updateId);
        user.setName(updateName);
        user.setAddress(updateAddress);
        user.setPhoneNumber(updatePhoneNumber);
        System.out.println("User updated successfully!");
    }

    public void addBook (Book book) {
        bookList.add(book);
    }

}
