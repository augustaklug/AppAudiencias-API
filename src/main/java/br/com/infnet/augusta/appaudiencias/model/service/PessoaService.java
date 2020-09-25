package br.com.infnet.augusta.appaudiencias.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.augusta.appaudiencias.model.negocio.Pessoa;
import br.com.infnet.augusta.appaudiencias.model.repository.IPessoaRepository;

@Service
public class PessoaService {

	@Autowired private IPessoaRepository pessoaRepository;
	
	public void incluir(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}

	public List<Pessoa> obterLista(){
		return (List<Pessoa>) pessoaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void excluir(Integer id) {
		pessoaRepository.deleteById(id);
	}

	public Pessoa obterPorId(Integer id) {
		return pessoaRepository.findById(id).orElse(null);
	}
}