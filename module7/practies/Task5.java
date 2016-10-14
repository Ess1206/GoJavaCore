package practies;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Stan on 03.10.2016.
 */
public class Task5 {
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

        System.out.println("iteraror");
        Iterator<User> iterator = users.iterator();
        /*
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/


        System.out.println("forich");
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("remove age = 10");

        while (iterator.hasNext()){
            if (iterator.next().getAge()==10)iterator.remove();
        }

        System.out.println(users);
    }
}
