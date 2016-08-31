

public class Unboxing {

    public static void main(String[] args) {
        Integer i = new Integer(-8);

        // 1. Unboxing through method invocation
        int absVal = absoluteValue(i);
        System.out.println("absolute value of " + i + " = " + absVal);

        Double[] ld = new Double[1];
        ld[0] = 3.1416;

        // 2. Unboxing through assignment
        double pi = ld[0];
        System.out.println("pi = " + pi);
    }

    public static int absoluteValue(int i) {
        if(i<0) return -i;
        else return i;
        //return (i < 0) ? -i : i;
    }
}