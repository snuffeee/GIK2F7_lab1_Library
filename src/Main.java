import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1,"Jens Holmberg","Lol123", "073-12312313",150.5);
        Student student2 = new Student(2,"Jens Holmberg","Lol123", "073-12312313",150.5);
        ArrayList<User> userList = new ArrayList();
        userList.add(student1);
        userList.add(student2);
        userList.remove(student1);


        // Kommentar för att se om GitHub fungerar korrekt!

        GeneralBook book1 = new GeneralBook("AD123","Game of Thrones","George RR Martin",1996,BookStatus.AVAILABLE,567);
        //Library library1 = new Library("Bibliotek asdasdasd","Borlänge 123","asdasdsad@gmail.com",04343434);

        ArrayList<Book> lista = new ArrayList<>();
        ArrayList<GeneralBook> bookList = new ArrayList<>();
        bookList.add(book1);
        lista.add(book1);




        //Librarian librarian1 = new Librarian("Kalle 123","Borlänge 1337","kalle@gmail.com",0730561231);




        System.out.println(userList.toString());
        System.out.println(book1.toString());





    }

}
