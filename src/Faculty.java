public class Faculty extends User {

    public Faculty(int id, String name, String address, String phoneNumber) {
        super(id, name, address, phoneNumber);

        this.setBorrowLimitGeneralBooks(5);
        this.setBorrowLimitAudioBooks(2);
    }
}
