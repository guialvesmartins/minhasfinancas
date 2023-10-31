package com.guimartins.minhasfinancas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.guimartins.minhasfinancas.model.entity.Usuario;
import com.guimartins.minhasfinancas.service.UsuarioService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UsuarioRepositoryTest {
	
	@Autowired
    private UsuarioService usuarioService;
    
    @Test
    public void deveVerificarAExistenciaDeUmEmail() {
    
        //cenario
        Usuario usuario = new Usuario();
        usuario.setNome("usuario");
        usuario.setEmail("usuario@email.com");
        usuarioService.salvarUsuario(usuario);
        //acao
        Boolean result = usuarioService.validarEmail("usuario@email.com");
        //verificacao
        Assertions.assertThat(result);
    }


    @TestConfiguration
    static class TestConfig {
        @Bean
        public UsuarioService usuarioService() {
            return new UsuarioService() {
                @Override
                public Usuario antenticar(String email, String senha) {
                    return null;
                }

                @Override
                public Usuario salvarUsuario(Usuario usuario) {
                    return null;
                }

                @Override
                public Boolean validarEmail(String email) {
                    return null;
                }
            };
        }
    }
	
}

