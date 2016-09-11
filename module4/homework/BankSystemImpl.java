package homework;


public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount) / 100; //5 -> 0.05
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission) {
            //do logic if rules allow
            double newBalance = user.getBalance() - amount - amount * commission;
            user.setBalance(newBalance);
        }
        else System.out.println("can't do withdrawOfUser");
    }

    @Override
    public void fundUser(User user, int amount) {
        //if limit is ok - do funding - if no do nothing

        if (user.getBank().getLimitOfWithdrawal()<=amount) System.out.println(user+"is fund");
        else System.out.println("nothing to do for this" + user);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //fromUser balance - amount - commission
        //toUser balance + amount
        fromUser.setBalance(fromUser.getBalance()- amount - fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance()+amount);
        }

    @Override
    public void paySalary(User user) {
        //user balance + salary - commision
        user.setBalance(user.getSalary()-user.getBank().getCommission(user.getSalary()));
    }
}