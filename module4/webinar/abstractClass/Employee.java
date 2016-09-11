package webinar.abstractClass;

/**
 * Created by Stan on 02.09.2016.
 */
public abstract class Employee {

        String name;
        int balance;
        int salary;

        abstract void paySalary();

        void printBalance() {
            System.out.println(balance);
        }

        void greeting() {
            System.out.println("Good morning" + name);
        }

        //abstract void paySalary();

        //abstract void paySalary();

        //abstract void paySalary();

        //abstract void paySalary();


/*    public int getBalance() {
        return balance;
    }
    public int getSalary() {
        return salary;
    }*/
    }