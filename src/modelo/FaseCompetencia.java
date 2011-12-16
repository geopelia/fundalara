package modelo;

// Generated 16/12/2011 03:51:27 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * FaseCompetencia generated by hbm2java
 */
@Entity
@Table(name = "fase_competencia")
public class FaseCompetencia implements java.io.Serializable {

	private FaseCompetenciaId id;
	private Competencia competencia;
	private int equipoIngresan;
	private int equipoClasifican;

	public FaseCompetencia() {
	}

	public FaseCompetencia(FaseCompetenciaId id, Competencia competencia,
			int equipoIngresan, int equipoClasifican) {
		this.id = id;
		this.competencia = competencia;
		this.equipoIngresan = equipoIngresan;
		this.equipoClasifican = equipoClasifican;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoCompetencia", column = @Column(name = "codigo_competencia", nullable = false)),
			@AttributeOverride(name = "numeroFase", column = @Column(name = "numero_fase", nullable = false)) })
	public FaseCompetenciaId getId() {
		return this.id;
	}

	public void setId(FaseCompetenciaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_competencia", nullable = false, insertable = false, updatable = false)
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	@Column(name = "equipo_ingresan", nullable = false)
	public int getEquipoIngresan() {
		return this.equipoIngresan;
	}

	public void setEquipoIngresan(int equipoIngresan) {
		this.equipoIngresan = equipoIngresan;
	}

	@Column(name = "equipo_clasifican", nullable = false)
	public int getEquipoClasifican() {
		return this.equipoClasifican;
	}

	public void setEquipoClasifican(int equipoClasifican) {
		this.equipoClasifican = equipoClasifican;
	}

}
