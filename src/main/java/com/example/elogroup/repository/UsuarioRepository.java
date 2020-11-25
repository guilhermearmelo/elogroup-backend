package com.example.elogroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.example.elogroup.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Usuario findById(long id);
	public List<Usuario> findByNomeAndSenha(String nome, String senha);
	public List<Usuario> findByNome(String nome);
}
