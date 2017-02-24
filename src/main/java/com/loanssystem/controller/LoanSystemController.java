package com.loanssystem.controller;

import com.loanssystem.service.LoanService;
import com.loanssystem.bean.request.LoanRequest;
import com.loanssystem.repository.LoanRepository;
import com.loanssystem.bean.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pov on 17.2.23.
 */

@RestController
public class LoanSystemController {

    @Autowired
    private LoanRepository applicationsRepository;
    @Autowired
    private LoanService applicationService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {

        return "Hello Stranger!";
    }

    //Method for viewing all applications from applications repo
    @RequestMapping(value = "/applications", method = RequestMethod.GET)
    public Iterable<Loan> getApplications(){
        return applicationsRepository.findAll();
    }

    //Method for posting an application to app repo
    @RequestMapping(value = "/application/create", produces = "application/json",method = RequestMethod.POST)
    public void addApplication(@RequestBody LoanRequest applicationRequest){
        applicationService.createApplication(applicationRequest);
    }


    @RequestMapping(value = "/app/new", method = RequestMethod.POST)
    public void insertCategory(){
        Loan app = new Loan();
        app.setAmount(4444);
        applicationsRepository.save(app);
    }

}
