package br.com.infnet.augusta.appaudiencias.model.negocio;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Audiencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String processo;
	@ManyToMany(cascade = CascadeType.DETACH)	
	@JoinTable(joinColumns = {@JoinColumn(name="idAudiencia")},
		inverseJoinColumns = {@JoinColumn(name="idParticipante")})
	private List<Pessoa> participantes;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;
	@DateTimeFormat(pattern="HH:mm")
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	private LocalTime hora;
	private Boolean cumprida = false;

	public Audiencia() {
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

	public List<Pessoa> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Pessoa> participantes) {
		this.participantes = participantes;
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

	public Boolean getCumprida() {
		return cumprida;
	}

	public void setCumprida(Boolean cumprida) {
		this.cumprida = cumprida;
	}
}
