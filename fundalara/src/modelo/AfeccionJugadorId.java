package modelo;

// Generated 05/12/2011 10:49:17 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AfeccionJugadorId generated by hbm2java
 */
@Embeddable
public class AfeccionJugadorId implements java.io.Serializable {

	private String codigoAfeccion;
	private String codigoRegistro;

	public AfeccionJugadorId() {
	}

	public AfeccionJugadorId(String codigoAfeccion, String codigoRegistro) {
		this.codigoAfeccion = codigoAfeccion;
		this.codigoRegistro = codigoRegistro;
	}

	@Column(name = "codigo_afeccion", nullable = false)
	public String getCodigoAfeccion() {
		return this.codigoAfeccion;
	}

	public void setCodigoAfeccion(String codigoAfeccion) {
		this.codigoAfeccion = codigoAfeccion;
	}

	@Column(name = "codigo_registro", nullable = false)
	public String getCodigoRegistro() {
		return this.codigoRegistro;
	}

	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AfeccionJugadorId))
			return false;
		AfeccionJugadorId castOther = (AfeccionJugadorId) other;

		return ((this.getCodigoAfeccion() == castOther.getCodigoAfeccion()) || (this
				.getCodigoAfeccion() != null
				&& castOther.getCodigoAfeccion() != null && this
				.getCodigoAfeccion().equals(castOther.getCodigoAfeccion())))
				&& ((this.getCodigoRegistro() == castOther.getCodigoRegistro()) || (this
						.getCodigoRegistro() != null
						&& castOther.getCodigoRegistro() != null && this
						.getCodigoRegistro().equals(
								castOther.getCodigoRegistro())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoAfeccion() == null ? 0 : this.getCodigoAfeccion()
						.hashCode());
		result = 37
				* result
				+ (getCodigoRegistro() == null ? 0 : this.getCodigoRegistro()
						.hashCode());
		return result;
	}

}