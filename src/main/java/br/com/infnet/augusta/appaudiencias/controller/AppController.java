package br.com.infnet.augusta.appaudiencias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping("/")
    public String greeting() {
        return "redirect:/swagger-ui.html";
    }
}
