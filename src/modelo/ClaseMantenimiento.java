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
 * ClaseMantenimiento generated by hbm2java
 */
@Entity
@Table(name = "clase_mantenimiento")
public class ClaseMantenimiento implements java.io.Serializable {

	private String codigoClaseMantenimiento;
	private String descripcion;
	private char estatus;
	private Set<TipoMantenimiento> tipoMantenimientos = new HashSet<TipoMantenimiento>(
			0);

	public ClaseMantenimiento() {
	}

	public ClaseMantenimiento(String codigoClaseMantenimiento,
			String descripcion, char estatus) {
		this.codigoClaseMantenimiento = codigoClaseMantenimiento;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public ClaseMantenimiento(String codigoClaseMantenimiento,
			String descripcion, char estatus,
			Set<TipoMantenimiento> tipoMantenimientos) {
		this.codigoClaseMantenimiento = codigoClaseMantenimiento;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.tipoMantenimientos = tipoMantenimientos;
	}

	@Id
	@Column(name = "codigo_clase_mantenimiento", unique = true, nullable = false)
	public String getCodigoClaseMantenimiento() {
		return this.codigoClaseMantenimiento;
	}

	public void setCodigoClaseMantenimiento(String codigoClaseMantenimiento) {
		this.codigoClaseMantenimiento = codigoClaseMantenimiento;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "claseMantenimiento")
	public Set<TipoMantenimiento> getTipoMantenimientos() {
		return this.tipoMantenimientos;
	}

	public void setTipoMantenimientos(Set<TipoMantenimiento> tipoMantenimientos) {
		this.tipoMantenimientos = tipoMantenimientos;
	}

}
