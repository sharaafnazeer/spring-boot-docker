package com.sharaafnazeer.springbootdocker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value="/")
    public String index() {
        return "Hey there!. This is Spring Boot from Docker ;)";
    }
}
