package com.jasdev.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {
    @RequestMapping({"/vets", "/vets/index"})
    public String listView() {
        return "vets/index";
    }
}
