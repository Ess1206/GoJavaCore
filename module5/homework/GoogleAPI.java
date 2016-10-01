package homework;

/**
 * Created by Stan on 18.09.2016.
 */
public class GoogleAPI implements API {
    private Room rooms[];

    GoogleAPI() {

        Room rg1=new Room(134, 24, 55, "IUGYAse","Mistoland");
        Room rg2=new Room(513, 14, 45, "IUGYAse","Mistoland");
        Room rg3=new Room(213, 24, 35, "IUGYAse","Mistoland");
        Room rg4=new Room(142, 44, 25, "IUGYAse","Mistoland");
        Room rg5=new Room(4004, 401, 4, "Hotel 4", "City 4");

        rooms=new Room[]{rg1,rg2,rg3,rg4,rg5};
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room foundRoom[] = new  Room[10];
        for (Room item : rooms) {
            boolean cvr = item.getPrice()==price && item.getPersons()==persons;
            boolean cvr1 = item.getCity() == city && item.getHotelName() ==hotel;
            int count = 0;
            if (cvr && cvr1){
                foundRoom[count]=item;
                count++;
            }
        }
        return foundRoom;
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }

    public void setRoom(Room[] rooms){
        this.rooms = rooms;
    }

}
