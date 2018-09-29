package es.us.gandro.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GAndroController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
