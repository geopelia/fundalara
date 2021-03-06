package modelo;

// Generated 09/01/2012 10:28:45 AM by Hibernate Tools 3.4.0.CR1

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
 * DesempeoJugador generated by hbm2java
 */
@Entity
@Table(name = "desempeo_jugador", schema = "public")
public class DesempeoJugador implements java.io.Serializable {

	private DesempeoJugadorId id;
	private AsistenciaJugador asistenciaJugador;
	private Usuario usuario;
	private ActividadesEjecutadas actividadesEjecutadas;
	private String puntuacion;
	private char estatus;
	private Date fechaCreacion;
	private Date horaCreacion;
	private Date fechaModificacion;
	private String horaModificacion;

	public DesempeoJugador() {
	}

	public DesempeoJugador(DesempeoJugadorId id,
			AsistenciaJugador asistenciaJugador, Usuario usuario,
			ActividadesEjecutadas actividadesEjecutadas, String puntuacion,
			char estatus, Date fechaCreacion, Date horaCreacion,
			Date fechaModificacion, String horaModificacion) {
		this.id = id;
		this.asistenciaJugador = asistenciaJugador;
		this.usuario = usuario;
		this.actividadesEjecutadas = actividadesEjecutadas;
		this.puntuacion = puntuacion;
		this.estatus = estatus;
		this.fechaCreacion = fechaCreacion;
		this.horaCreacion = horaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.horaModificacion = horaModificacion;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoAsistencia", column = @Column(name = "codigo_asistencia", nullable = false)),
			@AttributeOverride(name = "codigoActividadEjecutada", column = @Column(name = "codigo_actividad_ejecutada", nullable = false)) })
	public DesempeoJugadorId getId() {
		return this.id;
	}

	public void setId(DesempeoJugadorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_asistencia", nullable = false, insertable = false, updatable = false)
	public AsistenciaJugador getAsistenciaJugador() {
		return this.asistenciaJugador;
	}

	public void setAsistenciaJugador(AsistenciaJugador asistenciaJugador) {
		this.asistenciaJugador = asistenciaJugador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cedula_rif", nullable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_actividad_ejecutada", nullable = false, insertable = false, updatable = false)
	public ActividadesEjecutadas getActividadesEjecutadas() {
		return this.actividadesEjecutadas;
	}

	public void setActividadesEjecutadas(
			ActividadesEjecutadas actividadesEjecutadas) {
		this.actividadesEjecutadas = actividadesEjecutadas;
	}

	@Column(name = "puntuacion", nullable = false)
	public String getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_creacion", nullable = false, length = 13)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_creacion", nullable = false, length = 15)
	public Date getHoraCreacion() {
		return this.horaCreacion;
	}

	public void setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = horaCreacion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_modificacion", nullable = false, length = 13)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Column(name = "hora_modificacion", nullable = false)
	public String getHoraModificacion() {
		return this.horaModificacion;
	}

	public void setHoraModificacion(String horaModificacion) {
		this.horaModificacion = horaModificacion;
	}

}
