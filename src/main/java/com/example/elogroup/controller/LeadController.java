package com.example.elogroup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.elogroup.models.Lead;
import com.example.elogroup.service.LeadService;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*")
public class LeadController {

	@Autowired
	LeadService ls;
	
	@GetMapping("/leads")
	public List<Lead> listaLeads(){
		return ls.listaLeads();
	}
	
	@GetMapping("/lead/{id}")
	public Lead listaLead(@PathVariable(value="id")long id){
		return ls.listaLead(id);
	}
	
	@PostMapping("/lead/{id}")
	public Lead salvaLead(@RequestBody Lead lead, @PathVariable(value="id")long id) {
		return ls.salvaLead(lead, id);
	}
	
	@GetMapping("/leadbyuser/{id}")
	public List<Lead> listaLeadByUser(@PathVariable(value="id")long id){
		return ls.listaLeadByUser(id);
	}
	
}
