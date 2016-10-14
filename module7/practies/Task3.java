package practies;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Stan on 03.10.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        String[] array = new String[7];
        array[0]="city_1";
        array[2]="city _ 5";
        array[3]="city_  3";
        array[1]="c i t y _77";
        array[5]="city_9";
        array[6]="city_8";
        array[4]="city_2";

        System.out.println(Arrays.deepToString(array));
        Arrays.sort(array);
        System.out.println(Arrays.deepToString(array));

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Arrays.sort(array,c);
        System.out.println(Arrays.deepToString(array));

    }
}
