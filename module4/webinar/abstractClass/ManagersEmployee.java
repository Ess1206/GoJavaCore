package webinar.abstractClass;

/**
 * Created by Stan on 02.09.2016.
 */
public class ManagersEmployee extends Employee{
    public ManagersEmployee() {

    }

    public ManagersEmployee(int i, int i1) {

    }

    @Override
    void paySalary() {
        balance+=salary-200;
    }
}
