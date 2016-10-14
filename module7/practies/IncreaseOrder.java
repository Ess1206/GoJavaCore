package practies;

import java.util.Comparator;

/**
 * Created by Stan on 03.10.2016.
 */
public class IncreaseOrder implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
