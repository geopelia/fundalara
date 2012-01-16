package modelo;

// Generated 09/01/2012 10:28:45 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PersonalActividadPlanificada generated by hbm2java
 */
@Entity
@Table(name = "personal_actividad_planificada", schema = "public")
public class PersonalActividadPlanificada implements java.io.Serializable {

	private PersonalActividadPlanificadaId id;
	private PlanificacionActividad planificacionActividad;
	private Personal personal;
	private char estatus;
	private Set<TareaActividadPlanificada> tareaActividadPlanificadas = new HashSet<TareaActividadPlanificada>(
			0);

	public PersonalActividadPlanificada() {
	}

	public PersonalActividadPlanificada(PersonalActividadPlanificadaId id,
			PlanificacionActividad planificacionActividad, Personal personal,
			char estatus) {
		this.id = id;
		this.planificacionActividad = planificacionActividad;
		this.personal = personal;
		this.estatus = estatus;
	}

	public PersonalActividadPlanificada(PersonalActividadPlanificadaId id,
			PlanificacionActividad planificacionActividad, Personal personal,
			char estatus,
			Set<TareaActividadPlanificada> tareaActividadPlanificadas) {
		this.id = id;
		this.planificacionActividad = planificacionActividad;
		this.personal = personal;
		this.estatus = estatus;
		this.tareaActividadPlanificadas = tareaActividadPlanificadas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cedulaRif", column = @Column(name = "cedula_rif", nullable = false)),
			@AttributeOverride(name = "codigoPlanificacionActividad", column = @Column(name = "codigo_planificacion_actividad", nullable = false)) })
	public PersonalActividadPlanificadaId getId() {
		return this.id;
	}

	public void setId(PersonalActividadPlanificadaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_planificacion_actividad", nullable = false, insertable = false, updatable = false)
	public PlanificacionActividad getPlanificacionActividad() {
		return this.planificacionActividad;
	}

	public void setPlanificacionActividad(
			PlanificacionActividad planificacionActividad) {
		this.planificacionActividad = planificacionActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false, insertable = false, updatable = false)
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personalActividadPlanificada")
	public Set<TareaActividadPlanificada> getTareaActividadPlanificadas() {
		return this.tareaActividadPlanificadas;
	}

	public void setTareaActividadPlanificadas(
			Set<TareaActividadPlanificada> tareaActividadPlanificadas) {
		this.tareaActividadPlanificadas = tareaActividadPlanificadas;
	}

}
