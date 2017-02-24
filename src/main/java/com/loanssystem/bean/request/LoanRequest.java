package com.loanssystem.bean.request;

/**
 * Created by pov on 17.2.23.
 *
 * Class used for getting Request body's info
 */
public class LoanRequest {
    private double loan_Amount;
    private int loan_Repay_Year;
    private int loan_Repay_Months;
    private int loan_Payday;

    public double getLoan_Amount() {
        return loan_Amount;
    }

    public int getLoan_Repay_Year() {
        return loan_Repay_Year;
    }

    public int getLoan_Repay_Months() {
        return loan_Repay_Months;
    }

    public int getLoan_Payday() {
        return loan_Payday;
    }
}
