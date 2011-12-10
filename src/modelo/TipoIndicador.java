package modelo;

// Generated 10/12/2011 11:05:49 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoIndicador generated by hbm2java
 */
@Entity
@Table(name = "tipo_indicador")
public class TipoIndicador implements java.io.Serializable {

	private String codTipoIndicador;
	private char estatus;
	private String nombre;
	private Set<Indicador> indicadors = new HashSet<Indicador>(0);

	public TipoIndicador() {
	}

	public TipoIndicador(String codTipoIndicador, char estatus, String nombre) {
		this.codTipoIndicador = codTipoIndicador;
		this.estatus = estatus;
		this.nombre = nombre;
	}

	public TipoIndicador(String codTipoIndicador, char estatus, String nombre,
			Set<Indicador> indicadors) {
		this.codTipoIndicador = codTipoIndicador;
		this.estatus = estatus;
		this.nombre = nombre;
		this.indicadors = indicadors;
	}

	@Id
	@Column(name = "cod_tipo_indicador", unique = true, nullable = false)
	public String getCodTipoIndicador() {
		return this.codTipoIndicador;
	}

	public void setCodTipoIndicador(String codTipoIndicador) {
		this.codTipoIndicador = codTipoIndicador;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoIndicador")
	public Set<Indicador> getIndicadors() {
		return this.indicadors;
	}

	public void setIndicadors(Set<Indicador> indicadors) {
		this.indicadors = indicadors;
	}

}
