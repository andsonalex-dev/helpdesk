package com.andson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andson.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
