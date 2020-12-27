package com.jasdev.sfgpetclinic.controller;

import com.jasdev.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {
    @Autowired
    VetService vetService;
    @RequestMapping({"/vets", "/vets/index"})
    public String listView(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
