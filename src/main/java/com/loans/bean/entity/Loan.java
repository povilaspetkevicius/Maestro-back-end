package com.loans.bean.entity;

import javax.persistence.*;
import java.util.UUID;

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
    private String uniqueLoanId;
    private double loan_Amount;
    private int loan_Repay_Year;
    private int loan_Repay_Months;
    private int loan_Payday;
    private String name;
    private String surname;
    private String personCode;
    private String docType;
    private String docNumber;
    private String country;
    private String city;
    private String address;
    private String phoneNum1;
    private String phoneNum2;
    private String email;
    private int salary;
    private boolean status;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum1() {
        return phoneNum1;
    }

    public void setPhoneNum1(String phoneNum1) {
        this.phoneNum1 = phoneNum1;
    }

    public String getPhoneNum2() {
        return phoneNum2;
    }

    public void setPhoneNum2(String phoneNum2) {
        this.phoneNum2 = phoneNum2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUniqueLoanId() {
        return uniqueLoanId;
    }

    public void setUniqueLoanId() {
        UUID uuid = UUID.randomUUID();
        this.uniqueLoanId = String.valueOf(uuid);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
