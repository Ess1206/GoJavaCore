package homework;


public class Main {
    public static void main(String[] args) {
        //BankSystemImpl -> User -> Bank

        Bank usBank = new USBank();
        Bank euBank = new EUBank();
        Bank chBank = new ChinaBank();

        //top level of abstraction, we run all methods through it
        BankSystem bankSystem = new BankSystemImpl(); //better
        //BankSystemImpl bankSystem1 = new BankSystemImpl();


//User1____________________________________________________________________

        User user1 = new User();
        usBank.setCurrency(Currency.EUR);
        user1.setName("User1");
        user1.setBalance(5000);
        user1.setBank(usBank);

        System.out.println(user1);

        System.out.println("do withdrawOfUser");
        bankSystem.withdrawOfUser(user1, 1100);

        System.out.println(user1);
        System.out.println("________________________________________________");

//User2____________________________________________________________________
        euBank.setCurrency(Currency.USD);
        User user2 = new User("User2",5500,euBank);
        System.out.println(user2);
        euBank.setCurrency(Currency.USD);
        user2.setSalary(1000);
        System.out.println(user2);
        System.out.println("________________________________________________");

//User2____________________________________________________________________
        chBank.setCurrency(Currency.EUR);
        User user3 = new User();
        user3.setName("User3");
        user3.setBank(chBank);
        user3.setBalance(8000);
        user3.setCompanyName("HP");
        user3.setSalary(200);
        System.out.println(user3);
        System.out.println("paySalary to user 3");
        bankSystem.paySalary(user3);
        System.out.println(user3);
        System.out.println("User3 transferMoney 1000 to user1");
        System.out.println(user1);
        bankSystem.transferMoney(user3,user1,1000);
        System.out.println("User 1" +user1);
        System.out.println("User 3" +user3);

    }

}