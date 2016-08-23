/**
 * Created by Stan on 19.08.2016.
 */
public class Task1 {

    static int  balanceSum (int[] balances){

        int sum = 0;
        for (int balabce : balances){
            if (balabce>10 && balabce<50){
                sum+=balabce;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] balances = {12 , 20 , 25, 50 ,90};
        int[] balances1 = {11 , 23 , 35, 40 ,80};
        System.out.println(balanceSum(balances));
        System.out.println(balanceSum(balances1));
    }

}
