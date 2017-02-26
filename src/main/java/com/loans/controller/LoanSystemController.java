package com.loans.controller;

import com.loans.service.LoanService;
import com.loans.bean.request.LoanRequest;
import com.loans.repository.LoanRepository;
import com.loans.bean.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by pov on 17.2.23.
 */
@CrossOrigin(origins = "https://maestro-front.herokuapp.com/")
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
    public Loan getLoanDraftByUID(@RequestParam(value = "code") String code){
        return loanRepository.findByCode(code);
    }
    @RequestMapping(value = "/loan/editdraft", method = RequestMethod.PUT)
    public void editLoanDraftbyUID(@RequestParam (value = "code") String code, @RequestBody LoanRequest loanRequest){
        Loan loan = loanRepository.findByCode(code);
        loanService.editDraft(loan,loanRequest);
    }
    @RequestMapping(value = "/loan/status", method = RequestMethod.GET)
    public String getStatus(@RequestParam(value = "code") String code){
        Loan loan = loanRepository.findByCode(code);
        return loan.getStatus();
    }
//    @RequestMapping(value = "/loan/getcode", method = RequestMethod.GET)
//    public String getCode(@RequestParam(value = "id") int id){
//
//    }


    @RequestMapping(value = "/loan/new", method = RequestMethod.POST)
    public void insertLoan(){
        Loan loan = new Loan();
        BigDecimal amount = new BigDecimal("1115.37");
        LocalDateTime localDate = LocalDateTime .now();
        loan.setAmount(amount);
        loan.setCode();
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
        loan.setPayMonth("January");
        loan.setPayYear(2019);
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

    @RequestMapping(value = "/loan/delete/{id}", method = RequestMethod.POST)
    public void deleteLoan(@PathVariable int id){
        Loan loan = loanRepository.findOne(id);
        loanRepository.delete(loan);
    }

}
