package homework;

public class EUBank extends Bank {
    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 2000;
        else limit = 2200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.USD) limitOfFunding = 10000;
        else limitOfFunding = 20000;
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD) monthlyRate = 0;
        else monthlyRate = 1;
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
            if (amount < 1000) commission = 2;
            else commission = 4;
        }
        return commission;
    }
}