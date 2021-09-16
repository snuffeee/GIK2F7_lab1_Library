public class Student extends User {

    public Student(int id, String name, String address, String phoneNumber) {
        super(id, name, address, phoneNumber);

        this.setBorrowLimitGeneralBooks(2);
        this.setBorrowLimitAudioBooks(1);
    }
}
