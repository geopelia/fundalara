package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tarea generated by hbm2java
 */
@Entity
@Table(name = "tarea")
public class Tarea implements java.io.Serializable {

	private String codigoTarea;
	private String nombre;
	private String descripcion;
	private char estatus;
	private Set<TareaMantenimientoPlanificado> tareaMantenimientoPlanificados = new HashSet<TareaMantenimientoPlanificado>(
			0);
	private Set<TareaMantenimiento> tareaMantenimientos = new HashSet<TareaMantenimiento>(
			0);

	public Tarea() {
	}

	public Tarea(String codigoTarea, String nombre, String descripcion,
			char estatus) {
		this.codigoTarea = codigoTarea;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public Tarea(String codigoTarea, String nombre, String descripcion,
			char estatus,
			Set<TareaMantenimientoPlanificado> tareaMantenimientoPlanificados,
			Set<TareaMantenimiento> tareaMantenimientos) {
		this.codigoTarea = codigoTarea;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.tareaMantenimientoPlanificados = tareaMantenimientoPlanificados;
		this.tareaMantenimientos = tareaMantenimientos;
	}

	@Id
	@Column(name = "codigo_tarea", unique = true, nullable = false)
	public String getCodigoTarea() {
		return this.codigoTarea;
	}

	public void setCodigoTarea(String codigoTarea) {
		this.codigoTarea = codigoTarea;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tarea")
	public Set<TareaMantenimientoPlanificado> getTareaMantenimientoPlanificados() {
		return this.tareaMantenimientoPlanificados;
	}

	public void setTareaMantenimientoPlanificados(
			Set<TareaMantenimientoPlanificado> tareaMantenimientoPlanificados) {
		this.tareaMantenimientoPlanificados = tareaMantenimientoPlanificados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tarea")
	public Set<TareaMantenimiento> getTareaMantenimientos() {
		return this.tareaMantenimientos;
	}

	public void setTareaMantenimientos(
			Set<TareaMantenimiento> tareaMantenimientos) {
		this.tareaMantenimientos = tareaMantenimientos;
	}

}
