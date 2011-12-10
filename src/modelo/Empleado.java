package modelo;

// Generated 10/12/2011 11:05:49 AM by Hibernate Tools 3.4.0.CR1

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
 * Empleado generated by hbm2java
 */
@Entity
@Table(name = "empleado")
public class Empleado implements java.io.Serializable {

	private String cedula;
	private Parroquia parroquia;
	private int cantidadHijos;
	private String correoElectronico;
	private String cuentaFacebook;
	private String cuentaTwitter;
	private String direccion;
	private String estadoCivil;
	private char estatus;
	private Date fechaEgreso;
	private byte[] foto;
	private String primerApellido;
	private String primerNombre;
	private String segundoApellido;
	private String segundoNombre;
	private String telefono1;
	private String telefono2;
	private String tipoSangre;
	private Set<EmpleadoSueldo> empleadoSueldos = new HashSet<EmpleadoSueldo>(0);
	private Set<EmpleadoTipoNomina> empleadoTipoNominas = new HashSet<EmpleadoTipoNomina>(
			0);
	private Set<EmpleadoConceptoNomina> empleadoConceptoNominas = new HashSet<EmpleadoConceptoNomina>(
			0);
	private Set<EmpleadoMantenimientoPlanificado> empleadoMantenimientoPlanificados = new HashSet<EmpleadoMantenimientoPlanificado>(
			0);
	private Set<DatoAcademicoEmpleado> datoAcademicoEmpleados = new HashSet<DatoAcademicoEmpleado>(
			0);
	private Set<EmpleadoCargo> empleadoCargos = new HashSet<EmpleadoCargo>(0);
	private Set<EmpleadoMantenimiento> empleadoMantenimientos = new HashSet<EmpleadoMantenimiento>(
			0);
	private Set<EmpleadoAlergia> empleadoAlergias = new HashSet<EmpleadoAlergia>(
			0);

	public Empleado() {
	}

	public Empleado(String cedula, Parroquia parroquia, int cantidadHijos,
			String direccion, String estadoCivil, char estatus,
			Date fechaEgreso, String primerApellido, String primerNombre,
			String tipoSangre) {
		this.cedula = cedula;
		this.parroquia = parroquia;
		this.cantidadHijos = cantidadHijos;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.estatus = estatus;
		this.fechaEgreso = fechaEgreso;
		this.primerApellido = primerApellido;
		this.primerNombre = primerNombre;
		this.tipoSangre = tipoSangre;
	}

	public Empleado(
			String cedula,
			Parroquia parroquia,
			int cantidadHijos,
			String correoElectronico,
			String cuentaFacebook,
			String cuentaTwitter,
			String direccion,
			String estadoCivil,
			char estatus,
			Date fechaEgreso,
			byte[] foto,
			String primerApellido,
			String primerNombre,
			String segundoApellido,
			String segundoNombre,
			String telefono1,
			String telefono2,
			String tipoSangre,
			Set<EmpleadoSueldo> empleadoSueldos,
			Set<EmpleadoTipoNomina> empleadoTipoNominas,
			Set<EmpleadoConceptoNomina> empleadoConceptoNominas,
			Set<EmpleadoMantenimientoPlanificado> empleadoMantenimientoPlanificados,
			Set<DatoAcademicoEmpleado> datoAcademicoEmpleados,
			Set<EmpleadoCargo> empleadoCargos,
			Set<EmpleadoMantenimiento> empleadoMantenimientos,
			Set<EmpleadoAlergia> empleadoAlergias) {
		this.cedula = cedula;
		this.parroquia = parroquia;
		this.cantidadHijos = cantidadHijos;
		this.correoElectronico = correoElectronico;
		this.cuentaFacebook = cuentaFacebook;
		this.cuentaTwitter = cuentaTwitter;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.estatus = estatus;
		this.fechaEgreso = fechaEgreso;
		this.foto = foto;
		this.primerApellido = primerApellido;
		this.primerNombre = primerNombre;
		this.segundoApellido = segundoApellido;
		this.segundoNombre = segundoNombre;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.tipoSangre = tipoSangre;
		this.empleadoSueldos = empleadoSueldos;
		this.empleadoTipoNominas = empleadoTipoNominas;
		this.empleadoConceptoNominas = empleadoConceptoNominas;
		this.empleadoMantenimientoPlanificados = empleadoMantenimientoPlanificados;
		this.datoAcademicoEmpleados = datoAcademicoEmpleados;
		this.empleadoCargos = empleadoCargos;
		this.empleadoMantenimientos = empleadoMantenimientos;
		this.empleadoAlergias = empleadoAlergias;
	}

	@Id
	@Column(name = "cedula", unique = true, nullable = false)
	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_parroquia", nullable = false)
	public Parroquia getParroquia() {
		return this.parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	@Column(name = "cantidad_hijos", nullable = false)
	public int getCantidadHijos() {
		return this.cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	@Column(name = "correo_electronico")
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Column(name = "cuenta_facebook")
	public String getCuentaFacebook() {
		return this.cuentaFacebook;
	}

	public void setCuentaFacebook(String cuentaFacebook) {
		this.cuentaFacebook = cuentaFacebook;
	}

	@Column(name = "cuenta_twitter")
	public String getCuentaTwitter() {
		return this.cuentaTwitter;
	}

	public void setCuentaTwitter(String cuentaTwitter) {
		this.cuentaTwitter = cuentaTwitter;
	}

	@Column(name = "direccion", nullable = false)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "estado_civil", nullable = false)
	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_egreso", nullable = false, length = 13)
	public Date getFechaEgreso() {
		return this.fechaEgreso;
	}

	public void setFechaEgreso(Date fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	@Column(name = "foto")
	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@Column(name = "primer_apellido", nullable = false)
	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	@Column(name = "primer_nombre", nullable = false)
	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	@Column(name = "segundo_apellido")
	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Column(name = "segundo_nombre")
	public String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	@Column(name = "telefono1")
	public String getTelefono1() {
		return this.telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	@Column(name = "telefono2")
	public String getTelefono2() {
		return this.telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	@Column(name = "tipo_sangre", nullable = false)
	public String getTipoSangre() {
		return this.tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
	public Set<EmpleadoSueldo> getEmpleadoSueldos() {
		return this.empleadoSueldos;
	}

	public void setEmpleadoSueldos(Set<EmpleadoSueldo> empleadoSueldos) {
		this.empleadoSueldos = empleadoSueldos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
	public Set<EmpleadoTipoNomina> getEmpleadoTipoNominas() {
		return this.empleadoTipoNominas;
	}

	public void setEmpleadoTipoNominas(
			Set<EmpleadoTipoNomina> empleadoTipoNominas) {
		this.empleadoTipoNominas = empleadoTipoNominas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
	public Set<EmpleadoConceptoNomina> getEmpleadoConceptoNominas() {
		return this.empleadoConceptoNominas;
	}

	public void setEmpleadoConceptoNominas(
			Set<EmpleadoConceptoNomina> empleadoConceptoNominas) {
		this.empleadoConceptoNominas = empleadoConceptoNominas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
	public Set<EmpleadoMantenimientoPlanificado> getEmpleadoMantenimientoPlanificados() {
		return this.empleadoMantenimientoPlanificados;
	}

	public void setEmpleadoMantenimientoPlanificados(
			Set<EmpleadoMantenimientoPlanificado> empleadoMantenimientoPlanificados) {
		this.empleadoMantenimientoPlanificados = empleadoMantenimientoPlanificados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
	public Set<DatoAcademicoEmpleado> getDatoAcademicoEmpleados() {
		return this.datoAcademicoEmpleados;
	}

	public void setDatoAcademicoEmpleados(
			Set<DatoAcademicoEmpleado> datoAcademicoEmpleados) {
		this.datoAcademicoEmpleados = datoAcademicoEmpleados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
	public Set<EmpleadoCargo> getEmpleadoCargos() {
		return this.empleadoCargos;
	}

	public void setEmpleadoCargos(Set<EmpleadoCargo> empleadoCargos) {
		this.empleadoCargos = empleadoCargos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
	public Set<EmpleadoMantenimiento> getEmpleadoMantenimientos() {
		return this.empleadoMantenimientos;
	}

	public void setEmpleadoMantenimientos(
			Set<EmpleadoMantenimiento> empleadoMantenimientos) {
		this.empleadoMantenimientos = empleadoMantenimientos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
	public Set<EmpleadoAlergia> getEmpleadoAlergias() {
		return this.empleadoAlergias;
	}

	public void setEmpleadoAlergias(Set<EmpleadoAlergia> empleadoAlergias) {
		this.empleadoAlergias = empleadoAlergias;
	}

}
