package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

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
 * PlanificacionMantenimiento generated by hbm2java
 */
@Entity
@Table(name = "planificacion_mantenimiento")
public class PlanificacionMantenimiento implements java.io.Serializable {

	private String codigoPlanificacionMantenimiento;
	private Instalacion instalacion;
	private TipoMantenimiento tipoMantenimiento;
	private String estatus;
	private boolean mantenimientoPeriodico;
	private boolean mantenimientoPlantilla;
	private Set<MaterialMantenimientoPlanificado> materialMantenimientoPlanificados = new HashSet<MaterialMantenimientoPlanificado>(
			0);
	private Set<Periodicidad> periodicidads = new HashSet<Periodicidad>(0);
	private Set<Mantenimiento> mantenimientos = new HashSet<Mantenimiento>(0);
	private Set<EmpleadoMantenimientoPlanificado> empleadoMantenimientoPlanificados = new HashSet<EmpleadoMantenimientoPlanificado>(
			0);
	private Set<TareaMantenimientoPlanificado> tareaMantenimientoPlanificados = new HashSet<TareaMantenimientoPlanificado>(
			0);

	public PlanificacionMantenimiento() {
	}

	public PlanificacionMantenimiento(String codigoPlanificacionMantenimiento,
			Instalacion instalacion, TipoMantenimiento tipoMantenimiento,
			String estatus, boolean mantenimientoPeriodico,
			boolean mantenimientoPlantilla) {
		this.codigoPlanificacionMantenimiento = codigoPlanificacionMantenimiento;
		this.instalacion = instalacion;
		this.tipoMantenimiento = tipoMantenimiento;
		this.estatus = estatus;
		this.mantenimientoPeriodico = mantenimientoPeriodico;
		this.mantenimientoPlantilla = mantenimientoPlantilla;
	}

	public PlanificacionMantenimiento(
			String codigoPlanificacionMantenimiento,
			Instalacion instalacion,
			TipoMantenimiento tipoMantenimiento,
			String estatus,
			boolean mantenimientoPeriodico,
			boolean mantenimientoPlantilla,
			Set<MaterialMantenimientoPlanificado> materialMantenimientoPlanificados,
			Set<Periodicidad> periodicidads,
			Set<Mantenimiento> mantenimientos,
			Set<EmpleadoMantenimientoPlanificado> empleadoMantenimientoPlanificados,
			Set<TareaMantenimientoPlanificado> tareaMantenimientoPlanificados) {
		this.codigoPlanificacionMantenimiento = codigoPlanificacionMantenimiento;
		this.instalacion = instalacion;
		this.tipoMantenimiento = tipoMantenimiento;
		this.estatus = estatus;
		this.mantenimientoPeriodico = mantenimientoPeriodico;
		this.mantenimientoPlantilla = mantenimientoPlantilla;
		this.materialMantenimientoPlanificados = materialMantenimientoPlanificados;
		this.periodicidads = periodicidads;
		this.mantenimientos = mantenimientos;
		this.empleadoMantenimientoPlanificados = empleadoMantenimientoPlanificados;
		this.tareaMantenimientoPlanificados = tareaMantenimientoPlanificados;
	}

	@Id
	@Column(name = "codigo_planificacion_mantenimiento", unique = true, nullable = false)
	public String getCodigoPlanificacionMantenimiento() {
		return this.codigoPlanificacionMantenimiento;
	}

	public void setCodigoPlanificacionMantenimiento(
			String codigoPlanificacionMantenimiento) {
		this.codigoPlanificacionMantenimiento = codigoPlanificacionMantenimiento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_instalacion", nullable = false)
	public Instalacion getInstalacion() {
		return this.instalacion;
	}

	public void setInstalacion(Instalacion instalacion) {
		this.instalacion = instalacion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_mantenimiento", nullable = false)
	public TipoMantenimiento getTipoMantenimiento() {
		return this.tipoMantenimiento;
	}

	public void setTipoMantenimiento(TipoMantenimiento tipoMantenimiento) {
		this.tipoMantenimiento = tipoMantenimiento;
	}

	@Column(name = "estatus", nullable = false)
	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@Column(name = "mantenimiento_periodico", nullable = false)
	public boolean isMantenimientoPeriodico() {
		return this.mantenimientoPeriodico;
	}

	public void setMantenimientoPeriodico(boolean mantenimientoPeriodico) {
		this.mantenimientoPeriodico = mantenimientoPeriodico;
	}

	@Column(name = "mantenimiento_plantilla", nullable = false)
	public boolean isMantenimientoPlantilla() {
		return this.mantenimientoPlantilla;
	}

	public void setMantenimientoPlantilla(boolean mantenimientoPlantilla) {
		this.mantenimientoPlantilla = mantenimientoPlantilla;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionMantenimiento")
	public Set<MaterialMantenimientoPlanificado> getMaterialMantenimientoPlanificados() {
		return this.materialMantenimientoPlanificados;
	}

	public void setMaterialMantenimientoPlanificados(
			Set<MaterialMantenimientoPlanificado> materialMantenimientoPlanificados) {
		this.materialMantenimientoPlanificados = materialMantenimientoPlanificados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionMantenimiento")
	public Set<Periodicidad> getPeriodicidads() {
		return this.periodicidads;
	}

	public void setPeriodicidads(Set<Periodicidad> periodicidads) {
		this.periodicidads = periodicidads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionMantenimiento")
	public Set<Mantenimiento> getMantenimientos() {
		return this.mantenimientos;
	}

	public void setMantenimientos(Set<Mantenimiento> mantenimientos) {
		this.mantenimientos = mantenimientos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionMantenimiento")
	public Set<EmpleadoMantenimientoPlanificado> getEmpleadoMantenimientoPlanificados() {
		return this.empleadoMantenimientoPlanificados;
	}

	public void setEmpleadoMantenimientoPlanificados(
			Set<EmpleadoMantenimientoPlanificado> empleadoMantenimientoPlanificados) {
		this.empleadoMantenimientoPlanificados = empleadoMantenimientoPlanificados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planificacionMantenimiento")
	public Set<TareaMantenimientoPlanificado> getTareaMantenimientoPlanificados() {
		return this.tareaMantenimientoPlanificados;
	}

	public void setTareaMantenimientoPlanificados(
			Set<TareaMantenimientoPlanificado> tareaMantenimientoPlanificados) {
		this.tareaMantenimientoPlanificados = tareaMantenimientoPlanificados;
	}

}
