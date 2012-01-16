package modelo;

// Generated 09/01/2012 10:28:45 AM by Hibernate Tools 3.4.0.CR1

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
 * Juego generated by hbm2java
 */
@Entity
@Table(name = "juego", schema = "public")
public class Juego implements java.io.Serializable {

	private int codigoJuego;
	private Estadio estadio;
	private Competencia competencia;
	private DatoBasico datoBasico;
	private Date horaInicio;
	private Date fecha;
	private String observaciones;
	private Integer cantidadInning;
	private Date duracion;
	private Set<ActividadCalendario> actividadCalendarios = new HashSet<ActividadCalendario>(
			0);
	private Set<MaterialActividad> materialActividads = new HashSet<MaterialActividad>(
			0);
	private Set<PersonalEquipo> personalEquipos = new HashSet<PersonalEquipo>(0);
	private Set<EquipoJuego> equipoJuegos = new HashSet<EquipoJuego>(0);
	private Set<MaterialActividadPlanificada> materialActividadPlanificadas = new HashSet<MaterialActividadPlanificada>(
			0);
	private Set<LineUp> lineUps = new HashSet<LineUp>(0);
	private Set<PersonalForaneoJuego> personalForaneoJuegos = new HashSet<PersonalForaneoJuego>(
			0);

	public Juego() {
	}

	public Juego(int codigoJuego, Estadio estadio, Competencia competencia,
			DatoBasico datoBasico, Date horaInicio, Date fecha) {
		this.codigoJuego = codigoJuego;
		this.estadio = estadio;
		this.competencia = competencia;
		this.datoBasico = datoBasico;
		this.horaInicio = horaInicio;
		this.fecha = fecha;
	}

	public Juego(int codigoJuego, Estadio estadio, Competencia competencia,
			DatoBasico datoBasico, Date horaInicio, Date fecha,
			String observaciones, Integer cantidadInning, Date duracion,
			Set<ActividadCalendario> actividadCalendarios,
			Set<MaterialActividad> materialActividads,
			Set<PersonalEquipo> personalEquipos, Set<EquipoJuego> equipoJuegos,
			Set<MaterialActividadPlanificada> materialActividadPlanificadas,
			Set<LineUp> lineUps, Set<PersonalForaneoJuego> personalForaneoJuegos) {
		this.codigoJuego = codigoJuego;
		this.estadio = estadio;
		this.competencia = competencia;
		this.datoBasico = datoBasico;
		this.horaInicio = horaInicio;
		this.fecha = fecha;
		this.observaciones = observaciones;
		this.cantidadInning = cantidadInning;
		this.duracion = duracion;
		this.actividadCalendarios = actividadCalendarios;
		this.materialActividads = materialActividads;
		this.personalEquipos = personalEquipos;
		this.equipoJuegos = equipoJuegos;
		this.materialActividadPlanificadas = materialActividadPlanificadas;
		this.lineUps = lineUps;
		this.personalForaneoJuegos = personalForaneoJuegos;
	}

	@Id
	@Column(name = "codigo_juego", unique = true, nullable = false)
	public int getCodigoJuego() {
		return this.codigoJuego;
	}

	public void setCodigoJuego(int codigoJuego) {
		this.codigoJuego = codigoJuego;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_estadio", nullable = false)
	public Estadio getEstadio() {
		return this.estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_competencia", nullable = false)
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_estado", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_inicio", nullable = false, length = 15)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", nullable = false, length = 13)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "observaciones")
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "cantidad_inning")
	public Integer getCantidadInning() {
		return this.cantidadInning;
	}

	public void setCantidadInning(Integer cantidadInning) {
		this.cantidadInning = cantidadInning;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "duracion", length = 15)
	public Date getDuracion() {
		return this.duracion;
	}

	public void setDuracion(Date duracion) {
		this.duracion = duracion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
	public Set<ActividadCalendario> getActividadCalendarios() {
		return this.actividadCalendarios;
	}

	public void setActividadCalendarios(
			Set<ActividadCalendario> actividadCalendarios) {
		this.actividadCalendarios = actividadCalendarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
	public Set<MaterialActividad> getMaterialActividads() {
		return this.materialActividads;
	}

	public void setMaterialActividads(Set<MaterialActividad> materialActividads) {
		this.materialActividads = materialActividads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
	public Set<PersonalEquipo> getPersonalEquipos() {
		return this.personalEquipos;
	}

	public void setPersonalEquipos(Set<PersonalEquipo> personalEquipos) {
		this.personalEquipos = personalEquipos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
	public Set<EquipoJuego> getEquipoJuegos() {
		return this.equipoJuegos;
	}

	public void setEquipoJuegos(Set<EquipoJuego> equipoJuegos) {
		this.equipoJuegos = equipoJuegos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
	public Set<MaterialActividadPlanificada> getMaterialActividadPlanificadas() {
		return this.materialActividadPlanificadas;
	}

	public void setMaterialActividadPlanificadas(
			Set<MaterialActividadPlanificada> materialActividadPlanificadas) {
		this.materialActividadPlanificadas = materialActividadPlanificadas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
	public Set<LineUp> getLineUps() {
		return this.lineUps;
	}

	public void setLineUps(Set<LineUp> lineUps) {
		this.lineUps = lineUps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
	public Set<PersonalForaneoJuego> getPersonalForaneoJuegos() {
		return this.personalForaneoJuegos;
	}

	public void setPersonalForaneoJuegos(
			Set<PersonalForaneoJuego> personalForaneoJuegos) {
		this.personalForaneoJuegos = personalForaneoJuegos;
	}

}