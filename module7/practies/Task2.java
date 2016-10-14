package practies;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Stan on 03.10.2016.
 */
public class Task2 {

    @Test
    public void setCity() {
        List<String> city = new ArrayList<>();
        city.add("city_1");
        city.add("city_3");
        city.add("city_4");
        city.add("city_2");

        System.out.println(city);
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        city.sort(c);
        System.out.println(city);


    }


}
