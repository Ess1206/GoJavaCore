package webinar.abstractClass;

/**
 * Created by Stan on 02.09.2016.
 */
public class DeveloperEmployee extends Employee {
        public DeveloperEmployee(int balance, int salary) {
            this.balance = balance;
            this.salary = salary;
        }

        @Override
        void paySalary() {
            balance+=salary;
        }
    }