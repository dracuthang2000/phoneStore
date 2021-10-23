package com.example.phonestore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping("/index")
    public String test(){

        return "product/phone";
    }
    @RequestMapping("/index2")
    public String test2(){

        return "text2";
    }
}
