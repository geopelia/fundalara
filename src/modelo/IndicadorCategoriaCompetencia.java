package modelo;

// Generated 09/01/2012 10:28:45 AM by Hibernate Tools 3.4.0.CR1

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
 * IndicadorCategoriaCompetencia generated by hbm2java
 */
@Entity
@Table(name = "indicador_categoria_competencia", schema = "public")
public class IndicadorCategoriaCompetencia implements java.io.Serializable {

	private int codigoIndicadorCompetencia;
	private Categoria categoria;
	private Competencia competencia;
	private Indicador indicador;
	private Set<DesempennoIndividual> desempennoIndividuals = new HashSet<DesempennoIndividual>(
			0);
	private Set<DesempennoColectivo> desempennoColectivos = new HashSet<DesempennoColectivo>(
			0);

	public IndicadorCategoriaCompetencia() {
	}

	public IndicadorCategoriaCompetencia(int codigoIndicadorCompetencia,
			Categoria categoria, Competencia competencia, Indicador indicador) {
		this.codigoIndicadorCompetencia = codigoIndicadorCompetencia;
		this.categoria = categoria;
		this.competencia = competencia;
		this.indicador = indicador;
	}

	public IndicadorCategoriaCompetencia(int codigoIndicadorCompetencia,
			Categoria categoria, Competencia competencia, Indicador indicador,
			Set<DesempennoIndividual> desempennoIndividuals,
			Set<DesempennoColectivo> desempennoColectivos) {
		this.codigoIndicadorCompetencia = codigoIndicadorCompetencia;
		this.categoria = categoria;
		this.competencia = competencia;
		this.indicador = indicador;
		this.desempennoIndividuals = desempennoIndividuals;
		this.desempennoColectivos = desempennoColectivos;
	}

	@Id
	@Column(name = "codigo_indicador_competencia", unique = true, nullable = false)
	public int getCodigoIndicadorCompetencia() {
		return this.codigoIndicadorCompetencia;
	}

	public void setCodigoIndicadorCompetencia(int codigoIndicadorCompetencia) {
		this.codigoIndicadorCompetencia = codigoIndicadorCompetencia;
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
	@JoinColumn(name = "codigo_competencia", nullable = false)
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_indicador", nullable = false)
	public Indicador getIndicador() {
		return this.indicador;
	}

	public void setIndicador(Indicador indicador) {
		this.indicador = indicador;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "indicadorCategoriaCompetencia")
	public Set<DesempennoIndividual> getDesempennoIndividuals() {
		return this.desempennoIndividuals;
	}

	public void setDesempennoIndividuals(
			Set<DesempennoIndividual> desempennoIndividuals) {
		this.desempennoIndividuals = desempennoIndividuals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "indicadorCategoriaCompetencia")
	public Set<DesempennoColectivo> getDesempennoColectivos() {
		return this.desempennoColectivos;
	}

	public void setDesempennoColectivos(
			Set<DesempennoColectivo> desempennoColectivos) {
		this.desempennoColectivos = desempennoColectivos;
	}

}
