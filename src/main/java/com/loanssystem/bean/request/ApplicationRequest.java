package com.loanssystem.bean.request;

/**
 * Created by pov on 17.2.23.
 *
 * Class used for getting Request body's info
 */
public class ApplicationRequest {
    private Long id;
    private Long amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
