package modelo;

// Generated 10/12/2011 11:05:49 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Municipio generated by hbm2java
 */
@Entity
@Table(name = "municipio")
public class Municipio implements java.io.Serializable {

	private String codigoMunicipio;
	private EstadoVenezuela estadoVenezuela;
	private String nombre;
	private Set<Parroquia> parroquias = new HashSet<Parroquia>(0);

	public Municipio() {
	}

	public Municipio(String codigoMunicipio, EstadoVenezuela estadoVenezuela,
			String nombre) {
		this.codigoMunicipio = codigoMunicipio;
		this.estadoVenezuela = estadoVenezuela;
		this.nombre = nombre;
	}

	public Municipio(String codigoMunicipio, EstadoVenezuela estadoVenezuela,
			String nombre, Set<Parroquia> parroquias) {
		this.codigoMunicipio = codigoMunicipio;
		this.estadoVenezuela = estadoVenezuela;
		this.nombre = nombre;
		this.parroquias = parroquias;
	}

	@Id
	@Column(name = "codigo_municipio", unique = true, nullable = false)
	public String getCodigoMunicipio() {
		return this.codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_estado", nullable = false)
	public EstadoVenezuela getEstadoVenezuela() {
		return this.estadoVenezuela;
	}

	public void setEstadoVenezuela(EstadoVenezuela estadoVenezuela) {
		this.estadoVenezuela = estadoVenezuela;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "municipio")
	public Set<Parroquia> getParroquias() {
		return this.parroquias;
	}

	public void setParroquias(Set<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}

}
