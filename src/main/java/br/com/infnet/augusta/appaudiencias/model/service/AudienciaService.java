package br.com.infnet.augusta.appaudiencias.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.augusta.appaudiencias.model.negocio.Audiencia;
import br.com.infnet.augusta.appaudiencias.model.repository.IAudienciaRepository;

@Service
public class AudienciaService {

	@Autowired private IAudienciaRepository repository;
	
	public void incluir(Audiencia audiencia) {
		repository.save(audiencia);
	}
	
	public List<Audiencia> obterLista(){
		return (List<Audiencia>)repository.findAll(Sort.by(Sort.Direction.ASC, "data"));
	}

	public Audiencia obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}