package homework;

import java.util.Date;

/**
 * Created by Stan on 18.09.2016.
 */
public class Main {
    public static void main(String[] args) {


        Controller controller = new Controller();


        controller.requestRooms(401, 4, "Hotel 4", "City 4");
      /*  controller.requestRooms(13, 1,"city 2", "Horel 1");
        controller.requestRooms(501, 5, "Hotel 5", "City 5");
        controller.requestRooms(14, 45, "IUGYAse","Mistoland");


        loop(controller.check(new BookingComAPI(),new GoogleAPI()));
      */
      loop(controller.check(new BookingComAPI(),new TripAdvisorAPI()));


    }

    static void loop(Room[] rooms) {
        for (Room elements : rooms) {
            if(elements!=null)
                System.out.println(elements);
        }
        System.out.println("===================================================================\n");
    }


}
