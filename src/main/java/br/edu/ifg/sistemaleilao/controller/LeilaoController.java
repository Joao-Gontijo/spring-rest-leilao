package br.edu.ifg.sistemaleilao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifg.sistemaleilao.model.Leilao;
import br.edu.ifg.sistemaleilao.service.LeilaoService;

@RestController
@RequestMapping(value = "/leilao")
public class LeilaoController {
	
	@Autowired
	LeilaoService service; 

	@GetMapping("/leiloes")
	public List<Leilao> listaLeiloes(){
		return service.findAll();
	}
	
	@PostMapping("/leilao")
	public Leilao salvarLeilao(@RequestBody Leilao leilao) {
		return service.save(leilao);
	}
	
	@DeleteMapping("/leilao")
	public void deletaLeilao(@RequestBody Leilao leilao) {
		service.delete(leilao);
	}
	
	@PutMapping("/leilao")
	public Leilao updateLeilao(@RequestBody Leilao leilao) {
		return service.save(leilao);
	}
}
