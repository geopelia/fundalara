package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ValorEscalaMedicion generated by hbm2java
 */
@Entity
@Table(name = "valor_escala_medicion")
public class ValorEscalaMedicion implements java.io.Serializable {

	private String codValor;
	private EscalaMedicion escalaMedicion;
	private String valor;
	private String descripcion;

	public ValorEscalaMedicion() {
	}

	public ValorEscalaMedicion(String codValor, EscalaMedicion escalaMedicion,
			String valor, String descripcion) {
		this.codValor = codValor;
		this.escalaMedicion = escalaMedicion;
		this.valor = valor;
		this.descripcion = descripcion;
	}

	@Id
	@Column(name = "cod_valor", unique = true, nullable = false)
	public String getCodValor() {
		return this.codValor;
	}

	public void setCodValor(String codValor) {
		this.codValor = codValor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cod_escala_medicion", nullable = false)
	public EscalaMedicion getEscalaMedicion() {
		return this.escalaMedicion;
	}

	public void setEscalaMedicion(EscalaMedicion escalaMedicion) {
		this.escalaMedicion = escalaMedicion;
	}

	@Column(name = "valor", nullable = false)
	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
