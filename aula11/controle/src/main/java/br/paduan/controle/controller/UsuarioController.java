package br.paduan.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.controle.dao.UsuarioDAO;
import br.paduan.controle.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("/usuarios")
    public List<Usuario> buscarTodos(){
        List<Usuario> lista = (List<Usuario>)dao.findAll();
        return lista;
    }

    
}
