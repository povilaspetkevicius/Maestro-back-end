package com.loans.bean.entity;

import javax.persistence.*;

/**
 * Created by pov on 17.2.23.
 *
 *
 */
@Entity(name = "applications")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private double loan_Amount;
    private int loan_Repay_Year;
    private int loan_Repay_Months;
    private int loan_Payday;

    public Loan(){}


    public double getLoan_Amount() {
        return loan_Amount;
    }

    public void setLoan_Amount(double loan_Amount) {
        this.loan_Amount = loan_Amount;
    }

    public int getLoan_Repay_Year() {
        return loan_Repay_Year;
    }

    public void setLoan_Repay_Year(int loan_Repay_Year) {
        this.loan_Repay_Year = loan_Repay_Year;
    }

    public int getLoan_Repay_Months() {
        return loan_Repay_Months;
    }

    public void setLoan_Repay_Months(int loan_Repay_Months) {
        this.loan_Repay_Months = loan_Repay_Months;
    }

    public int getLoan_Payday() {
        return loan_Payday;
    }

    public void setLoan_Payday(int loan_Payday) {
        this.loan_Payday = loan_Payday;
    }

    public Loan(long id, double loan_Amount, int loan_Repay_Year, int loan_Repay_Months, int loan_Payday) {
        this.id = id;
        this.loan_Amount = loan_Amount;
        this.loan_Repay_Year = loan_Repay_Year;
        this.loan_Repay_Months = loan_Repay_Months;
        this.loan_Payday = loan_Payday;
    }
}
