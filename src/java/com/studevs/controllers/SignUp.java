/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.controllers;

import com.studevs.models.UserInformation;
import com.studevs.models.providers.UserInformationProvider;
import com.studevs.utils.providers.BeanProvider;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ashik
 */
@Controller
public class SignUp {
    
    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String doRequest1(){
        
        return "signup";
    }
    
    
    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public String doRequest2(Model model,
            HttpServletRequest request,
            @ModelAttribute(value = "userInformation")UserInformation userInformation,
            BindingResult bindingResult){
        
        try {
            
            if(bindingResult.hasErrors()){
                
                return "index";
            }else{
                
                UserInformationProvider uip = (UserInformationProvider)new BeanProvider().getBean("userInformationProvider");
                
                if(uip.insertUserInformation(userInformation)){
                    
                    request.getSession().setAttribute("userInformation", userInformation);
                    return "home";
                }else{
                    
                    return "signup";
                }
            }
        } catch (Exception e) {
            
            return "index";
        }
    }
}
