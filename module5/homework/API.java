package homework;

/**
 * Created by Stan on 18.09.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}
