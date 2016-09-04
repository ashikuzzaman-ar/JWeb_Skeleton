/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ashik
 */
@Controller
public class Home {
    
    @RequestMapping(value = "home", method = RequestMethod.POST)
    public String doRequest1(){
        
        try {
            
            return "home";
        } catch (Exception e) {
            
            return "index";
        }
    }
}
