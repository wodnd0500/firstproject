package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")  //접속할 url 주소 넣어주기
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "재웅");
        return "greetings";   //templates/greetings.mustache  -> 브라우저로 전송, 반환하는 리턴 값 ==> view 페이지
    }

    @GetMapping("bye")
    public String goodBye(Model model){
        model.addAttribute("nickname", "최재웅");
        return "bye";
    }
}
