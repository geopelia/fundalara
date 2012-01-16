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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PersonalEquipo generated by hbm2java
 */
@Entity
@Table(name = "personal_equipo", schema = "public")
public class PersonalEquipo implements java.io.Serializable {

	private int codigoPersonalEquipo;
	private PlanTemporada planTemporada;
	private Juego juego;
	private Personal personal;
	private Equipo equipo;
	private Date fechaInicio;
	private Date fechaFinalizacion;
	private String eventualidad;
	private Set<AsistenciaPersonalEntrenamiento> asistenciaPersonalEntrenamientos = new HashSet<AsistenciaPersonalEntrenamiento>(
			0);
	private Set<EquipoJuego> equipoJuegos = new HashSet<EquipoJuego>(0);

	public PersonalEquipo() {
	}

	public PersonalEquipo(int codigoPersonalEquipo,
			PlanTemporada planTemporada, Juego juego, Personal personal,
			Equipo equipo, Date fechaInicio, Date fechaFinalizacion,
			String eventualidad) {
		this.codigoPersonalEquipo = codigoPersonalEquipo;
		this.planTemporada = planTemporada;
		this.juego = juego;
		this.personal = personal;
		this.equipo = equipo;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.eventualidad = eventualidad;
	}

	public PersonalEquipo(
			int codigoPersonalEquipo,
			PlanTemporada planTemporada,
			Juego juego,
			Personal personal,
			Equipo equipo,
			Date fechaInicio,
			Date fechaFinalizacion,
			String eventualidad,
			Set<AsistenciaPersonalEntrenamiento> asistenciaPersonalEntrenamientos,
			Set<EquipoJuego> equipoJuegos) {
		this.codigoPersonalEquipo = codigoPersonalEquipo;
		this.planTemporada = planTemporada;
		this.juego = juego;
		this.personal = personal;
		this.equipo = equipo;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.eventualidad = eventualidad;
		this.asistenciaPersonalEntrenamientos = asistenciaPersonalEntrenamientos;
		this.equipoJuegos = equipoJuegos;
	}

	@Id
	@Column(name = "codigo_personal_equipo", unique = true, nullable = false)
	public int getCodigoPersonalEquipo() {
		return this.codigoPersonalEquipo;
	}

	public void setCodigoPersonalEquipo(int codigoPersonalEquipo) {
		this.codigoPersonalEquipo = codigoPersonalEquipo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_plan_temporada", nullable = false)
	public PlanTemporada getPlanTemporada() {
		return this.planTemporada;
	}

	public void setPlanTemporada(PlanTemporada planTemporada) {
		this.planTemporada = planTemporada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_juego", nullable = false)
	public Juego getJuego() {
		return this.juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_equipo", nullable = false)
	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
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
	@Column(name = "fecha_finalizacion", nullable = false, length = 13)
	public Date getFechaFinalizacion() {
		return this.fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	@Column(name = "eventualidad", nullable = false)
	public String getEventualidad() {
		return this.eventualidad;
	}

	public void setEventualidad(String eventualidad) {
		this.eventualidad = eventualidad;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personalEquipo")
	public Set<AsistenciaPersonalEntrenamiento> getAsistenciaPersonalEntrenamientos() {
		return this.asistenciaPersonalEntrenamientos;
	}

	public void setAsistenciaPersonalEntrenamientos(
			Set<AsistenciaPersonalEntrenamiento> asistenciaPersonalEntrenamientos) {
		this.asistenciaPersonalEntrenamientos = asistenciaPersonalEntrenamientos;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "personalEquipos")
	public Set<EquipoJuego> getEquipoJuegos() {
		return this.equipoJuegos;
	}

	public void setEquipoJuegos(Set<EquipoJuego> equipoJuegos) {
		this.equipoJuegos = equipoJuegos;
	}

}
