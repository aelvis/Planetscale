package com.planetscale.web.zegel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.planetscale.web.zegel.model.Usuario;
import com.planetscale.web.zegel.service.IUsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/listar")
	public String index(Model model) {
		
		List<Usuario> users = usuarioService.listarUsuario();
		
		model.addAttribute("usuarios", users);
		
		return "index";
	}
	
	
}
