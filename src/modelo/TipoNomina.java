package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

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
 * TipoNomina generated by hbm2java
 */
@Entity
@Table(name = "tipo_nomina")
public class TipoNomina implements java.io.Serializable {

	private String codigoTipoNomina;
	private PeriodicidadPago periodicidadPago;
	private String descripcion;
	private Date fechaActualizacion;
	private char estatus;
	private Set<EmpleadoTipoNomina> empleadoTipoNominas = new HashSet<EmpleadoTipoNomina>(
			0);

	public TipoNomina() {
	}

	public TipoNomina(String codigoTipoNomina,
			PeriodicidadPago periodicidadPago, String descripcion,
			Date fechaActualizacion, char estatus) {
		this.codigoTipoNomina = codigoTipoNomina;
		this.periodicidadPago = periodicidadPago;
		this.descripcion = descripcion;
		this.fechaActualizacion = fechaActualizacion;
		this.estatus = estatus;
	}

	public TipoNomina(String codigoTipoNomina,
			PeriodicidadPago periodicidadPago, String descripcion,
			Date fechaActualizacion, char estatus,
			Set<EmpleadoTipoNomina> empleadoTipoNominas) {
		this.codigoTipoNomina = codigoTipoNomina;
		this.periodicidadPago = periodicidadPago;
		this.descripcion = descripcion;
		this.fechaActualizacion = fechaActualizacion;
		this.estatus = estatus;
		this.empleadoTipoNominas = empleadoTipoNominas;
	}

	@Id
	@Column(name = "codigo_tipo_nomina", unique = true, nullable = false)
	public String getCodigoTipoNomina() {
		return this.codigoTipoNomina;
	}

	public void setCodigoTipoNomina(String codigoTipoNomina) {
		this.codigoTipoNomina = codigoTipoNomina;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_periodicidad_pago", nullable = false)
	public PeriodicidadPago getPeriodicidadPago() {
		return this.periodicidadPago;
	}

	public void setPeriodicidadPago(PeriodicidadPago periodicidadPago) {
		this.periodicidadPago = periodicidadPago;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_actualizacion", nullable = false, length = 13)
	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoNomina")
	public Set<EmpleadoTipoNomina> getEmpleadoTipoNominas() {
		return this.empleadoTipoNominas;
	}

	public void setEmpleadoTipoNominas(
			Set<EmpleadoTipoNomina> empleadoTipoNominas) {
		this.empleadoTipoNominas = empleadoTipoNominas;
	}

}
