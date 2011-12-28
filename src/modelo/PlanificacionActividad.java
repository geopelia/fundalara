package modelo;

// Generated 28/12/2011 03:24:38 PM by Hibernate Tools 3.4.0.CR1

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
 * PlanificacionActividad generated by hbm2java
 */
@Entity
@Table(name = "planificacion_actividad", schema = "public")
public class PlanificacionActividad implements java.io.Serializable {

	private int codigoPlanificacionActividad;
	private DatoBasico datoBasico;
	private Instalacion instalacion;
	private char estatus;
	private boolean actividadPeriodico;
	private boolean actividadPlantilla;
	private Set<MaterialActividadPlanificada> materialActividadPlanificadas = new HashSet<MaterialActividadPlanificada>(
			0);
	private Set<Actividad> actividads = new HashSet<Actividad>(0);
	private Set<PersonalActividadPlanificada> personalActividadPlanificadas = new HashSet<PersonalActividadPlanificada>(
			0);
	private Set<Periodicidad> periodicidads = new HashSet<Periodicidad>(0);
	private Set<TareaActividadPlanificada> tareaActividadPlanificadas = new HashSet<TareaActividadPlanificada>(
			0);

	public PlanificacionActividad() {
	}

	public PlanificacionActividad(int codigoPlanificacionActividad,
			DatoBasico datoBasico, Instalacion instalacion, char estatus,
			boolean actividadPeriodico, boolean actividadPlantilla) {
		this.codigoPlanificacionActividad = codigoPlanificacionActividad;
		this.datoBasico = datoBasico;
		this.instalacion = instalacion;
		this.estatus = estatus;
		this.actividadPeriodico = actividadPeriodico;
		this.actividadPlantilla = actividadPlantilla;
	}

	public PlanificacionActividad(int codigoPlanificacionActividad,
			DatoBasico datoBasico, Instalacion instalacion, char estatus,
			boolean actividadPeriodico, boolean actividadPlantilla,
			Set<MaterialActividadPlanificada> materialActividadPlanificadas,
			Set<Actividad> actividads,
			Set<PersonalActividadPlanificada> personalActividadPlanificadas,
			Set<Periodicidad> periodicidads,
			Set<TareaActividadPlanificada> tareaActividadPlanificadas) {
		this.codigoPlanificacionActividad = codigoPlanificacionActividad;
		this.datoBasico = datoBasico;
		this.instalacion = instalacion;
		this.estatus = estatus;
		this.actividadPeriodico = actividadPeriodico;
		this.actividadPlantilla = actividadPlantilla;
		this.materialActividadPlanificadas = materialActividadPlanificadas;
		this.actividads = actividads;
		this.personalActividadPlanificadas = personalActividadPlanificadas;
		this.periodicidads = periodicidads;
		this.tareaActividadPlanificadas = tareaActividadPlanificadas;
	}

	@Id
	@Column(name = "codigo_planificacion_actividad", unique = true, nullable = false)
	public int getCodigoPlanificacionActividad() {
		return this.codigoPlanificacionActividad;
	}

	public void setCodigoPlanificacionActividad(int codigoPlanificacionActividad) {
		this.codigoPlanificacionActividad = codigoPlanificacionActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_actividad", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_instalacion", nullable = false)
	public Instalacion getInstalacion() {
		return this.instalacion;
	}

	public void setInstalacion(Instalacion instalacion) {
		this.instalacion = instalacion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "actividad_periodico", nullable = false)
	public boolean isActividadPeriodico() {
		return this.actividadPeriodico;
	}

	public void setActividadPeriodico(boolean actividadPeriodico) {
		this.actividadPeriodico = actividadPeriodico;
	}

	@Column(name = "actividad_plantilla", nullable = false)
	public boolean isActividadPlantilla() {
		return this.actividadPlantilla;
	}

	public void setActividadPlantilla(boolean actividadPlantilla) {
		this.actividadPlantilla = actividadPlantilla;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionActividad")
	public Set<MaterialActividadPlanificada> getMaterialActividadPlanificadas() {
		return this.materialActividadPlanificadas;
	}

	public void setMaterialActividadPlanificadas(
			Set<MaterialActividadPlanificada> materialActividadPlanificadas) {
		this.materialActividadPlanificadas = materialActividadPlanificadas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionActividad")
	public Set<Actividad> getActividads() {
		return this.actividads;
	}

	public void setActividads(Set<Actividad> actividads) {
		this.actividads = actividads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionActividad")
	public Set<PersonalActividadPlanificada> getPersonalActividadPlanificadas() {
		return this.personalActividadPlanificadas;
	}

	public void setPersonalActividadPlanificadas(
			Set<PersonalActividadPlanificada> personalActividadPlanificadas) {
		this.personalActividadPlanificadas = personalActividadPlanificadas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionActividad")
	public Set<Periodicidad> getPeriodicidads() {
		return this.periodicidads;
	}

	public void setPeriodicidads(Set<Periodicidad> periodicidads) {
		this.periodicidads = periodicidads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionActividad")
	public Set<TareaActividadPlanificada> getTareaActividadPlanificadas() {
		return this.tareaActividadPlanificadas;
	}

	public void setTareaActividadPlanificadas(
			Set<TareaActividadPlanificada> tareaActividadPlanificadas) {
		this.tareaActividadPlanificadas = tareaActividadPlanificadas;
	}

}
