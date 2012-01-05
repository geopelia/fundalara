package modelo;

// Generated 28/12/2011 03:24:38 PM by Hibernate Tools 3.4.0.CR1

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
 * IngresoDocumentoAcreedor generated by hbm2java
 */
@Entity
@Table(name = "ingreso_documento_acreedor", schema = "public")
public class IngresoDocumentoAcreedor implements java.io.Serializable {

	private IngresoDocumentoAcreedorId id;
	private DocumentoAcreedor documentoAcreedor;
	private Ingreso ingreso;
	private double montoAbonado;
	private char estatus;

	public IngresoDocumentoAcreedor() {
	}

	public IngresoDocumentoAcreedor(IngresoDocumentoAcreedorId id,
			DocumentoAcreedor documentoAcreedor, Ingreso ingreso,
			double montoAbonado, char estatus) {
		this.id = id;
		this.documentoAcreedor = documentoAcreedor;
		this.ingreso = ingreso;
		this.montoAbonado = montoAbonado;
		this.estatus = estatus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "numeroDocumento", column = @Column(name = "numero_documento", nullable = false)),
			@AttributeOverride(name = "codigoDocumentoAcreedor", column = @Column(name = "codigo_documento_acreedor", nullable = false)) })
	public IngresoDocumentoAcreedorId getId() {
		return this.id;
	}

	public void setId(IngresoDocumentoAcreedorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_documento_acreedor", nullable = false, insertable = false, updatable = false)
	public DocumentoAcreedor getDocumentoAcreedor() {
		return this.documentoAcreedor;
	}

	public void setDocumentoAcreedor(DocumentoAcreedor documentoAcreedor) {
		this.documentoAcreedor = documentoAcreedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_documento", nullable = false, insertable = false, updatable = false)
	public Ingreso getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
	}

	@Column(name = "monto_abonado", nullable = false, precision = 17, scale = 17)
	public double getMontoAbonado() {
		return this.montoAbonado;
	}

	public void setMontoAbonado(double montoAbonado) {
		this.montoAbonado = montoAbonado;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
