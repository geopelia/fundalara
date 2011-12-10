package modelo;

// Generated 10/12/2011 11:05:49 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DatoDeportivo generated by hbm2java
 */
@Entity
@Table(name = "dato_deportivo")
public class DatoDeportivo implements java.io.Serializable {

	private DatoDeportivoId id;
	private Competencia competencia;
	private Jugador jugador;
	private TipoLogro tipoLogro;

	public DatoDeportivo() {
	}

	public DatoDeportivo(DatoDeportivoId id, Competencia competencia,
			Jugador jugador, TipoLogro tipoLogro) {
		this.id = id;
		this.competencia = competencia;
		this.jugador = jugador;
		this.tipoLogro = tipoLogro;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cedulaJugador", column = @Column(name = "cedula_jugador", nullable = false)),
			@AttributeOverride(name = "codigoCompetencia", column = @Column(name = "codigo_competencia", nullable = false)),
			@AttributeOverride(name = "codigoLogro", column = @Column(name = "codigo_logro", nullable = false)) })
	public DatoDeportivoId getId() {
		return this.id;
	}

	public void setId(DatoDeportivoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_competencia", nullable = false, insertable = false, updatable = false)
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_jugador", nullable = false, insertable = false, updatable = false)
	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_logro", nullable = false, insertable = false, updatable = false)
	public TipoLogro getTipoLogro() {
		return this.tipoLogro;
	}

	public void setTipoLogro(TipoLogro tipoLogro) {
		this.tipoLogro = tipoLogro;
	}

}
