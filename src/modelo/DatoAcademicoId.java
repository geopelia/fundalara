package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DatoAcademicoId generated by hbm2java
 */
@Embeddable
public class DatoAcademicoId implements java.io.Serializable {

	private String cedulaJugador;
	private String codigoInstitucion;
	private String codigoAnnoEscolar;

	public DatoAcademicoId() {
	}

	public DatoAcademicoId(String cedulaJugador, String codigoInstitucion,
			String codigoAnnoEscolar) {
		this.cedulaJugador = cedulaJugador;
		this.codigoInstitucion = codigoInstitucion;
		this.codigoAnnoEscolar = codigoAnnoEscolar;
	}

	@Column(name = "cedula_jugador", nullable = false)
	public String getCedulaJugador() {
		return this.cedulaJugador;
	}

	public void setCedulaJugador(String cedulaJugador) {
		this.cedulaJugador = cedulaJugador;
	}

	@Column(name = "codigo_institucion", nullable = false)
	public String getCodigoInstitucion() {
		return this.codigoInstitucion;
	}

	public void setCodigoInstitucion(String codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}

	@Column(name = "codigo_anno_escolar", nullable = false)
	public String getCodigoAnnoEscolar() {
		return this.codigoAnnoEscolar;
	}

	public void setCodigoAnnoEscolar(String codigoAnnoEscolar) {
		this.codigoAnnoEscolar = codigoAnnoEscolar;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DatoAcademicoId))
			return false;
		DatoAcademicoId castOther = (DatoAcademicoId) other;

		return ((this.getCedulaJugador() == castOther.getCedulaJugador()) || (this
				.getCedulaJugador() != null
				&& castOther.getCedulaJugador() != null && this
				.getCedulaJugador().equals(castOther.getCedulaJugador())))
				&& ((this.getCodigoInstitucion() == castOther
						.getCodigoInstitucion()) || (this
						.getCodigoInstitucion() != null
						&& castOther.getCodigoInstitucion() != null && this
						.getCodigoInstitucion().equals(
								castOther.getCodigoInstitucion())))
				&& ((this.getCodigoAnnoEscolar() == castOther
						.getCodigoAnnoEscolar()) || (this
						.getCodigoAnnoEscolar() != null
						&& castOther.getCodigoAnnoEscolar() != null && this
						.getCodigoAnnoEscolar().equals(
								castOther.getCodigoAnnoEscolar())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCedulaJugador() == null ? 0 : this.getCedulaJugador()
						.hashCode());
		result = 37
				* result
				+ (getCodigoInstitucion() == null ? 0 : this
						.getCodigoInstitucion().hashCode());
		result = 37
				* result
				+ (getCodigoAnnoEscolar() == null ? 0 : this
						.getCodigoAnnoEscolar().hashCode());
		return result;
	}

}
