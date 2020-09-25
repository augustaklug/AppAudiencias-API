package br.com.infnet.augusta.appaudiencias.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.augusta.appaudiencias.model.negocio.Pessoa;

@Repository
public interface IPessoaRepository extends CrudRepository<Pessoa, Integer> {

	List<Pessoa> findAll(Sort by);
}
