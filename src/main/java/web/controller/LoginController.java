package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.stringtemplate.v4.ST;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class LoginController {
    @GetMapping(value = "/login", produces = "text/html; charset=utf-8")
    public String loginstr(){

        return "login";
    }



}
