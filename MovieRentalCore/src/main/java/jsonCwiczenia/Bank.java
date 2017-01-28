package jsonCwiczenia;

import pl.sda.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-01-24.
 */
public class Bank {
    Owner owner;
    String id;


    public static void main(String[] args) {
        CreditCards creditCards;
       List<CreditCards> creditCardsList = new ArrayList<>();
       CreditCards creditCards1 = new CreditCards("123", "123", "123");
        Map<String, String> ownerMap = new HashMap();
        Owner owner1 = new Owner("a", "b");
        Owner owner2 = new Owner("c", "d");
        ownerMap.put("a", "b");
        ownerMap.put("c", "d");
        System.out.println(ownerMap.get("a"));

    }




}
