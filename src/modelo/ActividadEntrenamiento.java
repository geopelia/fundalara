package modelo;

// Generated 11/12/2011 04:17:03 PM by Hibernate Tools 3.4.0.CR1

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

/**
 * ActividadEntrenamiento generated by hbm2java
 */
@Entity
@Table(name = "actividad_entrenamiento")
public class ActividadEntrenamiento implements java.io.Serializable {

	private String codActividadEntrenamiento;
	private Categoria categoria;
	private Fase fase;
	private String descripcion;
	private char estatus;
	private String nombre;
	private Set<IndicadorActividadEscala> indicadorActividadEscalas = new HashSet<IndicadorActividadEscala>(
			0);

	public ActividadEntrenamiento() {
	}

	public ActividadEntrenamiento(String codActividadEntrenamiento,
			Categoria categoria, Fase fase, String descripcion, char estatus,
			String nombre) {
		this.codActividadEntrenamiento = codActividadEntrenamiento;
		this.categoria = categoria;
		this.fase = fase;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.nombre = nombre;
	}

	public ActividadEntrenamiento(String codActividadEntrenamiento,
			Categoria categoria, Fase fase, String descripcion, char estatus,
			String nombre,
			Set<IndicadorActividadEscala> indicadorActividadEscalas) {
		this.codActividadEntrenamiento = codActividadEntrenamiento;
		this.categoria = categoria;
		this.fase = fase;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.nombre = nombre;
		this.indicadorActividadEscalas = indicadorActividadEscalas;
	}

	@Id
	@Column(name = "cod_actividad_entrenamiento", unique = true, nullable = false)
	public String getCodActividadEntrenamiento() {
		return this.codActividadEntrenamiento;
	}

	public void setCodActividadEntrenamiento(String codActividadEntrenamiento) {
		this.codActividadEntrenamiento = codActividadEntrenamiento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_categoria", nullable = false)
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cod_fase_entrenamiento", nullable = false)
	public Fase getFase() {
		return this.fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
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

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actividadEntrenamiento")
	public Set<IndicadorActividadEscala> getIndicadorActividadEscalas() {
		return this.indicadorActividadEscalas;
	}

	public void setIndicadorActividadEscalas(
			Set<IndicadorActividadEscala> indicadorActividadEscalas) {
		this.indicadorActividadEscalas = indicadorActividadEscalas;
	}

}