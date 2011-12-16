package modelo;

// Generated 16/12/2011 03:51:27 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Temporada generated by hbm2java
 */
@Entity
@Table(name = "temporada")
public class Temporada implements java.io.Serializable {

	private String codigoTemporada;
	private Categoria categoria;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private char estatus;
	private Set<Competencia> competencias = new HashSet<Competencia>(0);
	private Set<PersonalEquipo> personalEquipos = new HashSet<PersonalEquipo>(0);

	public Temporada() {
	}

	public Temporada(String codigoTemporada, Categoria categoria,
			Date fechaInicio, Date fechaFin, String descripcion, char estatus) {
		this.codigoTemporada = codigoTemporada;
		this.categoria = categoria;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public Temporada(String codigoTemporada, Categoria categoria,
			Date fechaInicio, Date fechaFin, String descripcion, char estatus,
			Set<Competencia> competencias, Set<PersonalEquipo> personalEquipos) {
		this.codigoTemporada = codigoTemporada;
		this.categoria = categoria;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.competencias = competencias;
		this.personalEquipos = personalEquipos;
	}

	@Id
	@Column(name = "codigo_temporada", unique = true, nullable = false)
	public String getCodigoTemporada() {
		return this.codigoTemporada;
	}

	public void setCodigoTemporada(String codigoTemporada) {
		this.codigoTemporada = codigoTemporada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_categoria", nullable = false)
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio", nullable = false, length = 13)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin", nullable = false, length = 13)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "temporada")
	public Set<Competencia> getCompetencias() {
		return this.competencias;
	}

	public void setCompetencias(Set<Competencia> competencias) {
		this.competencias = competencias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "temporada")
	public Set<PersonalEquipo> getPersonalEquipos() {
		return this.personalEquipos;
	}

	public void setPersonalEquipos(Set<PersonalEquipo> personalEquipos) {
		this.personalEquipos = personalEquipos;
	}

}
