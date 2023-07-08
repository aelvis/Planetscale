package com.planetscale.web.zegel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetscale.web.zegel.dao.IUsuarioDao;
import com.planetscale.web.zegel.model.Usuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	public List<Usuario> listarUsuario() {
		return usuarioDao.findAll();
	}

}
