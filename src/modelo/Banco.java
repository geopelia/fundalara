package modelo;

// Generated 10/12/2011 12:12:20 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Banco generated by hbm2java
 */
@Entity
@Table(name = "banco")
public class Banco implements java.io.Serializable {

	private String codigoBanco;
	private String descripcion;
	private char estatus;
	private Set<ProveedorBanco> proveedorBancos = new HashSet<ProveedorBanco>(0);

	public Banco() {
	}

	public Banco(String codigoBanco, String descripcion, char estatus) {
		this.codigoBanco = codigoBanco;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public Banco(String codigoBanco, String descripcion, char estatus,
			Set<ProveedorBanco> proveedorBancos) {
		this.codigoBanco = codigoBanco;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.proveedorBancos = proveedorBancos;
	}

	@Id
	@Column(name = "codigo_banco", unique = true, nullable = false)
	public String getCodigoBanco() {
		return this.codigoBanco;
	}

	public void setCodigoBanco(String codigoBanco) {
		this.codigoBanco = codigoBanco;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "banco")
	public Set<ProveedorBanco> getProveedorBancos() {
		return this.proveedorBancos;
	}

	public void setProveedorBancos(Set<ProveedorBanco> proveedorBancos) {
		this.proveedorBancos = proveedorBancos;
	}

}
