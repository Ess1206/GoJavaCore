package homework;

/**
 * Created by Stan on 07.09.2016.
 */
public class USBank extends Bank {

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.USD) limitOfFunding = (int) getTotalCapital(); // Get User Balance
        else limitOfFunding = 10000;
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD) monthlyRate = 1;
        else monthlyRate = 2;
        return monthlyRate;
    }

    @Override
        //
    int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 5;
            else commission = 7;
        } else {
            if (amount < 1000) commission = 6;
            else commission = 8;
        }
        return commission;
    }
}