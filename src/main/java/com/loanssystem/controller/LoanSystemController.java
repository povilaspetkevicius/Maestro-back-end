package com.loanssystem.controller;

import com.loanssystem.Services.ApplicationService;
import com.loanssystem.bean.entity.Application;
import com.loanssystem.bean.request.ApplicationRequest;
import com.loanssystem.repository.ApplicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pov on 17.2.23.
 */

@RestController
public class LoanSystemController {

    @Autowired
    private ApplicationsRepository applicationsRepository;
    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {

        return "Hello Stranger!";
    }

    //Method for viewing all applications from applications repo
    @RequestMapping(value = "/applications", method = RequestMethod.GET)
    public Iterable<Application> getApplications(){
        return applicationsRepository.findAll();
    }

    //Method for posting an application to app repo
    @RequestMapping(value = "/application/create", produces = "application/json",method = RequestMethod.POST)
    public void addApplication(@RequestBody ApplicationRequest applicationRequest){
        applicationService.createApplication(applicationRequest);
    }


    @RequestMapping(value = "/app/new", method = RequestMethod.POST)
    public void insertCategory(){
        Application app = new Application();
        app.setAmount(4444);
        applicationsRepository.save(app);
    }

}
