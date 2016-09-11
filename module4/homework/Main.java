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


    }
}