package com.example.spring_azure_devops_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/azure-devops")
public class DemoController {

    @GetMapping("/message")
    public String getMessage(){
        return "Congrats!! Your deployed to Azure..";
    }

    @GetMapping("/message2")
    public String getMessage2(){
        return "Congrats!! This is second message...!!";
    }
}
