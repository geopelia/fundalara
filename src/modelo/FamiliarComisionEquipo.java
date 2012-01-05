package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * FamiliarComisionEquipo generated by hbm2java
 */
@Entity
@Table(name = "familiar_comision_equipo")
public class FamiliarComisionEquipo implements java.io.Serializable {

	private FamiliarComisionEquipoId id;
	private FamiliarJugador familiarJugador;
	private ComisionEquipo comisionEquipo;
	private char estatus;

	public FamiliarComisionEquipo() {
	}

	public FamiliarComisionEquipo(FamiliarComisionEquipoId id,
			FamiliarJugador familiarJugador, ComisionEquipo comisionEquipo,
			char estatus) {
		this.id = id;
		this.familiarJugador = familiarJugador;
		this.comisionEquipo = comisionEquipo;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoComision", column = @Column(name = "codigo_comision", nullable = false)),
			@AttributeOverride(name = "cedulaJugador", column = @Column(name = "cedula_jugador", nullable = false)),
			@AttributeOverride(name = "cedulaFamiliar", column = @Column(name = "cedula_familiar", nullable = false)),
			@AttributeOverride(name = "codigoEquipo", column = @Column(name = "codigo_equipo", nullable = false)) })
	public FamiliarComisionEquipoId getId() {
		return this.id;
	}

	public void setId(FamiliarComisionEquipoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "cedula_jugador", referencedColumnName = "cedula_jugador", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "cedula_familiar", referencedColumnName = "cedula_familiar", nullable = false, insertable = false, updatable = false) })
	public FamiliarJugador getFamiliarJugador() {
		return this.familiarJugador;
	}

	public void setFamiliarJugador(FamiliarJugador familiarJugador) {
		this.familiarJugador = familiarJugador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "codigo_comision", referencedColumnName = "codigo_comision", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "codigo_equipo", referencedColumnName = "codigo_equipo", nullable = false, insertable = false, updatable = false) })
	public ComisionEquipo getComisionEquipo() {
		return this.comisionEquipo;
	}

	public void setComisionEquipo(ComisionEquipo comisionEquipo) {
		this.comisionEquipo = comisionEquipo;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
