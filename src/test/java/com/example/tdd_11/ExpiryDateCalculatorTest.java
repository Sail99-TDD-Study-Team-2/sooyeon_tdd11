package com.example.tdd_11;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpiryDateCalculatorTest {
    @Test
    public void pay_10000_end() { //10000원 납부 시 한달뒤 만료일 계산테스트 함수
        //1)상수비교
        assertExpiryDate(LocalDate.of(2019,3,1),10000,LocalDate.of(2019,4,1));
        /*
        LocalDate billingDate = LocalDate.of(2019,3,1);
        int payAmount = 10000;

        ExpiryDateCalculator cal=new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate,payAmount);

        assertEquals(LocalDate.of(2019,4,1),expiryDate);
        */

        //2)일반화_1.상수대신 일반화
        assertExpiryDate(LocalDate.of(2019,5,5),10000,LocalDate.of(2019,6,5));
    }
    @Test
    public void pay_notPlusEqual() { //납부일이 말일일 경우 테스트
        //말일, 윤년은 plusMonths()함수에서 자동 계산됨.
        assertExpiryDate(LocalDate.of(2019,1,31),10000,LocalDate.of(2019,2,28));
        assertExpiryDate(LocalDate.of(2019,5,31),10000,LocalDate.of(2019,6,30));
        assertExpiryDate(LocalDate.of(2020,1,31),10000,LocalDate.of(2020,2,29));

    }

    private void assertExpiryDate(LocalDate billingDate , int payAmount, LocalDate expectedExpityDate){
        ExpiryDateCalculator cal=new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate,payAmount);

        assertEquals(expectedExpityDate,expiryDate);

    }

}

