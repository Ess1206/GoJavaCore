/**
 * Created by Stan on 20.08.2016.
 */
public class Task2 {

    static int count(int[] array , int n) {
        int k = 0;
        for (int i : array) {
            if (i == n) {
                k++;
            }
        }
        return k;
    }



    public static void main(String[] args) {
        int[] array= {12, 42, 45, 545, 213, 42};
        int n = 42;
        int result = count(array,n);

        if (result==1)System.out.println("yes");
        if (result==0) System.out.println("no");
        if (result>1) System.out.println(result);

    }
}
