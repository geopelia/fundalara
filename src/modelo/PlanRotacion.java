package modelo;

// Generated 09/01/2012 10:28:45 AM by Hibernate Tools 3.4.0.CR1

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
 * PlanRotacion generated by hbm2java
 */
@Entity
@Table(name = "plan_rotacion", schema = "public")
public class PlanRotacion implements java.io.Serializable {

	private int codigoPlanRotacion;
	private DatoBasico datoBasico;
	private Instalacion instalacion;
	private Sesion sesion;
	private Date fechaUso;
	private char estatus;
	private Set<SesionEjecutada> sesionEjecutadas = new HashSet<SesionEjecutada>(
			0);

	public PlanRotacion() {
	}

	public PlanRotacion(int codigoPlanRotacion, DatoBasico datoBasico,
			Instalacion instalacion, Sesion sesion, Date fechaUso, char estatus) {
		this.codigoPlanRotacion = codigoPlanRotacion;
		this.datoBasico = datoBasico;
		this.instalacion = instalacion;
		this.sesion = sesion;
		this.fechaUso = fechaUso;
		this.estatus = estatus;
	}

	public PlanRotacion(int codigoPlanRotacion, DatoBasico datoBasico,
			Instalacion instalacion, Sesion sesion, Date fechaUso,
			char estatus, Set<SesionEjecutada> sesionEjecutadas) {
		this.codigoPlanRotacion = codigoPlanRotacion;
		this.datoBasico = datoBasico;
		this.instalacion = instalacion;
		this.sesion = sesion;
		this.fechaUso = fechaUso;
		this.estatus = estatus;
		this.sesionEjecutadas = sesionEjecutadas;
	}

	@Id
	@Column(name = "codigo_plan_rotacion", unique = true, nullable = false)
	public int getCodigoPlanRotacion() {
		return this.codigoPlanRotacion;
	}

	public void setCodigoPlanRotacion(int codigoPlanRotacion) {
		this.codigoPlanRotacion = codigoPlanRotacion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eventualidad", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_instalacion", nullable = false)
	public Instalacion getInstalacion() {
		return this.instalacion;
	}

	public void setInstalacion(Instalacion instalacion) {
		this.instalacion = instalacion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_sesion", nullable = false)
	public Sesion getSesion() {
		return this.sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_uso", nullable = false, length = 13)
	public Date getFechaUso() {
		return this.fechaUso;
	}

	public void setFechaUso(Date fechaUso) {
		this.fechaUso = fechaUso;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planRotacion")
	public Set<SesionEjecutada> getSesionEjecutadas() {
		return this.sesionEjecutadas;
	}

	public void setSesionEjecutadas(Set<SesionEjecutada> sesionEjecutadas) {
		this.sesionEjecutadas = sesionEjecutadas;
	}

}
