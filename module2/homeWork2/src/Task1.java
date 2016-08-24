/**
 * Created by Stan on 23.08.2016.
 */
public class Task1 {

    static int sum(int array[]){

        int sum=array[0];
        for (int i=1; i<array.length; i++) {
            sum += array[i];
            }
    return sum;
    }

    static double sum(double array[]){
        double sum=array[0];
        for (int i=1; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int intMin(int array[]){
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            if (min>array[i])min=array[i];
        }
        return min;
    }

    static double doubleMin(double array[]){
        double min = array[0];
        for (int i=1; i<array.length; i++) {
            if (min>array[i])min=array[i];
        }
        return min;
    }

    static int intMax(int array[]){
        int max = array[0];
        for (int i=1; i<array.length; i++) {
            if (max<array[i])max=array[i];
        }
        return max;
    }
    static double doubleMax(double array[]){
        double max = array[0];
        for (int i=1; i<array.length; i++) {
            if (max<array[i])max=array[i];
        }
        return max;
    }

    static int intMaxPositive(int array[]){
        int max = array[0];
        int maxPositive=0;
        for (int i=1; i<array.length; i++) {
            if (max<array[i])max=array[i];
        }
        if (max>0)maxPositive = max;
        if (max<=0) System.out.println("no Positive");

        return maxPositive;
    }
    static double doubleMaxPositive(double array[]){
        double max = array[0];
        double maxPositive = 0;

        for (int i=1; i<array.length; i++) {
            if (max<array[i])max=array[i];
        }
        if (max>0)maxPositive = max;
        if (max<=0) System.out.println("no Positive");

        return maxPositive;
    }


    static long multiplication(int array[]){

        long multiplication=array[0];

        for (int i=1; i<array.length; i++) {
            multiplication *= array[i];
        }
        return multiplication;
    }

    static double multiplication(double array[]){
        double multiplication=array[0];
        for (int i=1; i<array.length; i++) {
            multiplication *= array[i];
        }
        return multiplication;
    }

    static int modulus(int array[]){

        int modulus=array[0];

        for (int i=1; i<array.length; i++) {
            modulus %= array[i];
        }
        return modulus;
    }

    static double modulus(double array[]){
        double modulus=array[0];
        for (int i=1; i<array.length; i++) {
            modulus %= array[i];
        }
        return modulus;
    }

    static int intSecondLargest(int array[]){
        int firstleLargest = 0;
        int secondLargest  = 0;
        for (int i=0; i<array.length; i++) {
            if (firstleLargest<array[i]) {
                secondLargest = firstleLargest;
                firstleLargest = array[i];
            }
            else if(secondLargest<firstleLargest&&secondLargest<array[i])secondLargest=array[i];


        }
        return secondLargest;
    }


    static double doubleSecondLargest(double array[]){
        double firstleLargest = 0;
        double secondLargest  = 0;
        for (int i=0; i<array.length; i++) {
            if (firstleLargest<array[i]) {
                secondLargest = firstleLargest;
                firstleLargest = array[i];
            }
            else if(secondLargest<firstleLargest&&secondLargest<array[i])secondLargest=array[i];


        }
        return secondLargest;
    }



    public static void main(String[] args) {

        int[] intArray = {1, 8, 13, 12, 40, 51, 7, 35, 99 , 1};
        double[] doubleArray = {1, 8, 13, 12, 40, 51, 7, 35, 99 , 1};

        System.out.println(sum(intArray));
        System.out.println(sum(doubleArray));
        System.out.println();
        System.out.println(intMin(intArray));
        System.out.println(doubleMin(doubleArray));
        System.out.println();
        System.out.println(intMax(intArray));
        System.out.println(doubleMax(doubleArray));
        System.out.println();
        System.out.println(intMaxPositive(intArray));
        System.out.println(doubleMaxPositive(doubleArray));
        System.out.println();
        System.out.println(intSecondLargest(intArray));
        System.out.println(doubleSecondLargest(doubleArray));
        System.out.println();
        System.out.println(multiplication(intArray));
        System.out.println(multiplication(doubleArray));
        System.out.println();
        System.out.println(modulus(intArray));
        System.out.println(modulus(doubleArray));


    }

}
