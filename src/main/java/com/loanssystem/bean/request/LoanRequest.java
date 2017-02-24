package com.loanssystem.bean.request;

/**
 * Created by pov on 17.2.23.
 *
 * Class used for getting Request body's info
 */
public class LoanRequest {
    private Long amount;
    private String name;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }
}
