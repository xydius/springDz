package com.dz.controllers;

import com.dz.utility.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.CHARLIE)
public class Charlie {

    @GetMapping(UrlConstants.CHARLIE)
    public String goCustomer(){
        return "charliecharlie";
    }
}
