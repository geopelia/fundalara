package modelo;

// Generated 09/01/2012 10:28:45 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Personal generated by hbm2java
 */
@Entity
@Table(name = "personal", schema = "public")
public class Personal implements java.io.Serializable {

	private String cedulaRif;
	private DatoBasico datoBasico;
	private PersonaNatural personaNatural;
	private int cantidadHijos;
	private char estatus;
	private String tipoSangre;
	private Set<Requisicion> requisicions = new HashSet<Requisicion>(0);
	private Set<Movimiento> movimientos = new HashSet<Movimiento>(0);
	private Set<PersonalTipoNomina> personalTipoNominas = new HashSet<PersonalTipoNomina>(
			0);
	private Set<PersonalConceptoNomina> personalConceptoNominas = new HashSet<PersonalConceptoNomina>(
			0);
	private Set<PersonalContrato> personalContratos = new HashSet<PersonalContrato>(
			0);
	private Set<DatoAcademicoPersonal> datoAcademicoPersonals = new HashSet<DatoAcademicoPersonal>(
			0);
	private Set<AfeccionPersonal> afeccionPersonals = new HashSet<AfeccionPersonal>(
			0);
	private Set<PersonalEquipo> personalEquipos = new HashSet<PersonalEquipo>(0);
	private Set<PersonalActividad> personalActividads = new HashSet<PersonalActividad>(
			0);
	private Usuario usuario;
	private Set<PersonalCargo> personalCargos = new HashSet<PersonalCargo>(0);
	private Set<PersonalActividadPlanificada> personalActividadPlanificadas = new HashSet<PersonalActividadPlanificada>(
			0);

	public Personal() {
	}

	public Personal(DatoBasico datoBasico, PersonaNatural personaNatural,
			int cantidadHijos, char estatus) {
		this.datoBasico = datoBasico;
		this.personaNatural = personaNatural;
		this.cantidadHijos = cantidadHijos;
		this.estatus = estatus;
	}

	public Personal(DatoBasico datoBasico, PersonaNatural personaNatural,
			int cantidadHijos, char estatus, String tipoSangre,
			Set<Requisicion> requisicions, Set<Movimiento> movimientos,
			Set<PersonalTipoNomina> personalTipoNominas,
			Set<PersonalConceptoNomina> personalConceptoNominas,
			Set<PersonalContrato> personalContratos,
			Set<DatoAcademicoPersonal> datoAcademicoPersonals,
			Set<AfeccionPersonal> afeccionPersonals,
			Set<PersonalEquipo> personalEquipos,
			Set<PersonalActividad> personalActividads, Usuario usuario,
			Set<PersonalCargo> personalCargos,
			Set<PersonalActividadPlanificada> personalActividadPlanificadas) {
		this.datoBasico = datoBasico;
		this.personaNatural = personaNatural;
		this.cantidadHijos = cantidadHijos;
		this.estatus = estatus;
		this.tipoSangre = tipoSangre;
		this.requisicions = requisicions;
		this.movimientos = movimientos;
		this.personalTipoNominas = personalTipoNominas;
		this.personalConceptoNominas = personalConceptoNominas;
		this.personalContratos = personalContratos;
		this.datoAcademicoPersonals = datoAcademicoPersonals;
		this.afeccionPersonals = afeccionPersonals;
		this.personalEquipos = personalEquipos;
		this.personalActividads = personalActividads;
		this.usuario = usuario;
		this.personalCargos = personalCargos;
		this.personalActividadPlanificadas = personalActividadPlanificadas;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "personaNatural"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "cedula_rif", unique = true, nullable = false)
	public String getCedulaRif() {
		return this.cedulaRif;
	}

	public void setCedulaRif(String cedulaRif) {
		this.cedulaRif = cedulaRif;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_estado_civil", nullable = false)
	public DatoBasico getDatoBasico() {
		return this.datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public PersonaNatural getPersonaNatural() {
		return this.personaNatural;
	}

	public void setPersonaNatural(PersonaNatural personaNatural) {
		this.personaNatural = personaNatural;
	}

	@Column(name = "cantidad_hijos", nullable = false)
	public int getCantidadHijos() {
		return this.cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "tipo_sangre")
	public String getTipoSangre() {
		return this.tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<Requisicion> getRequisicions() {
		return this.requisicions;
	}

	public void setRequisicions(Set<Requisicion> requisicions) {
		this.requisicions = requisicions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<Movimiento> getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(Set<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<PersonalTipoNomina> getPersonalTipoNominas() {
		return this.personalTipoNominas;
	}

	public void setPersonalTipoNominas(
			Set<PersonalTipoNomina> personalTipoNominas) {
		this.personalTipoNominas = personalTipoNominas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<PersonalConceptoNomina> getPersonalConceptoNominas() {
		return this.personalConceptoNominas;
	}

	public void setPersonalConceptoNominas(
			Set<PersonalConceptoNomina> personalConceptoNominas) {
		this.personalConceptoNominas = personalConceptoNominas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<PersonalContrato> getPersonalContratos() {
		return this.personalContratos;
	}

	public void setPersonalContratos(Set<PersonalContrato> personalContratos) {
		this.personalContratos = personalContratos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<DatoAcademicoPersonal> getDatoAcademicoPersonals() {
		return this.datoAcademicoPersonals;
	}

	public void setDatoAcademicoPersonals(
			Set<DatoAcademicoPersonal> datoAcademicoPersonals) {
		this.datoAcademicoPersonals = datoAcademicoPersonals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<AfeccionPersonal> getAfeccionPersonals() {
		return this.afeccionPersonals;
	}

	public void setAfeccionPersonals(Set<AfeccionPersonal> afeccionPersonals) {
		this.afeccionPersonals = afeccionPersonals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<PersonalEquipo> getPersonalEquipos() {
		return this.personalEquipos;
	}

	public void setPersonalEquipos(Set<PersonalEquipo> personalEquipos) {
		this.personalEquipos = personalEquipos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<PersonalActividad> getPersonalActividads() {
		return this.personalActividads;
	}

	public void setPersonalActividads(Set<PersonalActividad> personalActividads) {
		this.personalActividads = personalActividads;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personal")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<PersonalCargo> getPersonalCargos() {
		return this.personalCargos;
	}

	public void setPersonalCargos(Set<PersonalCargo> personalCargos) {
		this.personalCargos = personalCargos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<PersonalActividadPlanificada> getPersonalActividadPlanificadas() {
		return this.personalActividadPlanificadas;
	}

	public void setPersonalActividadPlanificadas(
			Set<PersonalActividadPlanificada> personalActividadPlanificadas) {
		this.personalActividadPlanificadas = personalActividadPlanificadas;
	}

}
