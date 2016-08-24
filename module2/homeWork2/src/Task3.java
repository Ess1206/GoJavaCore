
/**
 * Created by Stan on 23.08.2016.
 */
public class Task3 {
    //HOMEWORK 2.2

static int[] balances = {1200, 250, 2000, 500, 3200};
static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


static double withdrawBalance(String ownerName, double withdrawal) {
        double commission=withdrawal/20;
        double balanceAfter = 0;

        for (int i=0; i<ownerNames.length; i++){
            if (ownerNames[i]==ownerName) {
                balanceAfter = balances[i] - withdrawal - commission;
            }
        }

        if(balanceAfter >= 0) {
            System.out.print(ownerName+" "+ withdrawal+" ");
        }
        else {
            System.out.println("no");
        }
        return balanceAfter;
    }

    public static void main(String[] args) {


        String ownerName = "Ann";
        double withdrawal = 100;

        System.out.println(withdrawBalance(ownerName,withdrawal));

    }
}
