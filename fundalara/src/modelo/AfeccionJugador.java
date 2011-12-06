package modelo;

// Generated 06-dic-2011 15:00:16 by Hibernate Tools 3.4.0.CR1

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
 * AfeccionJugador generated by hbm2java
 */
@Entity
@Table(name = "afeccion_jugador")
public class AfeccionJugador implements java.io.Serializable {

	private AfeccionJugadorId id;
	private DatoMedico datoMedico;
	private TipoAfeccion tipoAfeccion;
	private String detalleAfeccion;
	private int duracion;
	private Date fechaRevision;
	private Date fechaReincorporacion;
	private byte[] documento1;
	private byte[] documento2;
	private char estatus;

	public AfeccionJugador() {
	}

	public AfeccionJugador(AfeccionJugadorId id, DatoMedico datoMedico,
			TipoAfeccion tipoAfeccion, String detalleAfeccion, int duracion,
			Date fechaRevision, Date fechaReincorporacion, byte[] documento1,
			byte[] documento2, char estatus) {
		this.id = id;
		this.datoMedico = datoMedico;
		this.tipoAfeccion = tipoAfeccion;
		this.detalleAfeccion = detalleAfeccion;
		this.duracion = duracion;
		this.fechaRevision = fechaRevision;
		this.fechaReincorporacion = fechaReincorporacion;
		this.documento1 = documento1;
		this.documento2 = documento2;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoAfeccion", column = @Column(name = "codigo_afeccion", nullable = false)),
			@AttributeOverride(name = "codigoRegistro", column = @Column(name = "codigo_registro", nullable = false)) })
	public AfeccionJugadorId getId() {
		return this.id;
	}

	public void setId(AfeccionJugadorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_registro", nullable = false, insertable = false, updatable = false)
	public DatoMedico getDatoMedico() {
		return this.datoMedico;
	}

	public void setDatoMedico(DatoMedico datoMedico) {
		this.datoMedico = datoMedico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_afeccion", nullable = false, insertable = false, updatable = false)
	public TipoAfeccion getTipoAfeccion() {
		return this.tipoAfeccion;
	}

	public void setTipoAfeccion(TipoAfeccion tipoAfeccion) {
		this.tipoAfeccion = tipoAfeccion;
	}

	@Column(name = "detalle_afeccion", nullable = false)
	public String getDetalleAfeccion() {
		return this.detalleAfeccion;
	}

	public void setDetalleAfeccion(String detalleAfeccion) {
		this.detalleAfeccion = detalleAfeccion;
	}

	@Column(name = "duracion", nullable = false)
	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_revision", nullable = false, length = 13)
	public Date getFechaRevision() {
		return this.fechaRevision;
	}

	public void setFechaRevision(Date fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_reincorporacion", nullable = false, length = 13)
	public Date getFechaReincorporacion() {
		return this.fechaReincorporacion;
	}

	public void setFechaReincorporacion(Date fechaReincorporacion) {
		this.fechaReincorporacion = fechaReincorporacion;
	}

	@Column(name = "documento1", nullable = false)
	public byte[] getDocumento1() {
		return this.documento1;
	}

	public void setDocumento1(byte[] documento1) {
		this.documento1 = documento1;
	}

	@Column(name = "documento2", nullable = false)
	public byte[] getDocumento2() {
		return this.documento2;
	}

	public void setDocumento2(byte[] documento2) {
		this.documento2 = documento2;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
