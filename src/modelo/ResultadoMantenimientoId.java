package modelo;

// Generated 10/12/2011 12:12:20 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResultadoMantenimientoId generated by hbm2java
 */
@Embeddable
public class ResultadoMantenimientoId implements java.io.Serializable {

	private String codigoEstadoMantenimiento;
	private String codigoResultado;

	public ResultadoMantenimientoId() {
	}

	public ResultadoMantenimientoId(String codigoEstadoMantenimiento,
			String codigoResultado) {
		this.codigoEstadoMantenimiento = codigoEstadoMantenimiento;
		this.codigoResultado = codigoResultado;
	}

	@Column(name = "codigo_estado_mantenimiento", nullable = false)
	public String getCodigoEstadoMantenimiento() {
		return this.codigoEstadoMantenimiento;
	}

	public void setCodigoEstadoMantenimiento(String codigoEstadoMantenimiento) {
		this.codigoEstadoMantenimiento = codigoEstadoMantenimiento;
	}

	@Column(name = "codigo_resultado", nullable = false)
	public String getCodigoResultado() {
		return this.codigoResultado;
	}

	public void setCodigoResultado(String codigoResultado) {
		this.codigoResultado = codigoResultado;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ResultadoMantenimientoId))
			return false;
		ResultadoMantenimientoId castOther = (ResultadoMantenimientoId) other;

		return ((this.getCodigoEstadoMantenimiento() == castOther
				.getCodigoEstadoMantenimiento()) || (this
				.getCodigoEstadoMantenimiento() != null
				&& castOther.getCodigoEstadoMantenimiento() != null && this
				.getCodigoEstadoMantenimiento().equals(
						castOther.getCodigoEstadoMantenimiento())))
				&& ((this.getCodigoResultado() == castOther
						.getCodigoResultado()) || (this.getCodigoResultado() != null
						&& castOther.getCodigoResultado() != null && this
						.getCodigoResultado().equals(
								castOther.getCodigoResultado())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoEstadoMantenimiento() == null ? 0 : this
						.getCodigoEstadoMantenimiento().hashCode());
		result = 37
				* result
				+ (getCodigoResultado() == null ? 0 : this.getCodigoResultado()
						.hashCode());
		return result;
	}

}
