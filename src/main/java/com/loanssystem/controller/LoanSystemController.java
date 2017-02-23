package com.loanssystem.controller;

import com.loanssystem.bean.Application;
import com.loanssystem.repositories.ApplicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pov on 17.2.23.
 */

@RestController
public class LoanSystemController {
    @Autowired
    private ApplicationsRepository applicationsRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {

        return "Hello Stranger!";
    }
//    @RequestMapping(value = "/user", method = RequestMethod.POST)
//    public void createApplication(@RequestBody ApplicationRequest) {
//        applicationservice.createApplication(application);
//    }
    @RequestMapping(value = "/Applications", method = RequestMethod.GET)
    public Iterable<Application> getApplications(){
        return applicationsRepository.findAll();
    }

}
