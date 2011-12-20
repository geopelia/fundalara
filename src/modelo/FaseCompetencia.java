package modelo;

// Generated 20-dic-2011 13:32:22 by Hibernate Tools 3.4.0.CR1

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
@Table(name = "fase_competencia", schema = "public")
public class FaseCompetencia implements java.io.Serializable {

	private FaseCompetenciaId id;
	private Competencia competencia;
	private int equipoIngresan;
	private int equipoClasifican;
	private char estatus;

	public FaseCompetencia() {
	}

	public FaseCompetencia(FaseCompetenciaId id, Competencia competencia,
			int equipoIngresan, int equipoClasifican, char estatus) {
		this.id = id;
		this.competencia = competencia;
		this.equipoIngresan = equipoIngresan;
		this.equipoClasifican = equipoClasifican;
		this.estatus = estatus;
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

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
