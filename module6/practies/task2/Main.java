package practies.task2;

/**
 * Created by Stan on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(User.getCounter() + " id first counter");
        new User();
        new User();
        new User();
        new User();
        new User();
        System.out.println(User.getCounter()+" last counter");
    }
}
