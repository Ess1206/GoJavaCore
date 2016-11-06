package practies;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    /**
     *  Unchecked Exceptions
     */

    Number number = 0.1;
//    number = Integer.parseInt("ABC");
    Integer integer = 1;

    double result = Double.NaN;

    result = integer / (Integer) number; // <- class cast


    try {
        number = Integer.parseInt("ABC"); // number format

//      result = integer / (Integer) number; // <- class cast

//      result = integer / number.intValue(); // divide by zero

      int[] array = new int[5];
//      number = array[6]; // array index out of bounds

      number = 2.7;
      result = integer / number.doubleValue();

    }
    /*catch (NumberFormatException e) {
      System.out.println("Catched number format exception -> " + e.getMessage());
    } */
    catch (Exception e) {
      System.out.println("Catched unexpected exception -> " + e.getMessage());
    } finally {
      System.out.println("finaly block -> " + result);
    }

    try {
      String string = null;
//      System.out.println(string.length()); // null pointer
      string = "ABC";
      System.out.println("string length: " + string.length());
      System.out.println("char at 0 position: " + string.charAt(0));
//      System.out.println("char at 0 position" + string.charAt(5)); // string index out of bounds
    } catch (NullPointerException e) {
      System.out.println("Catched null pointer exception -> " + e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Catched string index out of bounds exception -> " + e.getMessage());
    }

// =========================================================================================================

    /**
     *  Checked Exceptions
     */

    Map<String, String> requestParams = new HashMap<>();
    requestParams.put("firstName", "Oleg"); // обязательный
//    requestParams.put("lastName", "Orlov");
    requestParams.put("email", "mail@example.com"); // обязательный

    try {
      PersonController controller = new PersonController();
      String saveResult = controller.save(requestParams);
      System.out.println(saveResult);
    } catch (Exception e) {
      print(e);
    }

// =========================================================================================================

    /**
     * Custom Exception
     */

    Map<String, String> requestParams1 = new HashMap<>();
      requestParams1.put("firstName", "Oleg"); // обязательный
//  requestParams1.put("lastName", "Orlov");
    requestParams1.put("email", "mail@example.com"); // обязательный

    Map<String, String> requestParams2 = new HashMap<>();
//    requestParams2.put("email", "mail@example.com"); // обязательный
    requestParams2.put("email", "mail12345@example.com"); // обязательный

    try {
      PersonController1 controller = new PersonController1();
      String saveResult = controller.save(requestParams1);
      System.out.println(saveResult);

      String findResult = controller.findByEmail(requestParams2);
      System.out.println(findResult);
    } catch (PersonException e) {
      print(e);
    }

  }

  private static void print(Exception e) {
    StringWriter sw = new StringWriter();
    e.printStackTrace(new PrintWriter(sw));
    System.out.println(sw.toString());
  }

}
