public class Student extends User {

    public Student(int id, String name, String address, String phoneNumber, double debt) {
        super(id, name, address, phoneNumber, debt);

        this.setBorrowLimitGeneralBooks(2);
        this.setBorrowLimitAudioBooks(1);
    }
}
