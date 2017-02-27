package com.loans.service;

import com.loans.bean.request.LoanRequest;
import com.loans.repository.LoanRepository;
import com.loans.bean.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by pov on 17.2.23.
 *
 * Loan Service is used to create new applications and add them
 * to Applications Repository
 *
 *
 */
@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public void createLoan(LoanRequest loanRequest, boolean isDraft){
        Loan loan = new Loan();
        //loan.getId();
        loan.setCode();
        loan.setAmount(loanRequest.getAmount());
        loan.setPayDay(loanRequest.getPayDay());
        loan.setPayYear(loanRequest.getPayYear());
        loan.setPayMonth(loanRequest.getPayMonth());
        loan.setName(loanRequest.getName());
        loan.setSurname(loanRequest.getSurname());
        loan.setSalary(loanRequest.getSalary());
        loan.setPersonCode(loanRequest.getPersonCode());
        loan.setDocType(loanRequest.getDocType());
        loan.setDocNumber(loanRequest.getDocNumber());
        loan.setCountry(loanRequest.getCountry());
        loan.setCity(loanRequest.getCity());
        loan.setAddress(loanRequest.getAddress());
        loan.setPhoneNum1(loanRequest.getPhoneNum1());
        //loan.setPhoneNum2(loanRequest.getPhoneNum2());
        loan.setEmail(loanRequest.getEmail());
        if(isDraft){
            loan.setStatus("Draft");
        }
        else{
            loan.setStatus("Unchecked");
        }
        LocalDateTime localDate = LocalDateTime .now();
        loan.setSubmitDate(localDate);
        loanRepository.save(loan);
    }
    public void editDraft(Loan loan, LoanRequest loanRequest){
        Loan application = loan;
        boolean change = false;
        if (application.getAmount()!=loanRequest.getAmount()){
            application.setAmount(loanRequest.getAmount());
            change = true;
        }
        if (application.getSubmitDate()!=loanRequest.getSubmitDate()){
            application.setSubmitDate(loanRequest.getSubmitDate());
            change = true;
        }
        if (application.getPayDay()!=loanRequest.getPayDay()){
            application.setPayDay(loanRequest.getPayDay());
            change = true;
        }
        if (application.getName()!=loanRequest.getName()){
            application.setName(loanRequest.getName());
            change = true;
        }
        if (application.getSurname()!=loanRequest.getSurname()){
            application.setSurname(loanRequest.getSurname());
            change = true;
        }
        if (application.getDocType()!=loanRequest.getDocType()){
            application.setDocType(loanRequest.getDocType());
            change = true;
        }
        if (application.getDocNumber()!=loanRequest.getDocNumber()){
            application.setDocNumber(loanRequest.getDocNumber());
            change = true;
        }
        if (application.getCountry()!=loanRequest.getCountry()){
            application.setCountry(loanRequest.getCountry());
            change = true;
        }
        if (application.getPersonCode()!=loanRequest.getPersonCode()){
            application.setPersonCode(loanRequest.getPersonCode());
            change = true;
        }
        if (application.getSalary()!=loanRequest.getSalary()){
            application.setSalary(loanRequest.getSalary());
            change = true;
        }
        if (application.getCity()!=loanRequest.getCity()){
            application.setCity(loanRequest.getCity());
            change = true;
        }
        if (application.getAddress()!=loanRequest.getAddress()){
            application.setAddress(loanRequest.getAddress());
            change = true;
        }
        if (application.getPhoneNum1()!=loanRequest.getPhoneNum1()){
            application.setPhoneNum1(loanRequest.getPhoneNum1());
            change = true;
        }
        if (application.getPhoneNum2()!=loanRequest.getPhoneNum2()){
            application.setPhoneNum2(loanRequest.getPhoneNum2());
            change = true;
        }
        if (application.getEmail()!=loanRequest.getEmail()){
            application.setEmail(loanRequest.getEmail());
            change = true;
        }
        if (application.getStatus()!=loanRequest.getStatus()){
            application.setStatus(loanRequest.getStatus());
            change = true;
        }
        if (change){
            loanRepository.save(application);
        }
    }
    public void updateStatus(LoanRequest loanRequest){
        Loan changeStatus= loanRepository.findOne(loanRequest.getId());
        changeStatus.setStatus(loanRequest.getStatus());
        loanRepository.save(changeStatus);
    }


}