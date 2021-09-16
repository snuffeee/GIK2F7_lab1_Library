public class Faculty extends User {

    public Faculty(int id, String name, String address, String phoneNumber, int debt) {
        super(id, name, address, phoneNumber, debt);

        this.setBorrowLimitGeneralBooks(5);
        this.setBorrowLimitAudioBooks(2);
    }
}
