package com.example.tdd_11;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){
        //return null;
        if(s.length()<8){
            return PasswordStrength.NORMAL;
        } else {
            return PasswordStrength.STRONG;
        }
    }
}
