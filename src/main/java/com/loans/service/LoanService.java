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

    public void createApplication(LoanRequest applicationRequest){
        Loan application = new Loan();
        application.getId();
        application.setLoan_Amount(applicationRequest.getLoan_Amount());
        application.setLoan_Repay_Year(applicationRequest.getLoan_Repay_Year());
        application.setLoan_Repay_Months(applicationRequest.getLoan_Repay_Months());
        application.setLoan_Payday(applicationRequest.getLoan_Payday());
        application.setName(applicationRequest.getName());
        application.setSurname(applicationRequest.getSurname());
        application.setSalary(applicationRequest.getSalary());
        application.setPersonCode(applicationRequest.getPersonCode());
        application.setDocType(applicationRequest.getDocType());
        application.setDocNumber(applicationRequest.getDocNumber());
        application.setCountry(applicationRequest.getCountry());
        application.setCity(applicationRequest.getCity());
        application.setAddress(applicationRequest.getAddress());
        application.setPhoneNum1(applicationRequest.getPhoneNum1());
        application.setPhoneNum2(applicationRequest.getPhoneNum2());
        application.setEmail(applicationRequest.getEmail());
        applicationsRepository.save(application);
    }


}
