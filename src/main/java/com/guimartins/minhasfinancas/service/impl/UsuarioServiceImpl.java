package com.guimartins.minhasfinancas.service.impl;
import org.springframework.stereotype.Service;

import com.guimartins.minhasfinancas.exception.RegraNegocioException;
import com.guimartins.minhasfinancas.model.entity.Usuario;
import com.guimartins.minhasfinancas.model.repository.UsuarioRepository;
import com.guimartins.minhasfinancas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository repository;
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario antenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe um usuário cadastrado com este email.");
		}
		return existe;
	}
	
}
