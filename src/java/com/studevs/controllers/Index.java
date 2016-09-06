/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.controllers;

import java.util.Date;
import java.util.Random;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ashik
 */
@Controller
public class Index {

    @RequestMapping(value = "index")
    public String doRequest1(Model model) {

        return "index";
    }

    @RequestMapping(value = "ajax_test")
    @ResponseBody
    public String doRequest2() {

//        JSONArray array = new JSONArray();
//        
//        JSONObject object1 = new JSONObject();
//        object1.put("number", String.valueOf(new Random().nextInt() * 1000)+" 1");
//        object1.put("date", new Date().toString()+" 1");
//        
//        JSONObject object2 = new JSONObject();
//        object2.put("number", String.valueOf(new Random().nextInt() * 1000)+" 2");
//        object2.put("date", new Date().toString()+" 2");
        
        JSONObject object3 = new JSONObject();
        object3.put("number", String.valueOf(new Random().nextInt() * 1000)+" 3");
        object3.put("date", new Date().toString()+" 3");
        
//        array.add(object1);
//        array.add(object2);
//        array.add(object3);
        
        return object3.toJSONString();
    }
}
