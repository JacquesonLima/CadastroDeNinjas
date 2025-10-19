package dev.jacquesonlima.CadastroDeNinjas.Controller;

import dev.jacquesonlima.CadastroDeNinjas.Repository.MissoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MissoesController {

    @Autowired
    MissoesRepository missoesRepository;

    @GetMapping("/missoes")
    public List<Long> listaDeMissoes() {
        return missoesRepository.findAll();
    }

}
