package webinar.abstractClass;

/**
 * Created by Stan on 02.09.2016.
 */
public class HREmployee extends Employee {
    @Override
    void paySalary() {
        double k = 1.1;
        balance+=salary*k;
    }
}
