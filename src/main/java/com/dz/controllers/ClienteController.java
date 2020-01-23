package com.dz.controllers;

import com.dz.utility.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.CLIENTE)
public class ClienteController {

    @GetMapping
    public String getCliente(){
        return "cliente";
    }
}
