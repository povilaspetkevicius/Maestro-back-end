package com.loanssystem.service;

import com.loanssystem.bean.request.LoanRequest;
import com.loanssystem.repository.LoanRepository;
import com.loanssystem.bean.entity.Loan;
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
        application.setLoan_Amount(applicationRequest.getLoan_Amount());
        application.setLoan_Repay_Year(applicationRequest.getLoan_Repay_Year());
        application.setLoan_Repay_Months(applicationRequest.getLoan_Repay_Months());
        application.setLoan_Payday(applicationRequest.getLoan_Payday());
        applicationsRepository.save(application);
    }


}
