public class Main {

    public static void main(String[] args) {

        // Create 4 book objects
        GeneralBook book1 = new GeneralBook("A45C","Game of Thrones","George RR Martin",1996,BookStatus.AVAILABLE,694);
        GeneralBook book2 = new GeneralBook("AD45","A Clash of Kings", "George RR Martin",1999,BookStatus.ORDERED,768);
        AudioBook book3 = new AudioBook("AG45","A Storm of Swords","George RR Martin",2000,BookStatus.REMOVED,2857);
        ReferenceBook book4 = new ReferenceBook("JD47","A Dream of Spring","George RR Martin",2025,BookStatus.UNAVAILABLE,877);

        // Create 4 Users of both Student and Faculty
        Faculty faculty1 = new Faculty(1,"Arthur Morgan","Horseshoe Overlook",073111222,0);
        Faculty faculty2 = new Faculty(2,"Kalle Anka","Ankvägen 37",056123123,1550);

        Student student1 = new Student(3,"Dexter Morgan","Miami Gate 1674",0243223344,120.5);
        Student student2 = new Student(4,"Patrick Bateman","New York, WTC",01104343,5680);

        // Create Library object
        Library libraryBorlange = new Library("Borlänge Bibliotek","Borlängevägen 1337","borlangebibliotek@ghotmail.com",076123123);

        // Add Books and Users to approprivate ArrayLists
        libraryBorlange.addBook(book1);
        libraryBorlange.addBook(book2);
        libraryBorlange.addBook(book3);
        libraryBorlange.addBook(book4);
        System.out.println("");

        libraryBorlange.addUser(faculty1);
        libraryBorlange.addUser(faculty2);
        libraryBorlange.addUser(student1);
        libraryBorlange.addUser(student2);

        // Example of library methods
        System.out.println("");
        libraryBorlange.updateBook(book1,"44GG","Mindhunter","Douglas",2002,BookStatus.AVAILABLE);
        System.out.println("");
        libraryBorlange.deleteBook(book1);
        System.out.println("");

        // Print the avaiable books and users
        System.out.println("\nAll books:\n" + libraryBorlange.getBookList().toString());
        System.out.println("\nAll users:\n" + libraryBorlange.getUserList().toString());









    }

}
