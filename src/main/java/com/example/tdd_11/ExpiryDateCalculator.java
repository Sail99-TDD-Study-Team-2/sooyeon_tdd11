package com.example.tdd_11;
import java.time.LocalDate;

public class ExpiryDateCalculator {
    /* 리팩토링후 삭제
    public LocalDate calculateExpiryDate(LocalDate billingDate,int payAmount) {
        //1)상수비교.
        //return LocalDate.of(2019,4,1);

        //2)일반화!
        return billingDate.plusMonths(1);
    }
    */
    public LocalDate calculateExpiryDate(Paydata paydata){
        //상수 1 을 변수로 변경->테스트.
        int addedMonths= paydata.getPayAmount()/10000;
        if(paydata.getFirstBillingDate()!=null) {
            LocalDate candidateExp = paydata.getBillingDate().plusMonths(addedMonths);
            if (paydata.getFirstBillingDate().getDayOfMonth() != candidateExp.getDayOfMonth()) {
                return candidateExp.withDayOfMonth(paydata.getFirstBillingDate().getDayOfMonth());
            }
        }
        return paydata.getBillingDate().plusMonths(addedMonths);
    }
}
