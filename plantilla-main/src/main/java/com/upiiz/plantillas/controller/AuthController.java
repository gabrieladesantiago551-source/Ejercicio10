package com.upiiz.plantillas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class AuthController {
    //De las plantillas busacar la carpeta css,js y plugins
//http://localhost:8080/auth/login
// http://localhost:8080/auth/register
   @GetMapping("/login")
   public String login() {
       return "login";

   }
@GetMapping("/register")
    public String register(){

       return "register";
}

    @GetMapping("/forgot")
    public String forgot(){

        return "forgot-password";
    }



}
