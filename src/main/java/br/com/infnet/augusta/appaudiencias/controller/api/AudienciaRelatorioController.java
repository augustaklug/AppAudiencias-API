package br.com.infnet.augusta.appaudiencias.controller.api;

import br.com.infnet.augusta.appaudiencias.model.negocio.AudienciaRelatorio;
import br.com.infnet.augusta.appaudiencias.model.repository.IAudienciaRelatorioRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/relatorioAudiencia")
public class AudienciaRelatorioController {
    @Autowired
    private IAudienciaRelatorioRepository repository;

    @ApiOperation(value = "Retornar a lista de audiências a cadastrar (simulação de integração com outro sistema)")
    @GetMapping
    public List<AudienciaRelatorio> obterLista(){
        return repository.listaPorData();
    }

}
