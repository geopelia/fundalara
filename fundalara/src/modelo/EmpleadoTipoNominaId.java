package modelo;

// Generated 06-dic-2011 15:00:16 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EmpleadoTipoNominaId generated by hbm2java
 */
@Embeddable
public class EmpleadoTipoNominaId implements java.io.Serializable {

	private String codigoTipoNomina;
	private String cedula;

	public EmpleadoTipoNominaId() {
	}

	public EmpleadoTipoNominaId(String codigoTipoNomina, String cedula) {
		this.codigoTipoNomina = codigoTipoNomina;
		this.cedula = cedula;
	}

	@Column(name = "codigo_tipo_nomina", nullable = false)
	public String getCodigoTipoNomina() {
		return this.codigoTipoNomina;
	}

	public void setCodigoTipoNomina(String codigoTipoNomina) {
		this.codigoTipoNomina = codigoTipoNomina;
	}

	@Column(name = "cedula", nullable = false)
	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmpleadoTipoNominaId))
			return false;
		EmpleadoTipoNominaId castOther = (EmpleadoTipoNominaId) other;

		return ((this.getCodigoTipoNomina() == castOther.getCodigoTipoNomina()) || (this
				.getCodigoTipoNomina() != null
				&& castOther.getCodigoTipoNomina() != null && this
				.getCodigoTipoNomina().equals(castOther.getCodigoTipoNomina())))
				&& ((this.getCedula() == castOther.getCedula()) || (this
						.getCedula() != null && castOther.getCedula() != null && this
						.getCedula().equals(castOther.getCedula())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoTipoNomina() == null ? 0 : this
						.getCodigoTipoNomina().hashCode());
		result = 37 * result
				+ (getCedula() == null ? 0 : this.getCedula().hashCode());
		return result;
	}

}
