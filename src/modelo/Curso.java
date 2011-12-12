package modelo;

// Generated 11/12/2011 04:17:03 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name = "curso")
public class Curso implements java.io.Serializable {

	private String codigoCurso;
	private char estatus;
	private String nombre;
	private Set<DatoAcademico> datoAcademicos = new HashSet<DatoAcademico>(0);

	public Curso() {
	}

	public Curso(String codigoCurso, char estatus, String nombre) {
		this.codigoCurso = codigoCurso;
		this.estatus = estatus;
		this.nombre = nombre;
	}

	public Curso(String codigoCurso, char estatus, String nombre,
			Set<DatoAcademico> datoAcademicos) {
		this.codigoCurso = codigoCurso;
		this.estatus = estatus;
		this.nombre = nombre;
		this.datoAcademicos = datoAcademicos;
	}

	@Id
	@Column(name = "codigo_curso", unique = true, nullable = false)
	public String getCodigoCurso() {
		return this.codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
	public Set<DatoAcademico> getDatoAcademicos() {
		return this.datoAcademicos;
	}

	public void setDatoAcademicos(Set<DatoAcademico> datoAcademicos) {
		this.datoAcademicos = datoAcademicos;
	}

}