package homeWork.task3;

/**
 * Created by Stan on 31.08.2016.
 */
public class SpecialStudent extends CollegeStudent {


    private  long secretKey;
    private  String email;

    public SpecialStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id, long secretKey) {
        super(lastName, coursesTaken, collegeName, rating, id);
        this.secretKey = secretKey;
    }


    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public String getEmail() {
        return email;
    }
}
