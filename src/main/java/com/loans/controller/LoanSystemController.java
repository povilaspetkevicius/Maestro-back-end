package com.loans.controller;

import com.loans.service.LoanService;
import com.loans.bean.request.LoanRequest;
import com.loans.repository.LoanRepository;
import com.loans.bean.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pov on 17.2.23.
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoanSystemController {

    @Autowired
    private LoanRepository loanRepository;
    @Autowired
    private LoanService loanService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {

        return "Hello Stranger!";
    }

    //Method for viewing all applications from applications repo
    @RequestMapping(value = "/loans", method = RequestMethod.GET)
    public Iterable<Loan> getLoans(){
        return loanRepository.findAll();
    }

    //Method for posting an application to app repo
    @RequestMapping(value = "/loan/create", produces = "application/json",method = RequestMethod.POST)
    public void addLoan(@RequestBody LoanRequest applicationRequest){
        loanService.createApplication(applicationRequest);
    }
    @RequestMapping(value = "/loan/viewdraft", method = RequestMethod.GET)
    public Loan getLoanDraftByUID(@RequestParam(value = "uniqueLoanId") String uid){
        return loanRepository.findByuniqueLoanId(uid);
    }
    @RequestMapping(value = "/loan/editdraft", method = RequestMethod.POST)
    public void editLoanDraftbyUID(@RequestParam (value = "uniqueLoanId") String uid, @RequestBody LoanRequest loanRequest){
        Loan loan = loanRepository.findByuniqueLoanId(uid);
        loanService.editDraft(loan,loanRequest);
    }
    @RequestMapping(value = "/loan/status", method = RequestMethod.GET)
    public boolean getStatus(@RequestParam(value = "uniqueLoanId") String uid){
        Loan loan = loanRepository.findByuniqueLoanId(uid);
        return loan.isStatus();
    }


    @RequestMapping(value = "/loan/new", method = RequestMethod.POST)
    public void insertCategory(){
        Loan app = new Loan();
        app.setLoan_Amount(4444);
        loanRepository.save(app);
    }

}
