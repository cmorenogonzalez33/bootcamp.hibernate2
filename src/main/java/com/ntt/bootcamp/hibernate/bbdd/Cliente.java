package com.ntt.bootcamp.hibernate.bbdd;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
	private Long id;
	
	@Column(name = "nombre", nullable=false)
	private String nombre;
	
	@Column(name = "primerApellido", nullable=false)
	private String primerApellido;
	
	@Column(name="segundoApellido", nullable=false)
	private String segundoApellido;
	
	@Column(name="nif", nullable=false, unique=true, length = 9)
	private String nif;
	
	@OneToMany(mappedBy="ClienteId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Contrato> contratos;

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", nif=" + nif + "]";
	}

}
