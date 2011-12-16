package modelo;

// Generated 16/12/2011 03:51:27 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FamiliarJugador generated by hbm2java
 */
@Entity
@Table(name = "familiar_jugador")
public class FamiliarJugador implements java.io.Serializable {

	private FamiliarJugadorId id;
	private DatoBasico datoBasico;
	private Jugador jugador;
	private Familiar familiar;
	private boolean representante;
	private Date fechaIngreso;
	private char estatus;

	public FamiliarJugador() {
	}

	public FamiliarJugador(FamiliarJugadorId id, DatoBasico datoBasico,
			Jugador jugador, Familiar familiar, boolean representante,
			Date fechaIngreso, char estatus) {
		this.id = id;
		this.datoBasico = datoBasico;
		this.jugador = jugador;
		this.familiar = familiar;
		this.representante = representante;
		this.fechaIngreso = fechaIngreso;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cedulaRif", column = @Column(name = "cedula_rif", nullable = false)),
			@AttributeOverride(name = "cedulaFamiliar", column = @Column(name = "cedula_familiar", nullable = false)) })
	public FamiliarJugadorId getId() {
		return this.id;
	}

	public void setId(FamiliarJugadorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_parentesco", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false, insertable = false, updatable = false)
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false, insertable = false, updatable = false)
	public Familiar getFamiliar() {
		return this.familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}

	@Column(name = "representante", nullable = false)
	public boolean isRepresentante() {
		return this.representante;
	}

	public void setRepresentante(boolean representante) {
		this.representante = representante;
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

}
