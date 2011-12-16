package modelo;

// Generated 16/12/2011 03:51:27 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DesempennoIndividualId generated by hbm2java
 */
@Embeddable
public class DesempennoIndividualId implements java.io.Serializable {

	private String codigoIndicadorCompetencia;
	private String codigoLineUp;

	public DesempennoIndividualId() {
	}

	public DesempennoIndividualId(String codigoIndicadorCompetencia,
			String codigoLineUp) {
		this.codigoIndicadorCompetencia = codigoIndicadorCompetencia;
		this.codigoLineUp = codigoLineUp;
	}

	@Column(name = "codigo_indicador_competencia", nullable = false)
	public String getCodigoIndicadorCompetencia() {
		return this.codigoIndicadorCompetencia;
	}

	public void setCodigoIndicadorCompetencia(String codigoIndicadorCompetencia) {
		this.codigoIndicadorCompetencia = codigoIndicadorCompetencia;
	}

	@Column(name = "codigo_line_up", nullable = false)
	public String getCodigoLineUp() {
		return this.codigoLineUp;
	}

	public void setCodigoLineUp(String codigoLineUp) {
		this.codigoLineUp = codigoLineUp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DesempennoIndividualId))
			return false;
		DesempennoIndividualId castOther = (DesempennoIndividualId) other;

		return ((this.getCodigoIndicadorCompetencia() == castOther
				.getCodigoIndicadorCompetencia()) || (this
				.getCodigoIndicadorCompetencia() != null
				&& castOther.getCodigoIndicadorCompetencia() != null && this
				.getCodigoIndicadorCompetencia().equals(
						castOther.getCodigoIndicadorCompetencia())))
				&& ((this.getCodigoLineUp() == castOther.getCodigoLineUp()) || (this
						.getCodigoLineUp() != null
						&& castOther.getCodigoLineUp() != null && this
						.getCodigoLineUp().equals(castOther.getCodigoLineUp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoIndicadorCompetencia() == null ? 0 : this
						.getCodigoIndicadorCompetencia().hashCode());
		result = 37
				* result
				+ (getCodigoLineUp() == null ? 0 : this.getCodigoLineUp()
						.hashCode());
		return result;
	}

}
