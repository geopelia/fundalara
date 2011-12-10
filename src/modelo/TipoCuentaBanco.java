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
 * TipoCuentaBanco generated by hbm2java
 */
@Entity
@Table(name = "tipo_cuenta_banco")
public class TipoCuentaBanco implements java.io.Serializable {

	private String codigoCuentaBanco;
	private String descripcion;
	private char estatus;
	private Set<ProveedorBanco> proveedorBancos = new HashSet<ProveedorBanco>(0);

	public TipoCuentaBanco() {
	}

	public TipoCuentaBanco(String codigoCuentaBanco, String descripcion,
			char estatus) {
		this.codigoCuentaBanco = codigoCuentaBanco;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public TipoCuentaBanco(String codigoCuentaBanco, String descripcion,
			char estatus, Set<ProveedorBanco> proveedorBancos) {
		this.codigoCuentaBanco = codigoCuentaBanco;
		this.descripcion = descripcion;
		this.estatus = estatus;
		this.proveedorBancos = proveedorBancos;
	}

	@Id
	@Column(name = "codigo_cuenta_banco", unique = true, nullable = false)
	public String getCodigoCuentaBanco() {
		return this.codigoCuentaBanco;
	}

	public void setCodigoCuentaBanco(String codigoCuentaBanco) {
		this.codigoCuentaBanco = codigoCuentaBanco;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoCuentaBanco")
	public Set<ProveedorBanco> getProveedorBancos() {
		return this.proveedorBancos;
	}

	public void setProveedorBancos(Set<ProveedorBanco> proveedorBancos) {
		this.proveedorBancos = proveedorBancos;
	}

}
