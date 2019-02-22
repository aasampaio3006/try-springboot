package org.com.tryspringboot.service;

import org.com.tryspringboot.model.Convidado;
import org.com.tryspringboot.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvidadoService {
	
	@Autowired
	private ConvidadoRepository repository;	

	public Iterable<Convidado>  listaConvidados() {			
		Iterable<Convidado> convidados = repository.findAll();			
		return convidados;		
	}
	
	
	public void salvar(Convidado novoConvidado){	    
	    repository.save(novoConvidado);
	    Iterable<Convidado> convidados = repository.findAll();
	}

}
