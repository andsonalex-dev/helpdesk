package com.andson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andson.helpdesk.domain.Tecnico;


public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
