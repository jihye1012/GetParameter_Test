package kr.hs.study.GetParameter_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req){
        return "test1";
    }
    @GetMapping("/test2")
    public String test2(HttpServletRequest req, Model model){
        String a=req.getParameter("data1");
        String b=req.getParameter("data2");
        //data1, data2를 model에 넣는다.
        model.addAttribute("d1",a);
        model.addAttribute("d2",b);

        return "test2";
    }

    @GetMapping("/test3/{data1}/{data2}")
    public String test3 (@PathVariable String data1,
                         @PathVariable String data2,Model model){
        model.addAttribute("d1",data1);
        model.addAttribute("d2",data2);
        return "test3";
    }

    @GetMapping("/test4")
    public String test4 (@RequestParam ("data1") String d1,
                         @RequestParam("data2") String d2, Model model){
        model.addAttribute("d1",d1);
        model.addAttribute("d2",d2);
        return "test4";
    }



}
