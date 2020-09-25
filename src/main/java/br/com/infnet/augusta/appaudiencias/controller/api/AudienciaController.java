package br.com.infnet.augusta.appaudiencias.controller.api;

import java.util.List;

import br.com.infnet.augusta.appaudiencias.model.negocio.Audiencia;
import br.com.infnet.augusta.appaudiencias.model.service.AudienciaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/audiencias")
public class AudienciaController {

	@Autowired
	private AudienciaService audienciaService;

	@ApiOperation(value = "Retornar uma lista de audiências")
	@GetMapping
	public List<Audiencia> obterLista() {
		return audienciaService.obterLista();
	}

	@ApiOperation(value = "Cadastrar uma nova audiência")
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Audiencia audiencia) {
		audienciaService.incluir(audiencia);
	}

	@ApiOperation(value = "Remover uma audiência existente")
	@DeleteMapping(value = "/excluir/{id}")
	public void excluir(@PathVariable Integer id) {
		audienciaService.excluir(id);
	}

	@ApiOperation(value = "Buscar uma audiência por id")
	@GetMapping(value = "/{id}")
	public Audiencia consultar(@PathVariable Integer id) {
		return audienciaService.obterPorId(id);
	}
}