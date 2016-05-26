/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ashik
 */
@Controller
public class Index {
    
    @RequestMapping(value = "index", method = RequestMethod.GET)
    protected String doGet1(Model model){
        
        try {
            
            return "index";
        } catch (Exception e) {
            
            return "index";
        }
    }
}
