package com.example.tdd_11;
import java.time.LocalDate;

public class ExpiryDateCalculator {
    public LocalDate calculateExpiryDate(LocalDate billingDate,int payAmount) {
        //1)상수비교.
        //return LocalDate.of(2019,4,1);

        //2)일반화!
        return billingDate.plusMonths(1);
    }
}
