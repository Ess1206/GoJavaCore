package homework;

/**
 * Created by Stan on 18.09.2016.
 */
public class TripAdvisorAPI implements API {

    private Room rooms[];

    TripAdvisorAPI() {

        Room rg1=new Room(134, 100, 1, "Hotel 1", "City 1");
        Room rg2=new Room(513, 14, 45, "IUGYAse","Mistoland");
        Room rg3=new Room(4004, 401, 4, "Hotel 4", "City 4");
        Room rg4=new Room(142, 44, 25, "IUGYAse","Mistoland");
        Room rg5=new Room(412, 74, 15, "IUGYAse","Mistoland");

        rooms=new Room[]{rg1,rg2,rg3,rg4,rg5};
    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room foundRoom[]=new Room[10];
        int cout=0;
        for(Room item:rooms){
            boolean cvr=item.getPrice()==price && item.getPersons()==persons;
            boolean cvr1= city==item.getCity() && item.getHotelName()==hotel;

            if(cvr&&cvr1){
                foundRoom[cout]=item;
                cout++;
            }
        }
        if(foundRoom==null){
            foundRoom[0]=new Room(0,0,0, "Nothing","Nothing");
        }
        return foundRoom;
    }

    @Override
    public Room[] getRooms() {
        return new Room[0];
    }

    public void setRooms(Room[] rooms){
        this.rooms = rooms;
    }


}
