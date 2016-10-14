package homework;

/**
 * Created by Stan on 02.10.2016.
 */
public class UserUtil {

    static User[] uniqueUsers(User[] users) {

//
        int countOFuniqueUsers = 0;
        System.out.println();
        System.out.println("initial Array");
        for (int i = 0; i < users.length - 1; i++) {
            for (int j = 1; j < users.length; j++) {
                if (!users[i].equals(users[j])) countOFuniqueUsers++;

            }
    //        System.out.println(users[i]);
        }
      //  System.out.println();
       // System.out.println("unique Array");

        User[] uniqueUser = new User[countOFuniqueUsers];
        uniqueUser[0]=users[0];
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (i!=j&&!users[i].equals(users[j])){
                    uniqueUser[i]=users[i];
         //           System.out.println(uniqueUser[i]);
                }

            }
        }


        return uniqueUser;
    }
    //users are equal when all their field are equal
/*

    User[] usersWithContitionalBalance(User[] users, int balance){

    }

    //user’s balance == balance
    User[] paySalaryToUsers(User[] users)

    long[] getUsersId(User[] users)

    User[] deleteEmptyUsers(User[] users)
*/
}
