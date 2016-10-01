package practies.task3;

import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * Created by Stan on 19.09.2016.
 */
public abstract class Utils {


    public static String removeChar (char letter, String text){
        String result = new String();
        for (int i = 0; i < text.length(); i++) {
           if (text.charAt(i) != letter){
               result = result + text.charAt(i);
           }
        }

        return result;
    }


    public static String removeChat2(char letter , String text){
        String result = new String();
        String[] charArray = text.split(letter + "");
        for (String c:charArray) {result += c;}

        return result;
    }

    public  static String removeChar3(char letter , String text){
        String result = new String();


        return result;
    }
/*

    private static void doIT{
        doIT2
    }
    public static void doIT2{

    }
*/
}
