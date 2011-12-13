package modelo;

// Generated 12/12/2011 09:17:13 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TareaMantenimientoPlanificadoId generated by hbm2java
 */
@Embeddable
public class TareaMantenimientoPlanificadoId implements java.io.Serializable {

	private String codigoPlanificacionMantenimiento;
	private String codigoTarea;

	public TareaMantenimientoPlanificadoId() {
	}

	public TareaMantenimientoPlanificadoId(
			String codigoPlanificacionMantenimiento, String codigoTarea) {
		this.codigoPlanificacionMantenimiento = codigoPlanificacionMantenimiento;
		this.codigoTarea = codigoTarea;
	}

	@Column(name = "codigo_planificacion_mantenimiento", nullable = false)
	public String getCodigoPlanificacionMantenimiento() {
		return this.codigoPlanificacionMantenimiento;
	}

	public void setCodigoPlanificacionMantenimiento(
			String codigoPlanificacionMantenimiento) {
		this.codigoPlanificacionMantenimiento = codigoPlanificacionMantenimiento;
	}

	@Column(name = "codigo_tarea", nullable = false)
	public String getCodigoTarea() {
		return this.codigoTarea;
	}

	public void setCodigoTarea(String codigoTarea) {
		this.codigoTarea = codigoTarea;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TareaMantenimientoPlanificadoId))
			return false;
		TareaMantenimientoPlanificadoId castOther = (TareaMantenimientoPlanificadoId) other;

		return ((this.getCodigoPlanificacionMantenimiento() == castOther
				.getCodigoPlanificacionMantenimiento()) || (this
				.getCodigoPlanificacionMantenimiento() != null
				&& castOther.getCodigoPlanificacionMantenimiento() != null && this
				.getCodigoPlanificacionMantenimiento().equals(
						castOther.getCodigoPlanificacionMantenimiento())))
				&& ((this.getCodigoTarea() == castOther.getCodigoTarea()) || (this
						.getCodigoTarea() != null
						&& castOther.getCodigoTarea() != null && this
						.getCodigoTarea().equals(castOther.getCodigoTarea())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodigoPlanificacionMantenimiento() == null ? 0 : this
						.getCodigoPlanificacionMantenimiento().hashCode());
		result = 37
				* result
				+ (getCodigoTarea() == null ? 0 : this.getCodigoTarea()
						.hashCode());
		return result;
	}

}
