/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ashik
 */
@Controller
public class Index {
    
    @RequestMapping(value = "index")
    protected String doRequest1(Model model){
        
        return "index";
    }
}
