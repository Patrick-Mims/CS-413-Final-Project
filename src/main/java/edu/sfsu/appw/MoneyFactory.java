package edu.sfsu.appw;

public class MoneyFactory {
    public Money getForm(String moneyType) {

        if(moneyType == null) {
            return null;
        }

        if(moneyType.equalsIgnoreCase("N")) {
            return new CTimePeriod();
        }

        return null;
    }
}
