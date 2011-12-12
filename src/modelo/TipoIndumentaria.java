package modelo;

// Generated 11/12/2011 04:17:03 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoIndumentaria generated by hbm2java
 */
@Entity
@Table(name = "tipo_indumentaria")
public class TipoIndumentaria implements java.io.Serializable {

	private String codigoIndumentaria;
	private char estatus;
	private String nombre;
	private Set<Talla> tallas = new HashSet<Talla>(0);

	public TipoIndumentaria() {
	}

	public TipoIndumentaria(String codigoIndumentaria, char estatus,
			String nombre) {
		this.codigoIndumentaria = codigoIndumentaria;
		this.estatus = estatus;
		this.nombre = nombre;
	}

	public TipoIndumentaria(String codigoIndumentaria, char estatus,
			String nombre, Set<Talla> tallas) {
		this.codigoIndumentaria = codigoIndumentaria;
		this.estatus = estatus;
		this.nombre = nombre;
		this.tallas = tallas;
	}

	@Id
	@Column(name = "codigo_indumentaria", unique = true, nullable = false)
	public String getCodigoIndumentaria() {
		return this.codigoIndumentaria;
	}

	public void setCodigoIndumentaria(String codigoIndumentaria) {
		this.codigoIndumentaria = codigoIndumentaria;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoIndumentaria")
	public Set<Talla> getTallas() {
		return this.tallas;
	}

	public void setTallas(Set<Talla> tallas) {
		this.tallas = tallas;
	}

}