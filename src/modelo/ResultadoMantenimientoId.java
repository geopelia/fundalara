package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResultadoMantenimientoId generated by hbm2java
 */
@Embeddable
public class ResultadoMantenimientoId implements java.io.Serializable {

	private String codigoResultado;
	private String codigoEstadoMantenimiento;

	public ResultadoMantenimientoId() {
	}

	public ResultadoMantenimientoId(String codigoResultado,
			String codigoEstadoMantenimiento) {
		this.codigoResultado = codigoResultado;
		this.codigoEstadoMantenimiento = codigoEstadoMantenimiento;
	}

	@Column(name = "codigo_resultado", nullable = false)
	public String getCodigoResultado() {
		return this.codigoResultado;
	}

	public void setCodigoResultado(String codigoResultado) {
		this.codigoResultado = codigoResultado;
	}

	@Column(name = "codigo_estado_mantenimiento", nullable = false)
	public String getCodigoEstadoMantenimiento() {
		return this.codigoEstadoMantenimiento;
	}

	public void setCodigoEstadoMantenimiento(String codigoEstadoMantenimiento) {
		this.codigoEstadoMantenimiento = codigoEstadoMantenimiento;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ResultadoMantenimientoId))
			return false;
		ResultadoMantenimientoId castOther = (ResultadoMantenimientoId) other;

		return ((this.getCodigoResultado() == castOther.getCodigoResultado()) || (this
				.getCodigoResultado() != null
				&& castOther.getCodigoResultado() != null && this
				.getCodigoResultado().equals(castOther.getCodigoResultado())))
				&& ((this.getCodigoEstadoMantenimiento() == castOther
						.getCodigoEstadoMantenimiento()) || (this
						.getCodigoEstadoMantenimiento() != null
						&& castOther.getCodigoEstadoMantenimiento() != null && this
						.getCodigoEstadoMantenimiento().equals(
								castOther.getCodigoEstadoMantenimiento())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoResultado() == null ? 0 : this.getCodigoResultado()
						.hashCode());
		result = 37
				* result
				+ (getCodigoEstadoMantenimiento() == null ? 0 : this
						.getCodigoEstadoMantenimiento().hashCode());
		return result;
	}

}
