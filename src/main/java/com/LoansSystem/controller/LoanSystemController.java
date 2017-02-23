package com.LoansSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pov on 17.2.23.
 */

@RestController
public class LoanSystemController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {

        return "Hello Stranger!";
    }
}
