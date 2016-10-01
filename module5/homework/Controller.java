package homework;


public class Controller  {
    private API[] arrayOfApis = new API[3];

    public Controller() {

        BookingComAPI bookingComAPI = new BookingComAPI();
        arrayOfApis[0] = bookingComAPI;

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        arrayOfApis[1] = tripAdvisorAPI;

        GoogleAPI googleAPI = new GoogleAPI();
        arrayOfApis[2] = googleAPI;
    }

//______________________________________________________________________

   public Room[] requestRooms(int price, int persons, String city, String hotel ){

        Room[] room1 =  arrayOfApis[0].findRooms(price,persons,city,hotel);
        Room[] room2 =  arrayOfApis[1].findRooms(price,persons,city,hotel);
        Room[] room3 =  arrayOfApis[2].findRooms(price,persons,city,hotel);

       Room[] rooms = new Room[room1.length+room2.length+room3.length];
                int cout=0;
       for (int i = 0; i < room1.length; i++) {
           rooms[cout]=room1[i];
           cout++;
       }
       for (int i = 0; i < room1.length; i++) {
           rooms[cout]=room2[i];
           cout++;
       }
       for (int i = 0; i < room1.length; i++) {
           rooms[cout]=room3[i];
           cout++;
       }

    return rooms;
    }




       public Room[] check(API api1, API api2) {

        Room[] roomsFromApi1 = api1.getRooms();
        Room[] roomsFromApi2 = api2.getRooms();

           Room[] rooms = new Room[1000];
           int countRoom=0;
           for (int i = 0; i < roomsFromApi1.length; i++) {
               for (int j = 0; j < roomsFromApi2.length; j++) {
                   if (roomsFromApi1[i].equals(roomsFromApi2[j])){
                       rooms[countRoom]=roomsFromApi1[i];
                       countRoom++;
                   }
               }
           }
           rooms=deleteEmptyUsers(rooms);
    return rooms;

       }
    private static Room[] deleteEmptyUsers(Room[] users){
        int count=0;
        for(Room user:users){
            if(user!=null)count++;
        }
        Room[] afterUser=new Room[count];
        count=0;
        for(Room user:users){
            if(user!=null){
                afterUser[count]=user;
                count++;
            }
        }
        return afterUser;
    }
}
