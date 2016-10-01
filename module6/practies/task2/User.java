package practies.task2;

/**
 * Created by Stan on 19.09.2016.
 */
public class User {
    private static int counter = 0;

    public User() {
        counter+=1;
    }

    public static int getCounter() {
        return counter;
    }
}
