package com.loanssystem.bean.entity;

import javax.persistence.*;

/**
 * Created by pov on 17.2.23.
 *
 *
 */
@Entity(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private long amount;
    private String name;

    public Application(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Application(long id, long amount, String name) {
        this.id = id;
        this.amount = amount;
        this.name = name;
    }
}
