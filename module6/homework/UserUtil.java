package homework;

/**
 * Created by Stan on 02.10.2016.
 */
public class UserUtil {

    static User[] uniqueUsers(User[] users) {
        System.out.println("initial Array");
        int countOFuniqueUsers = users.length;
        System.out.println();
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    users[i] = null;
                    countOFuniqueUsers--;
                    break;
                }
            }
        }
        System.out.println("unique Array");

        User[] uniqueUser = new User[countOFuniqueUsers];
        for (int i = 0; i < users.length; i++) {
            if (!(users[i] ==null)){
                    uniqueUser[countOFuniqueUsers-1]=users[i];
                    countOFuniqueUsers--;
                }
            }
        return uniqueUser;
    }



    static  User[] usersWithContitionalBalance(User[] users, int balance){
        System.out.println();
        System.out.println("usersWithContitionalBalance "+balance);
        for (User user : users) {
            if (user.getBalance() == balance) System.out.println(user);
        }

        return users;
    }

    static User[] paySalaryToUsers(User[] users){
        for (User user : users) {
            user.setBalance(user.getBalance()+user.getSalary());
            System.out.println(user);
        }
        return users;

    }

    static long[] getUsersId(User[] users){
        long[] id = new long[users.length];
        for (int i = 0; i < id.length; i++) {
            id[i]=users[i].getId();
            System.out.println(users[i].getFirstName()+" "+users[i].getId());
        }
    return id;
    }

}
