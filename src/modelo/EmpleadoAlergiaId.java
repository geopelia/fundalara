package modelo;

// Generated 11/12/2011 04:17:03 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EmpleadoAlergiaId generated by hbm2java
 */
@Embeddable
public class EmpleadoAlergiaId implements java.io.Serializable {

	private String cedula;
	private String codigoAlergia;

	public EmpleadoAlergiaId() {
	}

	public EmpleadoAlergiaId(String cedula, String codigoAlergia) {
		this.cedula = cedula;
		this.codigoAlergia = codigoAlergia;
	}

	@Column(name = "cedula", nullable = false)
	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Column(name = "codigo_alergia", nullable = false)
	public String getCodigoAlergia() {
		return this.codigoAlergia;
	}

	public void setCodigoAlergia(String codigoAlergia) {
		this.codigoAlergia = codigoAlergia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmpleadoAlergiaId))
			return false;
		EmpleadoAlergiaId castOther = (EmpleadoAlergiaId) other;

		return ((this.getCedula() == castOther.getCedula()) || (this
				.getCedula() != null && castOther.getCedula() != null && this
				.getCedula().equals(castOther.getCedula())))
				&& ((this.getCodigoAlergia() == castOther.getCodigoAlergia()) || (this
						.getCodigoAlergia() != null
						&& castOther.getCodigoAlergia() != null && this
						.getCodigoAlergia()
						.equals(castOther.getCodigoAlergia())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCedula() == null ? 0 : this.getCedula().hashCode());
		result = 37
				* result
				+ (getCodigoAlergia() == null ? 0 : this.getCodigoAlergia()
						.hashCode());
		return result;
	}

}