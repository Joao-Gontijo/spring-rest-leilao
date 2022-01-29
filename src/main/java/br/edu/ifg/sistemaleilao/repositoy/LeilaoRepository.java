package br.edu.ifg.sistemaleilao.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifg.sistemaleilao.model.Leilao;

@Repository
public interface LeilaoRepository extends JpaRepository<Leilao, Long>{

}
