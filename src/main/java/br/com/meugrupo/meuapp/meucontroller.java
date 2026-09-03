package br.com.meugrupo.meuapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class meucontroller {
    @GetMapping
    public String mensagem() {
        System.out.println("resposta da api rest.");
        return "resposta da api rest.";
    }

}