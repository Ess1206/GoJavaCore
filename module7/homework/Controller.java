package homework;

import java.util.*;

/**
 * Created by Stan on 31.10.2016.
 */
public class Controller {

    static void deleteDublicaes(List<Order> orders) {
        new HashSet<>(orders);
    }

    static List<Order> deleteItems(List<Order> orders, int price) {

        Iterator<Order> itr = orders.iterator();

        while (itr.hasNext()) {

            //int p = itr.next().getPrice();
            if (itr.next().getPrice() < price)
                itr.remove();
        }
        return orders;
    }


    static List<List<Order>> seporOrders(List<Order> orders) {

        Iterator<Order> irt = orders.iterator();

        List<List<Order>> listsOfCurrency = new ArrayList<>();
        List<Order> uahOrders = new ArrayList<>();
        List<Order> usdOrders = new ArrayList<>();

        listsOfCurrency.add(uahOrders);
        listsOfCurrency.add(usdOrders);

        while (irt.hasNext()) {
            Order order = irt.next();
            if (order.getCurrency() == Currency.UAH) {
                uahOrders.add(order);

            }
            if (order.getCurrency() == Currency.USD) {
                usdOrders.add(order);

            }

        }
        System.out.println("uahOrders");
        System.out.println(uahOrders);


        System.out.println("usdOrders");
        System.out.println(usdOrders);
        return listsOfCurrency;
    }

    static Map<String, List<User>> seporateUserByCity(List<User> users) {
        Map<String, List<User>> listOFCity = new HashMap<>();
        for (User u:users) {
            String city = u.getCity();
            if (listOFCity.containsKey(city)){
                listOFCity.get(city).add(u);
            }else {
                List<User> user = new ArrayList<>();
                user.add(u);
                listOFCity.put(city,user);
            }
        }
        System.out.println(listOFCity);

        return listOFCity;
    }
}