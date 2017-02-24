package com.loans.bean.request;

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

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonCode() {
        return personCode;
    }

    public String getDocType() {
        return docType;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum1() {
        return phoneNum1;
    }

    public String getPhoneNum2() {
        return phoneNum2;
    }

    public String getEmail() {
        return email;
    }

    public boolean getStatus() {
        return status;
    }
}
