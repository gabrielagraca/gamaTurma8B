package br.paduan.controle.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.controle.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
    
}
