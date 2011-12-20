package modelo;

// Generated 20-dic-2011 13:32:22 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PersonalForaneoJuegoId generated by hbm2java
 */
@Embeddable
public class PersonalForaneoJuegoId implements java.io.Serializable {

	private int codigoJuego1;
	private int codigoPersonalForaneo;

	public PersonalForaneoJuegoId() {
	}

	public PersonalForaneoJuegoId(int codigoJuego1, int codigoPersonalForaneo) {
		this.codigoJuego1 = codigoJuego1;
		this.codigoPersonalForaneo = codigoPersonalForaneo;
	}

	@Column(name = "codigo_juego1", nullable = false)
	public int getCodigoJuego1() {
		return this.codigoJuego1;
	}

	public void setCodigoJuego1(int codigoJuego1) {
		this.codigoJuego1 = codigoJuego1;
	}

	@Column(name = "codigo_personal_foraneo", nullable = false)
	public int getCodigoPersonalForaneo() {
		return this.codigoPersonalForaneo;
	}

	public void setCodigoPersonalForaneo(int codigoPersonalForaneo) {
		this.codigoPersonalForaneo = codigoPersonalForaneo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PersonalForaneoJuegoId))
			return false;
		PersonalForaneoJuegoId castOther = (PersonalForaneoJuegoId) other;

		return (this.getCodigoJuego1() == castOther.getCodigoJuego1())
				&& (this.getCodigoPersonalForaneo() == castOther
						.getCodigoPersonalForaneo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoJuego1();
		result = 37 * result + this.getCodigoPersonalForaneo();
		return result;
	}

}
