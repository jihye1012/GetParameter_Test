package kr.hs.study.GetParameter_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class homeController {
    @GetMapping("/index")
    public String index(HttpServletRequest req){
        return "index";
    }

}

