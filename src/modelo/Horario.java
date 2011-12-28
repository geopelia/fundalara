package modelo;

// Generated 28/12/2011 03:24:38 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Horario generated by hbm2java
 */
@Entity
@Table(name = "horario", schema = "public")
public class Horario implements java.io.Serializable {

	private int codigoHorario;
	private DatoBasico datoBasico;
	private PlanTemporada planTemporada;
	private Date horInicio;
	private Date horaFin;
	private char estatus;

	public Horario() {
	}

	public Horario(int codigoHorario, DatoBasico datoBasico,
			PlanTemporada planTemporada, Date horInicio, Date horaFin,
			char estatus) {
		this.codigoHorario = codigoHorario;
		this.datoBasico = datoBasico;
		this.planTemporada = planTemporada;
		this.horInicio = horInicio;
		this.horaFin = horaFin;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "codigo_horario", unique = true, nullable = false)
	public int getCodigoHorario() {
		return this.codigoHorario;
	}

	public void setCodigoHorario(int codigoHorario) {
		this.codigoHorario = codigoHorario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_dato_basico", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_plan_temporada", nullable = false)
	public PlanTemporada getPlanTemporada() {
		return this.planTemporada;
	}

	public void setPlanTemporada(PlanTemporada planTemporada) {
		this.planTemporada = planTemporada;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hor_inicio", nullable = false, length = 15)
	public Date getHorInicio() {
		return this.horInicio;
	}

	public void setHorInicio(Date horInicio) {
		this.horInicio = horInicio;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_fin", nullable = false, length = 15)
	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
