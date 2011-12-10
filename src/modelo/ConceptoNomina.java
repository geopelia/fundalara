package modelo;

// Generated 10/12/2011 12:12:20 PM by Hibernate Tools 3.4.0.CR1

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
 * ConceptoNomina generated by hbm2java
 */
@Entity
@Table(name = "concepto_nomina")
public class ConceptoNomina implements java.io.Serializable {

	private String codigoConceptoNomina;
	private TipoConceptoNomina tipoConceptoNomina;
	private boolean aplicableSueldo;
	private char estatus;
	private Date fechaActivacion;
	private boolean tipoAplicacion;
	private double valor;
	private Set<EmpleadoConceptoNomina> empleadoConceptoNominas = new HashSet<EmpleadoConceptoNomina>(
			0);

	public ConceptoNomina() {
	}

	public ConceptoNomina(String codigoConceptoNomina,
			TipoConceptoNomina tipoConceptoNomina, boolean aplicableSueldo,
			char estatus, Date fechaActivacion, boolean tipoAplicacion,
			double valor) {
		this.codigoConceptoNomina = codigoConceptoNomina;
		this.tipoConceptoNomina = tipoConceptoNomina;
		this.aplicableSueldo = aplicableSueldo;
		this.estatus = estatus;
		this.fechaActivacion = fechaActivacion;
		this.tipoAplicacion = tipoAplicacion;
		this.valor = valor;
	}

	public ConceptoNomina(String codigoConceptoNomina,
			TipoConceptoNomina tipoConceptoNomina, boolean aplicableSueldo,
			char estatus, Date fechaActivacion, boolean tipoAplicacion,
			double valor, Set<EmpleadoConceptoNomina> empleadoConceptoNominas) {
		this.codigoConceptoNomina = codigoConceptoNomina;
		this.tipoConceptoNomina = tipoConceptoNomina;
		this.aplicableSueldo = aplicableSueldo;
		this.estatus = estatus;
		this.fechaActivacion = fechaActivacion;
		this.tipoAplicacion = tipoAplicacion;
		this.valor = valor;
		this.empleadoConceptoNominas = empleadoConceptoNominas;
	}

	@Id
	@Column(name = "codigo_concepto_nomina", unique = true, nullable = false)
	public String getCodigoConceptoNomina() {
		return this.codigoConceptoNomina;
	}

	public void setCodigoConceptoNomina(String codigoConceptoNomina) {
		this.codigoConceptoNomina = codigoConceptoNomina;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_concepto_nomina", nullable = false)
	public TipoConceptoNomina getTipoConceptoNomina() {
		return this.tipoConceptoNomina;
	}

	public void setTipoConceptoNomina(TipoConceptoNomina tipoConceptoNomina) {
		this.tipoConceptoNomina = tipoConceptoNomina;
	}

	@Column(name = "aplicable_sueldo", nullable = false)
	public boolean isAplicableSueldo() {
		return this.aplicableSueldo;
	}

	public void setAplicableSueldo(boolean aplicableSueldo) {
		this.aplicableSueldo = aplicableSueldo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_activacion", nullable = false, length = 13)
	public Date getFechaActivacion() {
		return this.fechaActivacion;
	}

	public void setFechaActivacion(Date fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}

	@Column(name = "tipo_aplicacion", nullable = false)
	public boolean isTipoAplicacion() {
		return this.tipoAplicacion;
	}

	public void setTipoAplicacion(boolean tipoAplicacion) {
		this.tipoAplicacion = tipoAplicacion;
	}

	@Column(name = "valor", nullable = false, precision = 17, scale = 17)
	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "conceptoNomina")
	public Set<EmpleadoConceptoNomina> getEmpleadoConceptoNominas() {
		return this.empleadoConceptoNominas;
	}

	public void setEmpleadoConceptoNominas(
			Set<EmpleadoConceptoNomina> empleadoConceptoNominas) {
		this.empleadoConceptoNominas = empleadoConceptoNominas;
	}

}
