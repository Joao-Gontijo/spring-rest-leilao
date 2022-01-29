package br.edu.ifg.sistemaleilao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifg.sistemaleilao.model.Leilao;
import br.edu.ifg.sistemaleilao.repositoy.LeilaoRepository;

@Service
public class LeilaoService {

	@Autowired
	LeilaoRepository repository;

	public Leilao save(Leilao leilao) {
		return repository.save(leilao);
	}
	
	public void delete(Leilao leilao) {
		repository.delete(leilao);
	}
	
	public List<Leilao> findAll() {
		return repository.findAll();
	}
	
}
