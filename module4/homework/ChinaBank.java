package homework;

/**
 * Created by Stan on 11.09.2016.
 */
public class ChinaBank extends Bank {
    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 100;
        else limit = 150;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.USD) limitOfFunding = 10000;
        else limitOfFunding = 5000;
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD) monthlyRate = 1;
        else monthlyRate = 0;
        return monthlyRate;
    }

    @Override
        //
    int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 3;
            else commission = 5;
        } else {
            if (amount < 1000) commission = 10;
            else commission = 11;
        }
        return commission;
    }
}
