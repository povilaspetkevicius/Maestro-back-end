package com.loans.service;

import com.loans.bean.request.LoanRequest;
import com.loans.repository.LoanRepository;
import com.loans.bean.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private LoanRepository applicationsRepository;

    public void createApplication(LoanRequest loanRequest){
        Loan application = new Loan();
        application.getId();
        application.setUniqueLoanId();
        application.setLoan_Amount(loanRequest.getLoan_Amount());
        application.setLoan_Repay_Year(loanRequest.getLoan_Repay_Year());
        application.setLoan_Repay_Months(loanRequest.getLoan_Repay_Months());
        application.setLoan_Payday(loanRequest.getLoan_Payday());
        application.setName(loanRequest.getName());
        application.setSurname(loanRequest.getSurname());
        application.setSalary(loanRequest.getSalary());
        application.setPersonCode(loanRequest.getPersonCode());
        application.setDocType(loanRequest.getDocType());
        application.setDocNumber(loanRequest.getDocNumber());
        application.setCountry(loanRequest.getCountry());
        application.setCity(loanRequest.getCity());
        application.setAddress(loanRequest.getAddress());
        application.setPhoneNum1(loanRequest.getPhoneNum1());
        application.setPhoneNum2(loanRequest.getPhoneNum2());
        application.setEmail(loanRequest.getEmail());
        application.setStatus(loanRequest.getStatus());
        applicationsRepository.save(application);
    }
    public void editDraft(Loan loan, LoanRequest loanRequest){
        Loan application = loan;
        boolean change = false;
        if (application.getLoan_Amount()!=loanRequest.getLoan_Amount()){
            application.setLoan_Amount(loanRequest.getLoan_Amount());
            change = true;
        }
        if (application.getLoan_Repay_Year()!=loanRequest.getLoan_Repay_Year()){
            application.setLoan_Repay_Year(loanRequest.getLoan_Repay_Year());
            change = true;
        }
        if (application.getLoan_Repay_Months()!=loanRequest.getLoan_Repay_Months()){
            application.setLoan_Repay_Months(loanRequest.getLoan_Repay_Months());
            change = true;
        }
        if (application.getLoan_Payday()!=loanRequest.getLoan_Payday()){
            application.setLoan_Payday(loanRequest.getLoan_Payday());
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
        if (application.isStatus()!=loanRequest.getStatus()){
            application.setStatus(loanRequest.getStatus());
            change = true;
        }



        if (change){
            applicationsRepository.delete(loan);
            applicationsRepository.save(application);
        }
    }


}
