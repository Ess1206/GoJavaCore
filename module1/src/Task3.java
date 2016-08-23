/**
 * Created by Stan on 20.08.2016.
 */
public class Task3 {

    static double getMoney (double commsion, double userMoney, double moneyOut){
        double moneyInBank = userMoney-commsion;

        if (userMoney < commsion) System.out.println("no enoth money");
        if (moneyInBank<moneyOut)System.out.println("no enoth money");
        if (moneyInBank>commsion){
            moneyInBank = moneyInBank-moneyOut-commsion;
            System.out.println(moneyInBank);
        }
        return moneyInBank;
    }

    public static void main(String[] args) {
        getMoney(1.5,100,5);
    }
}
