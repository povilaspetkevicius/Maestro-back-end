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
        application.setAmount(applicationRequest.getAmount());
        application.setName(applicationRequest.getName());
        applicationsRepository.save(application);
    }


}
