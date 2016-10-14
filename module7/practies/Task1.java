package practies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Stan on 03.10.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(5);
        list.add(7);
        list.add(17);
        list.add(1);
        list.add(27);
        System.out.println(list);
       /* Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };*/
        list.sort(new IncreaseOrder());
        System.out.println(list);

        list.sort(new DecreseOrder());
    }
}
