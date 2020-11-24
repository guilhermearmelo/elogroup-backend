package com.example.elogroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elogroup.models.Lead;
import com.example.elogroup.models.Usuario;
import com.example.elogroup.repository.LeadRepository;
import com.example.elogroup.repository.UsuarioRepository;

@Service
public class LeadService {
	
	@Autowired
	private LeadRepository lr;
	
	@Autowired
	private UsuarioRepository ur;
	
	public List<Lead> listaLeads(){
		return lr.findAll();
	}
	
	public Lead listaLead(long id){
		return lr.findById(id);
	}
	
	public List<Lead> listaLeadByUser(long id){
		Usuario usuario = ur.findById(id);
		
		List<Lead> ll = usuario.getLeads();
		
		return ll;
	}
	
	public Lead salvaLead(Lead lead, long id) {
		Usuario usuario = ur.findById(id);
		
		List<Lead> ll = usuario.getLeads();
		ll.add(lead);
		usuario.setLeads(ll);
		
		ur.save(usuario);
		
		return lead;
		
		//return lr.save(lead);		
	}

	public Lead updateStatusLead(long id) {
		Lead lead = lr.findById(id);
		
		lead.setStatus(lead.getStatus()+1);
		
		lr.save(lead);

		return lead;
	}
}
