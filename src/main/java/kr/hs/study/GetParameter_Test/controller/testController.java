package kr.hs.study.GetParameter_Test.controller;

import kr.hs.study.GetParameter_Test.dto.test7;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/test5")
    public ModelAndView test5(@RequestParam String data7,
                              @RequestParam String data8,
                              ModelAndView mv){
        mv.addObject("data7",data7);
        mv.addObject("data8",data8);
        mv.setViewName("test5");
        return mv;
    }

    @GetMapping("/test6")
    public String test6(Model model){
        model.addAttribute("name","kim");
        model.addAttribute("password","1111");
        return "test6";
    }

    @GetMapping("/test7")
    public String test7(@ModelAttribute test7 t, Model model){
        String d8=t.getData8();
        String d9=t.getData9();
        model.addAttribute("d8",d8);
        model.addAttribute("d9",d9);
        return "test7";
    }



}
