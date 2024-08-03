package com.example.tdd_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {
    private PasswordStrengthMeter meter=new PasswordStrengthMeter();

    private void assertStrength(String password ,PasswordStrength expStr) {
        PasswordStrength result = meter.meter(password);
        assertEquals(expStr,result);

    }

    @Test
    void meetsAllCriteria_Then_Strong(){
        /* 중복제거
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result2 =meter.meter("ab12!@000");
        //assertEquals(PasswordStrength.STRONG,result); // STRONG 기대햇지만 null 이라서 오류, 리턴값 수정 후 ok.
        assertEquals(PasswordStrength.STRONG,result2);
        */
        //assertStrength("ab12!@000",PasswordStrength.STRONG);
        assertStrength("ab12!@00",PasswordStrength.NORMAL);
    }

    @Test
    void meetsOtherCriteria_except_for_Length_Then_Normal(){
        /* 중복제거
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result =meter.meter("ab12yA@");
        assertEquals(PasswordStrength.NORMAL,result);
        */
        assertStrength("ab12yA@",PasswordStrength.NORMAL);

    }

    @Test
    void meetsOtherCriteria_except_for_number_Then_Normal(){
        //PasswordStrengthMeter meter = new PasswordStrengthMeter();
        //PasswordStrength result =meter.meter("abcds!@cyy");
        //assertEquals(PasswordStrength.NORMAL,result);
        assertStrength("ab!@ABqwer",PasswordStrength.NORMAL);
    }

    @Test
    void nullInput_Then_Invalid(){
        //assertStrength(null,PasswordStrength.INVALID);  //null
        assertStrength("",PasswordStrength.INVALID);  //빈문자열
    }

    @Test
    void meetsOtherCriteria_except_for_Uppercase_Then_Normal(){
        //assertStrength(null,PasswordStrength.INVALID);  //null
        assertStrength("ab12!@df",PasswordStrength.NORMAL);  //빈문자열
    }

    @Test
    void meetsOnlyLengthCriteria_Then_Weak(){
        assertStrength("abcdefghi",PasswordStrength.WEAK);  //빈문자열
    }

    @Test
    void meetsOnlyNumCriteria_Then_Weak(){
        assertStrength("12345",PasswordStrength.WEAK);  //빈문자열
    }

    @Test
    void meetsOnlyUpperCriteria_Then_Weak(){
        assertStrength("ABCDE",PasswordStrength.WEAK);  //빈문자열
    }

    @Test
    void meetsNoCriteria_Then_Weak(){
        assertStrength("abc",PasswordStrength.WEAK);  //빈문자열
    }

}
