public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1,"Jens Holmberg","Lol123", "073-12312313");
        student1.setAddress("lol456");

        // Kommentar för att se om GitHub fungerar korrekt!

        // Ny kommentar för att uppdatera i GitHub!

        GeneralBook book1 = new GeneralBook("AD123","Game of Thrones","George RR Martin",1996,BookStatus.AVAILABLE,567);

        System.out.println(student1.toString());
        System.out.println(book1.toString());




    }

}
