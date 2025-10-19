package dev.jacquesonlima.CadastroDeNinjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, world!";
    }

}
