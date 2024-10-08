package com.example.tdd_11;

import java.time.LocalDate;

public class Paydata {
    private LocalDate firstBillingDate;
    private LocalDate billingDate;
    private int payAmount;

    private Paydata() {

    }

    public Paydata(LocalDate firstBillingDate, LocalDate billingDate, int payAmount) {
        this.firstBillingDate = firstBillingDate;
        this.billingDate = billingDate;
        this.payAmount = payAmount;
    }

    public LocalDate getFirstBillingDate() {
        return firstBillingDate;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public int getPayAmount() {
        return payAmount;
    }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Paydata data = new Paydata();

        public Builder firstBillingDate(LocalDate firstBillingDate) {
            data.firstBillingDate = firstBillingDate;
            return this;
        }

        public Builder billingDate(LocalDate billingDate) {
            data.billingDate = billingDate;
            return this;
        }

        public Builder payAmount(int payAmount) {
            data.payAmount = payAmount;
            return this;
        }

        public Paydata build() {
            return data;
        }
    }
}
