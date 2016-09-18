package homework;



/**
 * Created by Stan on 18.09.2016.
 */
public class BookingComAPI implements API{

    private Room[] rooms = new Room[5];

    public BookingComAPI(Room[] rooms) {
        Room room1 = new Room(1001, 100, 1, "Hotel 1", "City 1");
        rooms[0] = room1;
        Room room2 = new Room(2002, 201, 2, "Hotel 2", "City 2");
        rooms[1] = room2;
        Room room3 = new Room(3003, 301, 3, "Hotel 3", "City 3");
        rooms[2] = room3;
        Room room4 = new Room(4004, 401, 4, "Hotel 4", "City 4");
        rooms[3] = room4;
        Room room5 = new Room(5005, 501, 5, "Hotel 5", "City 5");
        rooms[4] = room5;

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
