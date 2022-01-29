package br.edu.ifg.sistemaleilao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifg.sistemaleilao.model.Lance;
import br.edu.ifg.sistemaleilao.repositoy.LanceRepository;

@Service
public class LanceService {
	
	@Autowired
	LanceRepository repository;

	public List<Lance> findAll(){
		return repository.findAll();
	}
	
	public Lance save(Lance lance) {
		return repository.save(lance);
	}
	
	public void delete(Lance lance) {
		repository.delete(lance);
	}

}
