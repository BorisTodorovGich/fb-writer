package com.fbmanager.fbwriter.controller;

import javafx.scene.input.DataFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
public class Test {

    @GetMapping(value = "/test")
    public String test(Model model){

        model.addAttribute("serverTime", new Date());

        return "test";
    }

}
