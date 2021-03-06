package com.loans.controller;

import com.loans.service.LoanService;
import com.loans.bean.request.LoanRequest;
import com.loans.repository.LoanRepository;
import com.loans.bean.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.logging.Logger;

/**
 * Created by pov on 17.2.23.
 *
 *
 * HASHA GENERUOTI FRONTE!!!!!!!!
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
        //return loanRepository.findAll();
        return loanRepository.findAllByOrderBySubmitDateDesc();
    }

    //Method for posting an application to app repo
    @RequestMapping(value = "/loans/create", produces = "application/json",method = RequestMethod.POST)
    public void addLoan(@RequestBody LoanRequest loanRequest){
        LocalDateTime localDateTime = LocalDateTime .now();
        loanService.createLoan(loanRequest, false, localDateTime);
    }

    @RequestMapping(value = "/loans/createdraft", produces = "application/json",method = RequestMethod.POST)
    public void addLoanDraft(@RequestBody LoanRequest loanRequest){
        LocalDateTime localDateTime = LocalDateTime .now();
        loanService.createLoan(loanRequest, true, localDateTime);
    }

    @RequestMapping(value = "/loan/viewdraft", method = RequestMethod.GET)
    public Loan getLoanDraftByUID(@RequestParam(value = "code") String code){
        return loanRepository.findByCode(code);
    }
    @RequestMapping(value = "/loan/getcode", method = RequestMethod.GET)
    public Loan getCodeByName(@RequestParam(value = "name") String name){
        return loanRepository.findByName(name);
    }

    @RequestMapping(value = "/loan/editdraft", produces = "application/json", method = RequestMethod.PUT)
    public void editLoanDraftbyUID(@RequestBody LoanRequest loanRequest){
        Loan loan = loanRepository.findByCode(loanRequest.getCode());
        loanService.editDraft(loan,loanRequest);
    }
    @RequestMapping(value = "/loan/status", method = RequestMethod.GET)
    public String getStatus(@RequestParam(value = "code") String code){
        Loan loan = loanRepository.findByCode(code);
        return loan.getStatus();
    }

    @RequestMapping(value = "/loan/new", method = RequestMethod.POST)
    public void insertLoan(){
        Loan loan = new Loan();
        BigDecimal amount = new BigDecimal("1115.37");
        LocalDateTime localDate = LocalDateTime .now();
        loan.setAmount(amount);
        loan.setCode("bbb");
        loan.setName("Laura");
        loan.setSurname("Silvanavičiūtė");
        loan.setCity("Vilnius");
        loan.setAddress("Vilniaus g. 132");
        loan.setCountry("Lithuania");
        loan.setDocNumber("131131131");
        loan.setDocType("Passport");
        loan.setEmail("laraa3@gmail.com");
        loan.setSalary(amount);
        loan.setPersonCode("4344344344");
        loan.setPhoneNum1("868686868");
        loan.setPhoneNum2("+3706484848");
        loan.setPayDay(15);
        loan.setPayMonth(3);
        loan.setPayYear(7);
        loan.setSubmitDate(localDate);
        loan.setStatus("Unchecked");
        loanRepository.save(loan);
    }
    @RequestMapping(value = "/loan/update/{id}", method = RequestMethod.PUT)
    public void updateLoan(@PathVariable int id){
        Loan loan = loanRepository.findOne(id);
        loan.setName("Jonas");
        loan.setSurname("Jonauskas");
        loanRepository.save(loan);
    }

    @RequestMapping(value = "/loan/deleteFromUrl/{id}", method = RequestMethod.POST)
    public void deleteLoanFromUrl(@PathVariable int id){
        Loan loan = loanRepository.findOne(id);
        loanRepository.delete(loan);
    }

    @RequestMapping(value = "/loan/delete", produces = "application/json",method = RequestMethod.POST)
    public void deleteLoan(@RequestBody LoanRequest loanRequest){
        loanService.deleteLoan(loanRequest);
    }

    @RequestMapping(value = "/loanstatus/update", produces = "application/json",method = RequestMethod.PUT)
    public void updateStatus(@RequestBody LoanRequest loanRequest){
        loanService.updateStatus(loanRequest);
    }


    @RequestMapping(value = "/loan/findByCode", method = RequestMethod.GET)
    public Loan getLoanStatusById(@RequestParam(value = "code") String code){
        System.out.println("ERROR: " + loanService.getLoanByCode(code));
        return loanService.getLoanByCode(code);
    }

    @RequestMapping(value = "/loandraft/update", produces = "application/json",method = RequestMethod.PUT)
    public void editLoanDraft(@RequestBody LoanRequest loanRequest){
         loanService.updateLoanDraft(loanRequest, true);
    }

}