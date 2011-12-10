package modelo;

// Generated 10/12/2011 12:12:20 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EmpleadoConceptoNominaId generated by hbm2java
 */
@Embeddable
public class EmpleadoConceptoNominaId implements java.io.Serializable {

	private String cedula;
	private String codigoConceptoNomina;

	public EmpleadoConceptoNominaId() {
	}

	public EmpleadoConceptoNominaId(String cedula, String codigoConceptoNomina) {
		this.cedula = cedula;
		this.codigoConceptoNomina = codigoConceptoNomina;
	}

	@Column(name = "cedula", nullable = false)
	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Column(name = "codigo_concepto_nomina", nullable = false)
	public String getCodigoConceptoNomina() {
		return this.codigoConceptoNomina;
	}

	public void setCodigoConceptoNomina(String codigoConceptoNomina) {
		this.codigoConceptoNomina = codigoConceptoNomina;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmpleadoConceptoNominaId))
			return false;
		EmpleadoConceptoNominaId castOther = (EmpleadoConceptoNominaId) other;

		return ((this.getCedula() == castOther.getCedula()) || (this
				.getCedula() != null && castOther.getCedula() != null && this
				.getCedula().equals(castOther.getCedula())))
				&& ((this.getCodigoConceptoNomina() == castOther
						.getCodigoConceptoNomina()) || (this
						.getCodigoConceptoNomina() != null
						&& castOther.getCodigoConceptoNomina() != null && this
						.getCodigoConceptoNomina().equals(
								castOther.getCodigoConceptoNomina())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCedula() == null ? 0 : this.getCedula().hashCode());
		result = 37
				* result
				+ (getCodigoConceptoNomina() == null ? 0 : this
						.getCodigoConceptoNomina().hashCode());
		return result;
	}

}
