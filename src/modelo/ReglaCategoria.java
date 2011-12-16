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
 * ReglaCategoria generated by hbm2java
 */
@Entity
@Table(name = "regla_categoria")
public class ReglaCategoria implements java.io.Serializable {

	private ReglaCategoriaId id;
	private Categoria categoria;
	private Regla regla;
	private float valor;

	public ReglaCategoria() {
	}

	public ReglaCategoria(ReglaCategoriaId id, Categoria categoria,
			Regla regla, float valor) {
		this.id = id;
		this.categoria = categoria;
		this.regla = regla;
		this.valor = valor;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoRegla", column = @Column(name = "codigo_regla", nullable = false)),
			@AttributeOverride(name = "codigoCategoria", column = @Column(name = "codigo_categoria", nullable = false)) })
	public ReglaCategoriaId getId() {
		return this.id;
	}

	public void setId(ReglaCategoriaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_categoria", nullable = false, insertable = false, updatable = false)
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_regla", nullable = false, insertable = false, updatable = false)
	public Regla getRegla() {
		return this.regla;
	}

	public void setRegla(Regla regla) {
		this.regla = regla;
	}

	@Column(name = "valor", nullable = false, precision = 8, scale = 8)
	public float getValor() {
		return this.valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
