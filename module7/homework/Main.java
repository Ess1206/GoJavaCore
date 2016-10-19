package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Stan on 16.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("HM 7");

        List<User> users = new ArrayList<>();
        users.add(new User(10001,"firstName 1","lastName 1","city 1",1000));
        users.add(new User(10002,"firstName 2","lastName 2","city 2",2000));
        users.add(new User(10003,"firstName 3","lastName 3","city 3",3000));
        users.add(new User(10004,"firstName 4","lastName 4","city 4",4000));
        users.add(new User(10005,"firstName 5","lastName 5","city 15",5000));
        users.add(new User(10006,"firstName 6","lastName 6","city 6",6000));
        users.add(new User(10007,"firstName 7","lastName 7","city 7",7000));
        users.add(new User(10008,"firstName 8","lastName 8","city 8",8000));
        users.add(new User(10009,"firstName 9","lastName 9","city 9",9000));
        users.add(new User(10010,"firstName 10","lastName 10","city 0",10000));

        //System.out.println(users.get(0));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(110000, 10000, Currency.UAH , "item name 10", " item Shop 1", users.get(0)));
        orders.add(new Order(110011, 11111, Currency.USD , "item name 1", " item Shop 1", users.get(1)));
        orders.add(new Order(220022, 22222, Currency.UAH , "item name 2", " item Shop 2", users.get(2)));
        orders.add(new Order(330033, 33333, Currency.USD , "item name 3", " item Shop 3", users.get(3)));
        orders.add(new Order(440044, 44444, Currency.USD , "item name 4", " item Shop 4", users.get(4)));
        orders.add(new Order(550055, 55555, Currency.UAH , "item name 5", " item Shop 5", users.get(5)));
        orders.add(new Order(660066, 66666, Currency.USD , "item name 6", " item Shop 6", users.get(6)));
        orders.add(new Order(110077, 77777, Currency.USD , "item name 7", " item Shop 7", users.get(7)));
        orders.add(new Order(110088, 88888, Currency.UAH , "item name 8", " item Shop 8", users.get(8)));
        orders.add(new Order(110099, 99999, Currency.USD , "item name 9", " item Shop 9", users.get(9)));


        System.out.println(orders+"\n");
        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order order1, Order order2) {
                return order2.getPrice()- order1.getPrice();
            }
        });
        System.out.println(orders);


        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order order1, Order order2) {
                return order1.getUser().getCity().compareTo(order1.getUser().getCity());
            }
        });

        System.out.println(orders);


    }
}
