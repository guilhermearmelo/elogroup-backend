package com.example.elogroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.elogroup.models.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{
	public Lead findById(long id);
}
