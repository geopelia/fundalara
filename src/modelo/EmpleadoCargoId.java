package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EmpleadoCargoId generated by hbm2java
 */
@Embeddable
public class EmpleadoCargoId implements java.io.Serializable {

	private String codigoCargo;
	private String cedula;

	public EmpleadoCargoId() {
	}

	public EmpleadoCargoId(String codigoCargo, String cedula) {
		this.codigoCargo = codigoCargo;
		this.cedula = cedula;
	}

	@Column(name = "codigo_cargo", nullable = false)
	public String getCodigoCargo() {
		return this.codigoCargo;
	}

	public void setCodigoCargo(String codigoCargo) {
		this.codigoCargo = codigoCargo;
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
		if (!(other instanceof EmpleadoCargoId))
			return false;
		EmpleadoCargoId castOther = (EmpleadoCargoId) other;

		return ((this.getCodigoCargo() == castOther.getCodigoCargo()) || (this
				.getCodigoCargo() != null && castOther.getCodigoCargo() != null && this
				.getCodigoCargo().equals(castOther.getCodigoCargo())))
				&& ((this.getCedula() == castOther.getCedula()) || (this
						.getCedula() != null && castOther.getCedula() != null && this
						.getCedula().equals(castOther.getCedula())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoCargo() == null ? 0 : this.getCodigoCargo()
						.hashCode());
		result = 37 * result
				+ (getCedula() == null ? 0 : this.getCedula().hashCode());
		return result;
	}

}
