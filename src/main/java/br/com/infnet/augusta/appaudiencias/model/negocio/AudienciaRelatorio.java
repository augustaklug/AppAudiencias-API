package br.com.infnet.augusta.appaudiencias.model.negocio;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "API_Audiencia")
public class AudienciaRelatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String processo;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date data;
    @DateTimeFormat(pattern="HH:mm")
    @JsonSerialize(using = LocalTimeSerializer.class)
    private LocalTime hora;

    public AudienciaRelatorio() {
    }

    public AudienciaRelatorio(String processo, Date data, LocalTime hora) {
        this.processo = processo;
        this.data = data;
        this.hora = hora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
