package modelo;

// Generated 16/12/2011 03:51:27 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Roster generated by hbm2java
 */
@Entity
@Table(name = "roster")
public class Roster implements java.io.Serializable {

	private String codigoRoster;
	private Jugador jugador;
	private Equipo equipo;
	private Date fechaIngreso;
	private char estatus;
	private Set<RosterCompetencia> rosterCompetencias = new HashSet<RosterCompetencia>(
			0);

	public Roster() {
	}

	public Roster(String codigoRoster, Jugador jugador, Equipo equipo,
			Date fechaIngreso, char estatus) {
		this.codigoRoster = codigoRoster;
		this.jugador = jugador;
		this.equipo = equipo;
		this.fechaIngreso = fechaIngreso;
		this.estatus = estatus;
	}

	public Roster(String codigoRoster, Jugador jugador, Equipo equipo,
			Date fechaIngreso, char estatus,
			Set<RosterCompetencia> rosterCompetencias) {
		this.codigoRoster = codigoRoster;
		this.jugador = jugador;
		this.equipo = equipo;
		this.fechaIngreso = fechaIngreso;
		this.estatus = estatus;
		this.rosterCompetencias = rosterCompetencias;
	}

	@Id
	@Column(name = "codigo_roster", unique = true, nullable = false)
	public String getCodigoRoster() {
		return this.codigoRoster;
	}

	public void setCodigoRoster(String codigoRoster) {
		this.codigoRoster = codigoRoster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_equipo", nullable = false)
	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_ingreso", nullable = false, length = 13)
	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "roster")
	public Set<RosterCompetencia> getRosterCompetencias() {
		return this.rosterCompetencias;
	}

	public void setRosterCompetencias(Set<RosterCompetencia> rosterCompetencias) {
		this.rosterCompetencias = rosterCompetencias;
	}

}
