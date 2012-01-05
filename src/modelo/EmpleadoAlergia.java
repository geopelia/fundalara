package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EmpleadoAlergia generated by hbm2java
 */
@Entity
@Table(name = "empleado_alergia")
public class EmpleadoAlergia implements java.io.Serializable {

	private EmpleadoAlergiaId id;
	private Alergia alergia;
	private Empleado empleado;
	private char estatus;

	public EmpleadoAlergia() {
	}

	public EmpleadoAlergia(EmpleadoAlergiaId id, Alergia alergia,
			Empleado empleado, char estatus) {
		this.id = id;
		this.alergia = alergia;
		this.empleado = empleado;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoAlergia", column = @Column(name = "codigo_alergia", nullable = false)),
			@AttributeOverride(name = "cedula", column = @Column(name = "cedula", nullable = false)) })
	public EmpleadoAlergiaId getId() {
		return this.id;
	}

	public void setId(EmpleadoAlergiaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_alergia", nullable = false, insertable = false, updatable = false)
	public Alergia getAlergia() {
		return this.alergia;
	}

	public void setAlergia(Alergia alergia) {
		this.alergia = alergia;
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

}
