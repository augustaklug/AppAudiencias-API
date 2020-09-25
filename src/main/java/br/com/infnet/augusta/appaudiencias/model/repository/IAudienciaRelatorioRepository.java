package br.com.infnet.augusta.appaudiencias.model.repository;

import br.com.infnet.augusta.appaudiencias.model.negocio.AudienciaRelatorio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAudienciaRelatorioRepository extends CrudRepository<AudienciaRelatorio, Integer> {
    @Query("from AudienciaRelatorio a ORDER BY a.data")
    List<AudienciaRelatorio> listaPorData();
}
