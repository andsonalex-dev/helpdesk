package com.andson.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andson.helpdesk.domain.Chamado;
import com.andson.helpdesk.domain.Cliente;
import com.andson.helpdesk.domain.Tecnico;
import com.andson.helpdesk.domain.enums.Perfil;
import com.andson.helpdesk.domain.enums.Prioridade;
import com.andson.helpdesk.domain.enums.Status;
import com.andson.helpdesk.repositories.ChamadoRepository;
import com.andson.helpdesk.repositories.ClienteRepository;
import com.andson.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	/**
	 * Gerenciar as instancias do BD, injeção de dependencias
	 */
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		// TODO Auto-generated method stub
		Tecnico tec1 = new Tecnico(null, "Andson de Oliveira", "902.503.840-94", "andson@email.com", "1234");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "José Pereira", "082.121.610-48", "cliente@email.com", "123");
		cli1.addPerfil(Perfil.CLIENTE);

		Chamado ch1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 1", "Primeiro chamado de teste",
				tec1, cli1);

		// instancias criadas e agora salvando
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(ch1));
	}

}
