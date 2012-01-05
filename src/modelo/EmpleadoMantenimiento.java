package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

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
 * EmpleadoMantenimiento generated by hbm2java
 */
@Entity
@Table(name = "empleado_mantenimiento")
public class EmpleadoMantenimiento implements java.io.Serializable {

	private EmpleadoMantenimientoId id;
	private Mantenimiento mantenimiento;
	private Empleado empleado;
	private char estatus;
	private Set<TareaMantenimiento> tareaMantenimientos = new HashSet<TareaMantenimiento>(
			0);

	public EmpleadoMantenimiento() {
	}

	public EmpleadoMantenimiento(EmpleadoMantenimientoId id,
			Mantenimiento mantenimiento, Empleado empleado, char estatus) {
		this.id = id;
		this.mantenimiento = mantenimiento;
		this.empleado = empleado;
		this.estatus = estatus;
	}

	public EmpleadoMantenimiento(EmpleadoMantenimientoId id,
			Mantenimiento mantenimiento, Empleado empleado, char estatus,
			Set<TareaMantenimiento> tareaMantenimientos) {
		this.id = id;
		this.mantenimiento = mantenimiento;
		this.empleado = empleado;
		this.estatus = estatus;
		this.tareaMantenimientos = tareaMantenimientos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoMantenimiento", column = @Column(name = "codigo_mantenimiento", nullable = false)),
			@AttributeOverride(name = "cedula", column = @Column(name = "cedula", nullable = false)) })
	public EmpleadoMantenimientoId getId() {
		return this.id;
	}

	public void setId(EmpleadoMantenimientoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_mantenimiento", nullable = false, insertable = false, updatable = false)
	public Mantenimiento getMantenimiento() {
		return this.mantenimiento;
	}

	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula", nullable = false, insertable = false, updatable = false)
	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleadoMantenimiento")
	public Set<TareaMantenimiento> getTareaMantenimientos() {
		return this.tareaMantenimientos;
	}

	public void setTareaMantenimientos(
			Set<TareaMantenimiento> tareaMantenimientos) {
		this.tareaMantenimientos = tareaMantenimientos;
	}

}
