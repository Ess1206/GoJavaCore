package practies.task1;

/**
 * Created by Stan on 12.09.2016.
 */
public final class Triangle extends View {

    private boolean isShowing = false;

    @Override
    void show() {
        if (isShowing) {
            System.out.println("can't Show triangele");

        }else
        System.out.println("Show triangele");
        isShowing = true;
    }


    @Override
    void hide() {
        if (!isShowing){
            System.out.println("triangele is not showing");
        }else
        System.out.println("hide Triangle");
        isShowing = false;
    }

    public boolean isShowing(){
        System.out.println("triangle is" + (isShowing ? "showing": "not showing") );
        return isShowing;

    }
    /*
    private void changeViewState(String message){
        String hiding = "hiding";
        String showing = "showing";
        if (message.equals(hiding)){System.out.println("cant "+ message+"now" );
        }else {
            if (message.equals(showing)) message = hiding;
            System.out.println(message+"Triangle");
            isShowing = false;
        }
    }*/
}
