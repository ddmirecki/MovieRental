package jsonCwiczenia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-24.
 */
public class CreditCards {
    String number;
    String money;
    String currency;

    public CreditCards(String number, String money, String currency) {
        this.number = number;
        this.money = money;
        this.currency = currency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "CreditCards{" +
                "number='" + number + '\'' +
                ", money='" + money + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
