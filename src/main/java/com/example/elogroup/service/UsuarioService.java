package com.example.elogroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.elogroup.dto.UsuarioDto;
import com.example.elogroup.models.Usuario;
import com.example.elogroup.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository ur;
	
	public List<Usuario> listaUsuarios(){
		return ur.findAll();
	}
	
	public Usuario listaUsuario(long id){
		return ur.findById(id);
	}
	
	public Usuario salvaUsuario(Usuario usuario) {
		return ur.save(usuario);		
	}
	
	public ResponseEntity<Usuario> login( UsuarioDto usuariodto) {
		
		List<Usuario> list = ur.findByNomeAndSenha(usuariodto.getNome(), usuariodto.getSenha());
		if(list.isEmpty()) {
			Usuario usuario = new Usuario();
			usuario.setId(-1);
			return new ResponseEntity<Usuario>(usuario,HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<Usuario>(list.get(0),HttpStatus.OK);
		}
	}
	
	public Usuario parseDtoToEntity(UsuarioDto usuariodto) {
		Usuario usuario = new Usuario();
		usuario.setNome(usuariodto.getNome());
		usuario.setSenha(usuariodto.getSenha());
		
		return usuario;
	}
}