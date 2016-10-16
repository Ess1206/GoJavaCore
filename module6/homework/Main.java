package homework;

/**
 * Created by Stan on 02.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        int[] testarray = new int[]{1, 2, 3, 4, 5, 6, 8};
        for (int aTestarray1 : testarray) {
            System.out.print(aTestarray1 + " ");

        }
        System.out.println();
        ArrayUtils.reverse(testarray);
        for (int aTestarray : testarray) {
            System.out.print(aTestarray + " ");
        }
        System.out.println();

        int[] newArr =ArrayUtils.findEvenElements(testarray);
        for (int aNewArr : newArr) {
            System.out.print(aNewArr + " ");
        }




        User user1 = new User(101, "First_name1" ,"Last_name1", 100 , 1000 );
        User user4 = new User(101, "First_name1" ,"Last_name1", 100 , 1000 );
        User user2 = new User(102, "First_name2" ,"Last_name2", 200 , 2000 );
        User user3 = new User(103, "First_name3" ,"Last_name3", 300 , 3000 );
        User user5 = new User(103, "First_name3" ,"Last_name3", 300 , 3000 );

        User[] users={user1,user2,user3,user4,user5};
        User[] uniqUsers = UserUtil.uniqueUsers(users);
        for (int i = 0; i <uniqUsers.length ; i++) {
            System.out.println(uniqUsers[i]);

        }

        UserUtil.usersWithContitionalBalance(uniqUsers,1000);
        UserUtil.paySalaryToUsers(uniqUsers);
        UserUtil.getUsersId(uniqUsers);




    }
}
