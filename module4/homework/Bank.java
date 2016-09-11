package homework;

public abstract class Bank {

    private long id;
    private String bankCounty;
    private Currency currency;
    private int numberOfEmployee;
    private double avrSalaryOfEmloyee;
    private long rating;
    private long totalCapital;


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

    public long getRating() {
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