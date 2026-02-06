package com.weg.hello.controller;

import com.weg.hello.model.Usuario;
import com.weg.hello.repository.UsuarioRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jefrey")
public class HelloWorldController {


    private UsuarioRepository repository;

    public HelloWorldController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Map<String, Object>> listar(){
        return repository.mostrarDados();
    }

    @PostMapping
    public String criar(@RequestBody Map<String, Object> dados){
            repository.salvarDados(dados.get("nome").toString(), dados.get("email").toString(), dados.get("data_cadastro").toString());

            return "Usuário " + dados.get("nome") + " foi salvo com sucesso";
    }



   /* @GetMapping
    public String helloJefrey() {

        return "We are charlie Kirk we carry the flame, we fight for the gospel, we honor his name";
    }*/



}
