package modelo;

// Generated 12/12/2011 09:17:13 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Liga generated by hbm2java
 */
@Entity
@Table(name = "liga")
public class Liga implements java.io.Serializable {

	private String codigoLiga;
	private byte[] logo;
	private String nombre;
	private Set<Categoria> categorias = new HashSet<Categoria>(0);

	public Liga() {
	}

	public Liga(String codigoLiga, byte[] logo, String nombre) {
		this.codigoLiga = codigoLiga;
		this.logo = logo;
		this.nombre = nombre;
	}

	public Liga(String codigoLiga, byte[] logo, String nombre,
			Set<Categoria> categorias) {
		this.codigoLiga = codigoLiga;
		this.logo = logo;
		this.nombre = nombre;
		this.categorias = categorias;
	}

	@Id
	@Column(name = "codigo_liga", unique = true, nullable = false)
	public String getCodigoLiga() {
		return this.codigoLiga;
	}

	public void setCodigoLiga(String codigoLiga) {
		this.codigoLiga = codigoLiga;
	}

	@Column(name = "logo", nullable = false)
	public byte[] getLogo() {
		return this.logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "liga_categoria", joinColumns = { @JoinColumn(name = "codigo_liga", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "codigo_categoria", nullable = false, updatable = false) })
	public Set<Categoria> getCategorias() {
		return this.categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}

}
