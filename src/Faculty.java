public class Faculty extends User {

    public Faculty(int id, String name, String address, int phoneNumber, int debt) {
        super(id, name, address, phoneNumber, debt);

        this.setBorrowLimitGeneralBooks(5);
        this.setBorrowLimitAudioBooks(2);
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
