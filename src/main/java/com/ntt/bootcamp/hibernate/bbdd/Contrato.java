
package com.ntt.bootcamp.hibernate.bbdd;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "contratos")
public class Contrato {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
	private Long identificador;
	
	@Column(name = "VIGENCIA", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fechaVigencia;
	
	@Column(name = "CADUCIDAD", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fechaCaducidad;
	
	@Column(name = "PRECIO", nullable=false)
	private Double precioMensual;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "CLIENTE_ID", referencedColumnName="ID", nullable=false)
	private Long ClienteId;

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Double getPrecioMensual() {
		return precioMensual;
	}

	public void setPrecioMensual(Double precioMensual) {
		this.precioMensual = precioMensual;
	}

	public Long getClienteId() {
		return ClienteId;
	}

	public void setClienteId(Long clienteId) {
		ClienteId = clienteId;
	}

	@Override
	public String toString() {
		return "Contrato [identificador=" + identificador + ", fechaVigencia=" + fechaVigencia + ", fechaCaducidad="
				+ fechaCaducidad + ", precioMensual=" + precioMensual + ", ClienteId=" + ClienteId + "]";
	}
	
	
}
