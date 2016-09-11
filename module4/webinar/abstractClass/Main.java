package webinar.abstractClass;

/**
 * Created by Stan on 02.09.2016.
 */
public class Main {
 static    void payselerry(Employee employee){
        employee.paySalary();
    }


    public static void main(String[] args) {
        System.out.println("Abstract");
        DeveloperEmployee develoresEmployee = new DeveloperEmployee(0, 1000);
        ManagersEmployee managersEmployee = new ManagersEmployee(10 , 500);
/*

        develoresEmployee.paySalary();
        managersEmployee.paySalary();
*/

        Employee[] employees = {develoresEmployee , managersEmployee};
       // payselerry(employees);
        payselerry(managersEmployee);

        System.out.println(develoresEmployee.balance);
        System.out.println(develoresEmployee.balance);
    }
}
