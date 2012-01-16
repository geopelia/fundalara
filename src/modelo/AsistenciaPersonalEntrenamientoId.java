package modelo;

// Generated 09/01/2012 10:28:45 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AsistenciaPersonalEntrenamientoId generated by hbm2java
 */
@Embeddable
public class AsistenciaPersonalEntrenamientoId implements java.io.Serializable {

	private int codigoSesionEjecutada;
	private int codigoPersonalEquipo;

	public AsistenciaPersonalEntrenamientoId() {
	}

	public AsistenciaPersonalEntrenamientoId(int codigoSesionEjecutada,
			int codigoPersonalEquipo) {
		this.codigoSesionEjecutada = codigoSesionEjecutada;
		this.codigoPersonalEquipo = codigoPersonalEquipo;
	}

	@Column(name = "codigo_sesion_ejecutada", nullable = false)
	public int getCodigoSesionEjecutada() {
		return this.codigoSesionEjecutada;
	}

	public void setCodigoSesionEjecutada(int codigoSesionEjecutada) {
		this.codigoSesionEjecutada = codigoSesionEjecutada;
	}

	@Column(name = "codigo_personal_equipo", nullable = false)
	public int getCodigoPersonalEquipo() {
		return this.codigoPersonalEquipo;
	}

	public void setCodigoPersonalEquipo(int codigoPersonalEquipo) {
		this.codigoPersonalEquipo = codigoPersonalEquipo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AsistenciaPersonalEntrenamientoId))
			return false;
		AsistenciaPersonalEntrenamientoId castOther = (AsistenciaPersonalEntrenamientoId) other;

		return (this.getCodigoSesionEjecutada() == castOther
				.getCodigoSesionEjecutada())
				&& (this.getCodigoPersonalEquipo() == castOther
						.getCodigoPersonalEquipo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoSesionEjecutada();
		result = 37 * result + this.getCodigoPersonalEquipo();
		return result;
	}

}
