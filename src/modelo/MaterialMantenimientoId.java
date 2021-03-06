package modelo;

// Generated 18/12/2011 11:15:50 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MaterialMantenimientoId generated by hbm2java
 */
@Embeddable
public class MaterialMantenimientoId implements java.io.Serializable {

	private String codigoMantenimiento;
	private String codigoMaterial;

	public MaterialMantenimientoId() {
	}

	public MaterialMantenimientoId(String codigoMantenimiento,
			String codigoMaterial) {
		this.codigoMantenimiento = codigoMantenimiento;
		this.codigoMaterial = codigoMaterial;
	}

	@Column(name = "codigo_mantenimiento", nullable = false)
	public String getCodigoMantenimiento() {
		return this.codigoMantenimiento;
	}

	public void setCodigoMantenimiento(String codigoMantenimiento) {
		this.codigoMantenimiento = codigoMantenimiento;
	}

	@Column(name = "codigo_material", nullable = false)
	public String getCodigoMaterial() {
		return this.codigoMaterial;
	}

	public void setCodigoMaterial(String codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MaterialMantenimientoId))
			return false;
		MaterialMantenimientoId castOther = (MaterialMantenimientoId) other;

		return ((this.getCodigoMantenimiento() == castOther
				.getCodigoMantenimiento()) || (this.getCodigoMantenimiento() != null
				&& castOther.getCodigoMantenimiento() != null && this
				.getCodigoMantenimiento().equals(
						castOther.getCodigoMantenimiento())))
				&& ((this.getCodigoMaterial() == castOther.getCodigoMaterial()) || (this
						.getCodigoMaterial() != null
						&& castOther.getCodigoMaterial() != null && this
						.getCodigoMaterial().equals(
								castOther.getCodigoMaterial())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoMantenimiento() == null ? 0 : this
						.getCodigoMantenimiento().hashCode());
		result = 37
				* result
				+ (getCodigoMaterial() == null ? 0 : this.getCodigoMaterial()
						.hashCode());
		return result;
	}

}
