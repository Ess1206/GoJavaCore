/**
 * Created by Stan on 24.08.2016.
 */
public class Task2 {
    //HOMEWORK 2.1

    static double commission;
    static double withdrawBalance(double balance, double withdrawal) {
      commission = withdrawal/20;

        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {

        double balanceAfter = withdrawBalance(100,99);



        if(balanceAfter >= 0) {
            System.out.println("ok");
            System.out.println(commission);
            System.out.println(balanceAfter);
        }
        else {
            System.out.println("no");
        }
    }


}
