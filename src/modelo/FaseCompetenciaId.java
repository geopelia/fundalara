package modelo;

// Generated 12/12/2011 09:17:13 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FaseCompetenciaId generated by hbm2java
 */
@Embeddable
public class FaseCompetenciaId implements java.io.Serializable {

	private String codigoCompetencia;
	private int numeroFase;

	public FaseCompetenciaId() {
	}

	public FaseCompetenciaId(String codigoCompetencia, int numeroFase) {
		this.codigoCompetencia = codigoCompetencia;
		this.numeroFase = numeroFase;
	}

	@Column(name = "codigo_competencia", nullable = false)
	public String getCodigoCompetencia() {
		return this.codigoCompetencia;
	}

	public void setCodigoCompetencia(String codigoCompetencia) {
		this.codigoCompetencia = codigoCompetencia;
	}

	@Column(name = "numero_fase", nullable = false)
	public int getNumeroFase() {
		return this.numeroFase;
	}

	public void setNumeroFase(int numeroFase) {
		this.numeroFase = numeroFase;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FaseCompetenciaId))
			return false;
		FaseCompetenciaId castOther = (FaseCompetenciaId) other;

		return ((this.getCodigoCompetencia() == castOther
				.getCodigoCompetencia()) || (this.getCodigoCompetencia() != null
				&& castOther.getCodigoCompetencia() != null && this
				.getCodigoCompetencia()
				.equals(castOther.getCodigoCompetencia())))
				&& (this.getNumeroFase() == castOther.getNumeroFase());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoCompetencia() == null ? 0 : this
						.getCodigoCompetencia().hashCode());
		result = 37 * result + this.getNumeroFase();
		return result;
	}

}
