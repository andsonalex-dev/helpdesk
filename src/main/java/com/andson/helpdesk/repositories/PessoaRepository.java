package com.andson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andson.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
