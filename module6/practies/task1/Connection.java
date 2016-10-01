package practies.task1;

import practies.task2.User;

import java.io.File;

/**
 * Created by Stan on 19.09.2016.
 */
public class Connection {

    private static Connection INSTANCE;
    private static final User USER;

        static {
            USER = new User();
        }

 /*   static {
        INSTANCE = new Connection();
    }
  */


    private Connection() {
         }
    public static Connection getInstance(){
        if (INSTANCE ==null)INSTANCE = new Connection();
        return INSTANCE;
    }



}
