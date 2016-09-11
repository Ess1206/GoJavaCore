package homework;

public class User {
    private long id;
    private String name;
    private double balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(String name, double balance, Bank bank) {
        this.name = name;
        this.balance = balance;
        this.bank = bank;
    }

    public User() {
    }
    //Getters_________________________________________________________________________

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }


//Setters_________________________________________________________________________


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
     //   setBalance(getBalance()+salary-bank.getCommission(salary));
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }



    @Override
    public String toString() {
        return name+" {" +
                "balance=" + balance +
                ", bank=" + bank +
                '}';
    }
}