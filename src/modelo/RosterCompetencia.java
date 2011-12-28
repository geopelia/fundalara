package modelo;

// Generated 28/12/2011 03:24:38 PM by Hibernate Tools 3.4.0.CR1

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
 * RosterCompetencia generated by hbm2java
 */
@Entity
@Table(name = "roster_competencia", schema = "public")
public class RosterCompetencia implements java.io.Serializable {

	private int codigoRosterCompetencia;
	private Roster roster;
	private DatoBasico datoBasicoByCodigoJugadorClave;
	private Competencia competencia;
	private DatoBasico datoBasicoByCodigoTipoJugador;
	private Set<LineUp> lineUps = new HashSet<LineUp>(0);

	public RosterCompetencia() {
	}

	public RosterCompetencia(int codigoRosterCompetencia, Roster roster,
			DatoBasico datoBasicoByCodigoJugadorClave, Competencia competencia,
			DatoBasico datoBasicoByCodigoTipoJugador) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
		this.roster = roster;
		this.datoBasicoByCodigoJugadorClave = datoBasicoByCodigoJugadorClave;
		this.competencia = competencia;
		this.datoBasicoByCodigoTipoJugador = datoBasicoByCodigoTipoJugador;
	}

	public RosterCompetencia(int codigoRosterCompetencia, Roster roster,
			DatoBasico datoBasicoByCodigoJugadorClave, Competencia competencia,
			DatoBasico datoBasicoByCodigoTipoJugador, Set<LineUp> lineUps) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
		this.roster = roster;
		this.datoBasicoByCodigoJugadorClave = datoBasicoByCodigoJugadorClave;
		this.competencia = competencia;
		this.datoBasicoByCodigoTipoJugador = datoBasicoByCodigoTipoJugador;
		this.lineUps = lineUps;
	}

	@Id
	@Column(name = "codigo_roster_competencia", unique = true, nullable = false)
	public int getCodigoRosterCompetencia() {
		return this.codigoRosterCompetencia;
	}

	public void setCodigoRosterCompetencia(int codigoRosterCompetencia) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_roster", nullable = false)
	public Roster getRoster() {
		return this.roster;
	}

	public void setRoster(Roster roster) {
		this.roster = roster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_jugador_clave", nullable = false)
	public DatoBasico getDatoBasicoByCodigoJugadorClave() {
		return this.datoBasicoByCodigoJugadorClave;
	}

	public void setDatoBasicoByCodigoJugadorClave(
			DatoBasico datoBasicoByCodigoJugadorClave) {
		this.datoBasicoByCodigoJugadorClave = datoBasicoByCodigoJugadorClave;
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
	@JoinColumn(name = "codigo_tipo_jugador", nullable = false)
	public DatoBasico getDatoBasicoByCodigoTipoJugador() {
		return this.datoBasicoByCodigoTipoJugador;
	}

	public void setDatoBasicoByCodigoTipoJugador(
			DatoBasico datoBasicoByCodigoTipoJugador) {
		this.datoBasicoByCodigoTipoJugador = datoBasicoByCodigoTipoJugador;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rosterCompetencia")
	public Set<LineUp> getLineUps() {
		return this.lineUps;
	}

	public void setLineUps(Set<LineUp> lineUps) {
		this.lineUps = lineUps;
	}

}
