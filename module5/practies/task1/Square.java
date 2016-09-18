package practies.task1;

/**
 * Created by Stan on 12.09.2016.
 */
public final class Square extends View {

    private int counter = 0;

    @Override
    void show() {
        counter++;
        System.out.println("New squere " + counter + " shouwing");

    }

    @Override
    void hide() {
        if (counter <= 0) {
            System.out.println("no squre ");

        } else {
            System.out.println("Squere " + counter + " hided");
            counter--;
        }
    }
}

