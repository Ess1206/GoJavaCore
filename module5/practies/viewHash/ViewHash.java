package practies.viewHash;

import practies.task1.View;

import java.util.Arrays;

/**
 * Created by Stan on 12.09.2016.
 */
public class ViewHash {
    private int currentIndex = 0;
    private View[] views = new View[10];


    public void addView(View view) {
        views[currentIndex] = view;
        currentIndex++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewHash viewHash = (ViewHash) o;

        if (currentIndex != viewHash.currentIndex) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(views, viewHash.views);

    }

    @Override
    public int hashCode() {
        int result = currentIndex;
        result = 31 * result + Arrays.hashCode(views);
        return result;
    }
}
