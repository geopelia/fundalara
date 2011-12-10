package modelo;

// Generated 10/12/2011 12:12:20 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TareaMantenimiento generated by hbm2java
 */
@Entity
@Table(name = "tarea_mantenimiento")
public class TareaMantenimiento implements java.io.Serializable {

	private TareaMantenimientoId id;
	private Tarea tarea;
	private EmpleadoMantenimiento empleadoMantenimiento;
	private Mantenimiento mantenimiento;
	private String codigoTareaMantenimiento;
	private char estatus;

	public TareaMantenimiento() {
	}

	public TareaMantenimiento(TareaMantenimientoId id, Tarea tarea,
			EmpleadoMantenimiento empleadoMantenimiento,
			Mantenimiento mantenimiento, String codigoTareaMantenimiento,
			char estatus) {
		this.id = id;
		this.tarea = tarea;
		this.empleadoMantenimiento = empleadoMantenimiento;
		this.mantenimiento = mantenimiento;
		this.codigoTareaMantenimiento = codigoTareaMantenimiento;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoMantenimiento", column = @Column(name = "codigo_mantenimiento", nullable = false)),
			@AttributeOverride(name = "codigoTarea", column = @Column(name = "codigo_tarea", nullable = false)) })
	public TareaMantenimientoId getId() {
		return this.id;
	}

	public void setId(TareaMantenimientoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tarea", nullable = false, insertable = false, updatable = false)
	public Tarea getTarea() {
		return this.tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "cedula", referencedColumnName = "cedula", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "codigo_mantenimiento", referencedColumnName = "codigo_mantenimiento", nullable = false, insertable = false, updatable = false) })
	public EmpleadoMantenimiento getEmpleadoMantenimiento() {
		return this.empleadoMantenimiento;
	}

	public void setEmpleadoMantenimiento(
			EmpleadoMantenimiento empleadoMantenimiento) {
		this.empleadoMantenimiento = empleadoMantenimiento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_mantenimiento", nullable = false, insertable = false, updatable = false)
	public Mantenimiento getMantenimiento() {
		return this.mantenimiento;
	}

	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	@Column(name = "codigo_tarea_mantenimiento", nullable = false)
	public String getCodigoTareaMantenimiento() {
		return this.codigoTareaMantenimiento;
	}

	public void setCodigoTareaMantenimiento(String codigoTareaMantenimiento) {
		this.codigoTareaMantenimiento = codigoTareaMantenimiento;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
