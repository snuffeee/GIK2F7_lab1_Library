import java.lang.reflect.Array;
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
}
