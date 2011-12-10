package modelo;

// Generated 10/12/2011 11:05:49 AM by Hibernate Tools 3.4.0.CR1

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
 * Material generated by hbm2java
 */
@Entity
@Table(name = "material")
public class Material implements java.io.Serializable {

	private String codigoMaterial;
	private UnidadMedida unidadMedida;
	private TipoMaterial tipoMaterial;
	private int cantidadDisponible;
	private int cantidadExistencia;
	private int cantidadPresentacion;
	private String descripcion;
	private char estadoMaterial;
	private char estatus;
	private boolean reutilizable;
	private int stockMaximo;
	private int stockMinimo;
	private Set<MaterialMantenimientoPlanificado> materialMantenimientoPlanificados = new HashSet<MaterialMantenimientoPlanificado>(
			0);
	private Set<MaterialMantenimiento> materialMantenimientos = new HashSet<MaterialMantenimiento>(
			0);

	public Material() {
	}

	public Material(String codigoMaterial, UnidadMedida unidadMedida,
			TipoMaterial tipoMaterial, int cantidadDisponible,
			int cantidadExistencia, int cantidadPresentacion,
			String descripcion, char estadoMaterial, char estatus,
			boolean reutilizable, int stockMaximo, int stockMinimo) {
		this.codigoMaterial = codigoMaterial;
		this.unidadMedida = unidadMedida;
		this.tipoMaterial = tipoMaterial;
		this.cantidadDisponible = cantidadDisponible;
		this.cantidadExistencia = cantidadExistencia;
		this.cantidadPresentacion = cantidadPresentacion;
		this.descripcion = descripcion;
		this.estadoMaterial = estadoMaterial;
		this.estatus = estatus;
		this.reutilizable = reutilizable;
		this.stockMaximo = stockMaximo;
		this.stockMinimo = stockMinimo;
	}

	public Material(
			String codigoMaterial,
			UnidadMedida unidadMedida,
			TipoMaterial tipoMaterial,
			int cantidadDisponible,
			int cantidadExistencia,
			int cantidadPresentacion,
			String descripcion,
			char estadoMaterial,
			char estatus,
			boolean reutilizable,
			int stockMaximo,
			int stockMinimo,
			Set<MaterialMantenimientoPlanificado> materialMantenimientoPlanificados,
			Set<MaterialMantenimiento> materialMantenimientos) {
		this.codigoMaterial = codigoMaterial;
		this.unidadMedida = unidadMedida;
		this.tipoMaterial = tipoMaterial;
		this.cantidadDisponible = cantidadDisponible;
		this.cantidadExistencia = cantidadExistencia;
		this.cantidadPresentacion = cantidadPresentacion;
		this.descripcion = descripcion;
		this.estadoMaterial = estadoMaterial;
		this.estatus = estatus;
		this.reutilizable = reutilizable;
		this.stockMaximo = stockMaximo;
		this.stockMinimo = stockMinimo;
		this.materialMantenimientoPlanificados = materialMantenimientoPlanificados;
		this.materialMantenimientos = materialMantenimientos;
	}

	@Id
	@Column(name = "codigo_material", unique = true, nullable = false)
	public String getCodigoMaterial() {
		return this.codigoMaterial;
	}

	public void setCodigoMaterial(String codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_unidad_medida", nullable = false)
	public UnidadMedida getUnidadMedida() {
		return this.unidadMedida;
	}

	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_material", nullable = false)
	public TipoMaterial getTipoMaterial() {
		return this.tipoMaterial;
	}

	public void setTipoMaterial(TipoMaterial tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	@Column(name = "cantidad_disponible", nullable = false)
	public int getCantidadDisponible() {
		return this.cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	@Column(name = "cantidad_existencia", nullable = false)
	public int getCantidadExistencia() {
		return this.cantidadExistencia;
	}

	public void setCantidadExistencia(int cantidadExistencia) {
		this.cantidadExistencia = cantidadExistencia;
	}

	@Column(name = "cantidad_presentacion", nullable = false)
	public int getCantidadPresentacion() {
		return this.cantidadPresentacion;
	}

	public void setCantidadPresentacion(int cantidadPresentacion) {
		this.cantidadPresentacion = cantidadPresentacion;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estado_material", nullable = false, length = 1)
	public char getEstadoMaterial() {
		return this.estadoMaterial;
	}

	public void setEstadoMaterial(char estadoMaterial) {
		this.estadoMaterial = estadoMaterial;
	}

	@Column(name = "estatus", nullable = false, length = 1)
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	@Column(name = "reutilizable", nullable = false)
	public boolean isReutilizable() {
		return this.reutilizable;
	}

	public void setReutilizable(boolean reutilizable) {
		this.reutilizable = reutilizable;
	}

	@Column(name = "stock_maximo", nullable = false)
	public int getStockMaximo() {
		return this.stockMaximo;
	}

	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	@Column(name = "stock_minimo", nullable = false)
	public int getStockMinimo() {
		return this.stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<MaterialMantenimientoPlanificado> getMaterialMantenimientoPlanificados() {
		return this.materialMantenimientoPlanificados;
	}

	public void setMaterialMantenimientoPlanificados(
			Set<MaterialMantenimientoPlanificado> materialMantenimientoPlanificados) {
		this.materialMantenimientoPlanificados = materialMantenimientoPlanificados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<MaterialMantenimiento> getMaterialMantenimientos() {
		return this.materialMantenimientos;
	}

	public void setMaterialMantenimientos(
			Set<MaterialMantenimiento> materialMantenimientos) {
		this.materialMantenimientos = materialMantenimientos;
	}

}
