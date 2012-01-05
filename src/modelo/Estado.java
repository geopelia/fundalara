package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Estado generated by hbm2java
 */
@Entity
@Table(name = "estado")
public class Estado implements java.io.Serializable {

	private String codigoEstado;
	private String descripcion;
	private char estatus;
	private Set<EstadoMantenimiento> estadoMantenimientos = new HashSet<EstadoMantenimiento>(
			0);

	public Estado() {
	}

	public Estado(String codigoEstado, String descripcion, char estatus) {
		this.codigoEstado = codigoEstado;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public Estado(String codigoEstado, String descripcion, char estatus,
			Set<EstadoMantenimiento> estadoMantenimientos) {
		this.codigoEstado = codigoEstado;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.estadoMantenimientos = estadoMantenimientos;
	}

	@Id
	@Column(name = "codigo_estado", unique = true, nullable = false)
	public String getCodigoEstado() {
		return this.codigoEstado;
	}

	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
	public Set<EstadoMantenimiento> getEstadoMantenimientos() {
		return this.estadoMantenimientos;
	}

	public void setEstadoMantenimientos(
			Set<EstadoMantenimiento> estadoMantenimientos) {
		this.estadoMantenimientos = estadoMantenimientos;
	}

}