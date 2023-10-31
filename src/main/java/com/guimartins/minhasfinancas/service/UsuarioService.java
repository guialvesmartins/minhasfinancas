package com.guimartins.minhasfinancas.service;

import org.springframework.stereotype.Service;

import com.guimartins.minhasfinancas.model.entity.Usuario;

@Service
public interface UsuarioService {
	
	Usuario antenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	Boolean validarEmail(String email);
		
}
