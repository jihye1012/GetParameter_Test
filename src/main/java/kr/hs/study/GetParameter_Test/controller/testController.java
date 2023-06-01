package kr.hs.study.GetParameter_Test.controller;

import kr.hs.study.GetParameter_Test.dto.login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/login")
        public String login_form(){
        return"login";
    }
//    @PostMapping("/re_login")
//    public String re_login(HttpServletRequest req){
//        String a=req.getParameter("user_id");
//        String b=req.getParameter("user_pass");
//
//        System.out.println("ID : "+a);
//        System.out.println("PASSWORD : "+b);
//        return "login";
//    }

//    @PostMapping("/re_login")
//    public String re_login(WebRequest req){
//        String a=req.getParameter("user_id");
//        String b=req.getParameter("user_pass");
//
//        System.out.println("ID : "+a);
//        System.out.println("PASSWORD : "+b);
//        return "login";
//    }

//    @PostMapping("/re_login")
//    public String re_login(@RequestParam("user_id") String id,
//                           @RequestParam("user_pass") String pass){
//        System.out.println("ID : "+id);
//        System.out.println("PASSWORD : "+pass);
//        return "login";
//    }

//    @PostMapping("/re_login")
//    public String re_login2(login l){
//        System.out.println("ID : "+l.getUser_id());
//        System.out.println("ID : "+l.getUser_pass());
//        return "login";
//    }

//    @PostMapping("/re_login")
//    public String re_login(HttpServletRequest req) {
//        String id=req.getParameter("user_id");
//        String pass=req.getParameter("user_pass");
//        String name=req.getParameter("user_name");
//        String email=req.getParameter("user_email");
//        String tel=req.getParameter("user_tel");
//        String local=req.getParameter("user_local");
//
//        System.out.println("ID : "+id);
//        System.out.println("Password : "+pass);
//        System.out.println("Name : "+name);
//        System.out.println("Email : "+email);
//        System.out.println("Tel : "+tel);
//        System.out.println("Local : "+local);
//
//
//        return "result";
//    }

//    @PostMapping("/re_login")
//    public String re_login(WebRequest req) {
//        String id=req.getParameter("user_id");
//        String pass=req.getParameter("user_pass");
//        String name=req.getParameter("user_name");
//        String email=req.getParameter("user_email");
//        String tel=req.getParameter("user_tel");
//        String local=req.getParameter("user_local");
//
//        System.out.println("ID : "+id);
//        System.out.println("Password : "+pass);
//        System.out.println("Name : "+name);
//        System.out.println("Email : "+email);
//        System.out.println("Tel : "+tel);
//        System.out.println("Local : "+local);
//
//
//        return "result";
//    }

//    @PostMapping("/re_login")
//    public String re_login(@RequestParam("user_id") String id,
//                           @RequestParam("user_pass") String pass,
//                           @RequestParam("user_name") String name,
//                           @RequestParam("user_email") String email,
//                           @RequestParam("user_tel") String tel,
//                           @RequestParam("user_local") String local) {
//
//        System.out.println("ID : "+id);
//        System.out.println("Password : "+pass);
//        System.out.println("Name : "+name);
//        System.out.println("Email : "+email);
//        System.out.println("Tel : "+tel);
//        System.out.println("Local : "+local);
//
//
//        return "result";
//    }

    @PostMapping("/re_login")
    public String re_login(@ModelAttribute login l) { //@ModelAttribute는 생략 가능함

        System.out.println("ID : "+l.getUser_id());
        System.out.println("Password : "+l.getUser_pass());
        System.out.println("Name : "+l.getUser_name());
        System.out.println("Email : "+l.getUser_email());
        System.out.println("Tel : "+l.getUser_tel());
        System.out.println("Local : "+l.getUser_local());


        return "result";
    }



}
