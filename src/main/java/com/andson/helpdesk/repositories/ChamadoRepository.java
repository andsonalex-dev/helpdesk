package com.andson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andson.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
