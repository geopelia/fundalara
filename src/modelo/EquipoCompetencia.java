package modelo;

// Generated 09/01/2012 10:28:45 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EquipoCompetencia generated by hbm2java
 */
@Entity
@Table(name = "equipo_competencia", schema = "public")
public class EquipoCompetencia implements java.io.Serializable {

	private int codigoEquipoCompetencia;
	private PersonaNatural personaNatural;
	private Competencia competencia;
	private Equipo equipo;
	private char estatus;
	private Set<JugadorRefuerzo> jugadorRefuerzos = new HashSet<JugadorRefuerzo>(
			0);
	private Set<EquipoJuego> equipoJuegos = new HashSet<EquipoJuego>(0);

	public EquipoCompetencia() {
	}

	public EquipoCompetencia(int codigoEquipoCompetencia,
			PersonaNatural personaNatural, Competencia competencia,
			Equipo equipo, char estatus) {
		this.codigoEquipoCompetencia = codigoEquipoCompetencia;
		this.personaNatural = personaNatural;
		this.competencia = competencia;
		this.equipo = equipo;
		this.estatus = estatus;
	}

	public EquipoCompetencia(int codigoEquipoCompetencia,
			PersonaNatural personaNatural, Competencia competencia,
			Equipo equipo, char estatus, Set<JugadorRefuerzo> jugadorRefuerzos,
			Set<EquipoJuego> equipoJuegos) {
		this.codigoEquipoCompetencia = codigoEquipoCompetencia;
		this.personaNatural = personaNatural;
		this.competencia = competencia;
		this.equipo = equipo;
		this.estatus = estatus;
		this.jugadorRefuerzos = jugadorRefuerzos;
		this.equipoJuegos = equipoJuegos;
	}

	@Id
	@Column(name = "codigo_equipo_competencia", unique = true, nullable = false)
	public int getCodigoEquipoCompetencia() {
		return this.codigoEquipoCompetencia;
	}

	public void setCodigoEquipoCompetencia(int codigoEquipoCompetencia) {
		this.codigoEquipoCompetencia = codigoEquipoCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_delegado", nullable = false)
	public PersonaNatural getPersonaNatural() {
		return this.personaNatural;
	}

	public void setPersonaNatural(PersonaNatural personaNatural) {
		this.personaNatural = personaNatural;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_competencia", nullable = false)
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_equipo", nullable = false)
	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipoCompetencia")
	public Set<JugadorRefuerzo> getJugadorRefuerzos() {
		return this.jugadorRefuerzos;
	}

	public void setJugadorRefuerzos(Set<JugadorRefuerzo> jugadorRefuerzos) {
		this.jugadorRefuerzos = jugadorRefuerzos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipoCompetencia")
	public Set<EquipoJuego> getEquipoJuegos() {
		return this.equipoJuegos;
	}

	public void setEquipoJuegos(Set<EquipoJuego> equipoJuegos) {
		this.equipoJuegos = equipoJuegos;
	}

}