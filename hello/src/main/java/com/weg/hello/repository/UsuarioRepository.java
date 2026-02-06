package com.weg.hello.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UsuarioRepository {

    private JdbcTemplate jdbc;

    public UsuarioRepository(JdbcTemplate jdbc){

        this.jdbc = jdbc;
    }

    public List<Map<String, Object>> mostrarDados() {
        return  jdbc.queryForList("SELECT * FROM usuarios");
    }

    public void salvarDados(String nome, String email, String data_cadastro) {
        String sql = "INSERT INTO usuarios (nome, email, data_cadastro) VALUES (?, ?, ?)";
        jdbc.update(sql, nome, email, data_cadastro);

    }


}
