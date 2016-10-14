package practies;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Stan on 03.10.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        Set<User> users= new TreeSet<>();
        users.add(new User("name11",10));
        users.add(new User("name21",12));
        users.add(new User("name 3",23));
        users.add(new User("name 3",23));
        users.add(new User("name 3",23));
        users.add(new User("name 3",23));
        users.add(new User("name 3",23));
        users.add(new User("name43",34));

        System.out.println(users);

        Set<User> users1= new HashSet<>();
        users1.add(new User("name11",10));
        users1.add(new User("name21",12));
        users1.add(new User("name 3",23));
        users1.add(new User("name 3",23));
        users1.add(new User("name 3",23));
        users1.add(new User("name 3",23));
        users1.add(new User("name 3",23));
        users1.add(new User("name43",34));

        System.out.println(users1);


    }
}
