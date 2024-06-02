package com.app.opercam.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.opercam.model.entity.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {

}
