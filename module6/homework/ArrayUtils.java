package homework;

/**
 * Created by Stan on 02.10.2016.
 */
public class ArrayUtils {

    static int sum(int array[]) {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    static int max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }

    static int maxPositive(int array[]) {
        int max = array[0];
        int maxPositive = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        if (max > 0) maxPositive = max;
        if (max <= 0) System.out.println("no Positive");

        return maxPositive;
    }

    static long multiplication(int array[]) {

        long multiplication = array[0];

        for (int i = 1; i < array.length; i++) {
            multiplication *= array[i];
        }
        return multiplication;
    }

    static int modulus(int array[]) {

        int modulus = array[0];

        for (int i = 1; i < array.length; i++) {
            modulus %= array[i];
        }
        return modulus;
    }

    static int secondLargest(int array[]) {
        int firstleLargest = 0;
        int secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (firstleLargest < array[i]) {
                secondLargest = firstleLargest;
                firstleLargest = array[i];
            } else if (secondLargest < firstleLargest && secondLargest < array[i]) secondLargest = array[i];


        }
        return secondLargest;
    }


    static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        int countOfItems = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[countOfItems];
            countOfItems--;
        }
        for (int i = 0; i < reverseArray.length; i++) {
            array[i] = reverseArray[i];
        }

        return array;
    }

    static int[] findEvenElements(int[] array) {

        int countOFEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) countOFEven++;
        }

        int[] arrayOFEven = new int[countOFEven];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
               arrayOFEven[arrayOFEven.length-countOFEven]=array[i];
                countOFEven--;

            }
        }

        return arrayOFEven;
    }


}
