public class Student extends User {

    public Student(int id, String name, String address, int phoneNumber, double debt) {
        super(id, name, address, phoneNumber, debt);

        this.setBorrowLimitGeneralBooks(2);
        this.setBorrowLimitAudioBooks(1);
    }

    public void borrowBook (Book book) {
        int borrowedGeneral = 0;
        int borrowedAudio = 0;

        if (book instanceof GeneralBook) {
            //setBorrowedGeneralBooks(+1);
        }
        if (book instanceof AudioBook) {
            //setBorrowedAudioBooks(+1);
        }

    }
}
