package br.com.infnet.augusta.appaudiencias.controller.api;

import java.util.List;

import br.com.infnet.augusta.appaudiencias.model.negocio.Pessoa;
import br.com.infnet.augusta.appaudiencias.model.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

	@Autowired private PessoaService pessoaService;
	
	@ApiOperation(value = "Cadastrar uma nova pessoa")
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Pessoa pessoa) {
		pessoaService.incluir(pessoa);
	}

	@ApiOperation(value = "Retornar uma lista de pessoas")
	@GetMapping
	public List<Pessoa> obterLista() {
		return pessoaService.obterLista();
	}

	@ApiOperation(value = "Remover uma pessoa existente")
	@DeleteMapping(value = "/excluir/{id}")
	public void excluir(@PathVariable Integer id) {
		pessoaService.excluir(id);
	}

	@ApiOperation(value = "Buscar uma pessoa por id")
	@GetMapping(value = "/{id}")
	public Pessoa obterPorId(@PathVariable Integer id) {
		return pessoaService.obterPorId(id);
	}
}