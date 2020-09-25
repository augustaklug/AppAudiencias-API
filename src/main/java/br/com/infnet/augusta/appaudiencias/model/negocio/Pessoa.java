package br.com.infnet.augusta.appaudiencias.model.negocio;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String telefone;
	@ManyToMany(mappedBy = "participantes")
	@JsonBackReference
	private List<Audiencia> audiencias;
	private Boolean intimada = false;

	public Pessoa() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Audiencia> getAudiencias() {
		return audiencias;
	}

	public void setAudiencias(List<Audiencia> audiencias) {
		this.audiencias = audiencias;
	}

	public Boolean getIntimada() {
		return intimada;
	}

	public void setIntimada(Boolean intimada) {
		this.intimada = intimada;
	}
}