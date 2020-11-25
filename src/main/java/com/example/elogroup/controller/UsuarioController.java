package com.example.elogroup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.elogroup.dto.UsuarioDto;
import com.example.elogroup.models.Usuario;
import com.example.elogroup.repository.UsuarioRepository;
import com.example.elogroup.service.UsuarioService;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*")
public class UsuarioController {

	@Autowired
	UsuarioService us;
		
	@GetMapping("/usuarios")
	public List<Usuario> listaUsuarios(){
		return us.listaUsuarios();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario listaUsuario(@PathVariable(value="id")long id){
		return us.listaUsuario(id);
	}
	
	@PostMapping("/usuario")
	public Usuario salvaUsuario(@RequestBody Usuario usuario) {
		return us.salvaUsuario(usuario);		
	}
	
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody UsuarioDto usuariodto) {
		return us.login(usuariodto);
	}
	
	@GetMapping("/isAUser/{userName}")
	public boolean isAUser(@PathVariable(value="userName") String nome){
		return us.isAUser(nome);
	}
}
