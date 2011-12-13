package modelo;

// Generated 12/12/2011 09:17:13 PM by Hibernate Tools 3.4.0.CR1

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
 * DatoSocial generated by hbm2java
 */
@Entity
@Table(name = "dato_social")
public class DatoSocial implements java.io.Serializable {

	private DatoSocialId id;
	private Institucion institucion;
	private Jugador jugador;
	private TipoActividadSocial tipoActividadSocial;
	private char estatus;
	private String fechaInicio;
	private int horasDedicadas;

	public DatoSocial() {
	}

	public DatoSocial(DatoSocialId id, Institucion institucion,
			Jugador jugador, TipoActividadSocial tipoActividadSocial,
			char estatus, String fechaInicio, int horasDedicadas) {
		this.id = id;
		this.institucion = institucion;
		this.jugador = jugador;
		this.tipoActividadSocial = tipoActividadSocial;
		this.estatus = estatus;
		this.fechaInicio = fechaInicio;
		this.horasDedicadas = horasDedicadas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cedulaJugador", column = @Column(name = "cedula_jugador", nullable = false)),
			@AttributeOverride(name = "codigoInstitucion", column = @Column(name = "codigo_institucion", nullable = false)) })
	public DatoSocialId getId() {
		return this.id;
	}

	public void setId(DatoSocialId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_institucion", nullable = false, insertable = false, updatable = false)
	public Institucion getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
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
	@JoinColumn(name = "codigo_actividad_social", nullable = false)
	public TipoActividadSocial getTipoActividadSocial() {
		return this.tipoActividadSocial;
	}

	public void setTipoActividadSocial(TipoActividadSocial tipoActividadSocial) {
		this.tipoActividadSocial = tipoActividadSocial;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "fecha_inicio", nullable = false)
	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name = "horas_dedicadas", nullable = false)
	public int getHorasDedicadas() {
		return this.horasDedicadas;
	}

	public void setHorasDedicadas(int horasDedicadas) {
		this.horasDedicadas = horasDedicadas;
	}

}
