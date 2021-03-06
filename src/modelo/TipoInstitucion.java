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
 * TipoInstitucion generated by hbm2java
 */
@Entity
@Table(name = "tipo_institucion")
public class TipoInstitucion implements java.io.Serializable {

	private String codigoTipo;
	private String nombre;
	private char estatus;
	private Set<Institucion> institucions = new HashSet<Institucion>(0);

	public TipoInstitucion() {
	}

	public TipoInstitucion(String codigoTipo, String nombre, char estatus) {
		this.codigoTipo = codigoTipo;
		this.nombre = nombre;
		this.estatus = estatus;
	}

	public TipoInstitucion(String codigoTipo, String nombre, char estatus,
			Set<Institucion> institucions) {
		this.codigoTipo = codigoTipo;
		this.nombre = nombre;
		this.estatus = estatus;
		this.institucions = institucions;
	}

	@Id
	@Column(name = "codigo_tipo", unique = true, nullable = false)
	public String getCodigoTipo() {
		return this.codigoTipo;
	}

	public void setCodigoTipo(String codigoTipo) {
		this.codigoTipo = codigoTipo;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoInstitucion")
	public Set<Institucion> getInstitucions() {
		return this.institucions;
	}

	public void setInstitucions(Set<Institucion> institucions) {
		this.institucions = institucions;
	}

}
