/**
 * Created by Stan on 23.08.2016.
 */
public class Task4 {

static int[] balances = {1200, 250, 2000, 500, 3200};
static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownerName, double fund) {
        double balanceAfter = 0;

        for (int i=0; i<ownerNames.length; i++){
            if (ownerNames[i]==ownerName) {
                balanceAfter = balances[i] + fund;
            }

        }
        if (balanceAfter==0) System.out.println(ownerName+" out of list owners");

        return balanceAfter;
    }

    public static void main(String[] args) {

        String ownerName = "Oww";
        double fund = 100;
        System.out.println(ownerName+" "+fundBalance(ownerName, fund));

    }
}
