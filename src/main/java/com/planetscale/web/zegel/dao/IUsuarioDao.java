package com.planetscale.web.zegel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetscale.web.zegel.model.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer>{

}
