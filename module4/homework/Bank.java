package homework;

public abstract class Bank {

    private long id;
    private String bankCounty;
    private Currency currency;
    private int numberOfEmployee;
    private double avrSalaryOfEmloyee;
    private double rating;
    private long totalCapital;
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        Bank bank = null;
        if (o.getClass()==Bank.class) {
            bank = (Bank) o;
        }
        return id == bank.id;

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (id != bank.id) return false;
        if (numberOfEmployee != bank.numberOfEmployee) return false;
        if (Double.compare(bank.avrSalaryOfEmloyee, avrSalaryOfEmloyee) != 0) return false;
        if (Double.compare(bank.rating, rating) != 0) return false;
        if (totalCapital != bank.totalCapital) return false;
        return bankCounty != null ? bankCounty.equals(bank.bankCounty) : bank.bankCounty == null && currency == bank.currency;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    //Getters____________________________________________________________________________

    public long getId() {
        return id;
    }

    public String getBankCounty() {
        return bankCounty;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public double getAvrSalaryOfEmloyee() {
        return avrSalaryOfEmloyee;
    }

    public double getRating() {
        return rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

//Setters_____________________________________________________________________________


    public void setId(long id) {
        this.id = id;
    }

    public void setBankCounty(String bankCounty) {
        this.bankCounty = bankCounty;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public void setAvrSalaryOfEmloyee(double avrSalaryOfEmloyee) {
        this.avrSalaryOfEmloyee = avrSalaryOfEmloyee;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }



    //Methods are:
    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int summ);



    double moneyPaidMonthlyForSalary() {
        double sum = numberOfEmployee + avrSalaryOfEmloyee;
        return sum;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "currency=" + currency +
                '}';
    }
}