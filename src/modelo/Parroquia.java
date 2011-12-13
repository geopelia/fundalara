package modelo;

// Generated 12/12/2011 09:17:13 PM by Hibernate Tools 3.4.0.CR1

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
 * Parroquia generated by hbm2java
 */
@Entity
@Table(name = "parroquia")
public class Parroquia implements java.io.Serializable {

	private String codigoParroquia;
	private Municipio municipio;
	private String nombre;
	private Set<Jugador> jugadors = new HashSet<Jugador>(0);
	private Set<Institucion> institucions = new HashSet<Institucion>(0);
	private Set<Empleado> empleados = new HashSet<Empleado>(0);
	private Set<Benefactor> benefactors = new HashSet<Benefactor>(0);
	private Set<Familiar> familiars = new HashSet<Familiar>(0);
	private Set<Proveedor> proveedors = new HashSet<Proveedor>(0);
	private Set<Cliente> clientes = new HashSet<Cliente>(0);

	public Parroquia() {
	}

	public Parroquia(String codigoParroquia, Municipio municipio, String nombre) {
		this.codigoParroquia = codigoParroquia;
		this.municipio = municipio;
		this.nombre = nombre;
	}

	public Parroquia(String codigoParroquia, Municipio municipio,
			String nombre, Set<Jugador> jugadors,
			Set<Institucion> institucions, Set<Empleado> empleados,
			Set<Benefactor> benefactors, Set<Familiar> familiars,
			Set<Proveedor> proveedors, Set<Cliente> clientes) {
		this.codigoParroquia = codigoParroquia;
		this.municipio = municipio;
		this.nombre = nombre;
		this.jugadors = jugadors;
		this.institucions = institucions;
		this.empleados = empleados;
		this.benefactors = benefactors;
		this.familiars = familiars;
		this.proveedors = proveedors;
		this.clientes = clientes;
	}

	@Id
	@Column(name = "codigo_parroquia", unique = true, nullable = false)
	public String getCodigoParroquia() {
		return this.codigoParroquia;
	}

	public void setCodigoParroquia(String codigoParroquia) {
		this.codigoParroquia = codigoParroquia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_municipio", nullable = false)
	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parroquia")
	public Set<Jugador> getJugadors() {
		return this.jugadors;
	}

	public void setJugadors(Set<Jugador> jugadors) {
		this.jugadors = jugadors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parroquia")
	public Set<Institucion> getInstitucions() {
		return this.institucions;
	}

	public void setInstitucions(Set<Institucion> institucions) {
		this.institucions = institucions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parroquia")
	public Set<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parroquia")
	public Set<Benefactor> getBenefactors() {
		return this.benefactors;
	}

	public void setBenefactors(Set<Benefactor> benefactors) {
		this.benefactors = benefactors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parroquia")
	public Set<Familiar> getFamiliars() {
		return this.familiars;
	}

	public void setFamiliars(Set<Familiar> familiars) {
		this.familiars = familiars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parroquia")
	public Set<Proveedor> getProveedors() {
		return this.proveedors;
	}

	public void setProveedors(Set<Proveedor> proveedors) {
		this.proveedors = proveedors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parroquia")
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
