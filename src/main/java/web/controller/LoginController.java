package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {
    @GetMapping(value = "/login", produces = "text/html; charset=utf-8")
    public String loginstr(){

        return "login";
    }



}
