package modelo;

// Generated 09/01/2012 10:28:45 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
	private Competencia competencia;
	private char estatus;
	private Set<LineUp> lineUps = new HashSet<LineUp>(0);
	private Set<JugadorRefuerzo> jugadorRefuerzos = new HashSet<JugadorRefuerzo>(
			0);

	public RosterCompetencia() {
	}

	public RosterCompetencia(int codigoRosterCompetencia, Roster roster,
			Competencia competencia, char estatus) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
		this.roster = roster;
		this.competencia = competencia;
		this.estatus = estatus;
	}

	public RosterCompetencia(int codigoRosterCompetencia, Roster roster,
			Competencia competencia, char estatus, Set<LineUp> lineUps,
			Set<JugadorRefuerzo> jugadorRefuerzos) {
		this.codigoRosterCompetencia = codigoRosterCompetencia;
		this.roster = roster;
		this.competencia = competencia;
		this.estatus = estatus;
		this.lineUps = lineUps;
		this.jugadorRefuerzos = jugadorRefuerzos;
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
	@JoinColumn(name = "codigo_competencia", nullable = false)
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rosterCompetencia")
	public Set<LineUp> getLineUps() {
		return this.lineUps;
	}

	public void setLineUps(Set<LineUp> lineUps) {
		this.lineUps = lineUps;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "rosterCompetencias")
	public Set<JugadorRefuerzo> getJugadorRefuerzos() {
		return this.jugadorRefuerzos;
	}

	public void setJugadorRefuerzos(Set<JugadorRefuerzo> jugadorRefuerzos) {
		this.jugadorRefuerzos = jugadorRefuerzos;
	}

}