package com.example.tdd_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {
    @Test
    void meetsAllCriteria_Then_Strong(){
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result =meter.meter("ab12!@");

        PasswordStrength result2 =meter.meter("ab12!@000");
        //assertEquals(PasswordStrength.STRONG,result); // STRONG 기대햇지만 null 이라서 오류, 리턴값 수정 후 ok.
        assertEquals(PasswordStrength.STRONG,result2);
    }
}
