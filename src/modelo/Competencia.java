package modelo;

// Generated 10/12/2011 11:05:49 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Competencia generated by hbm2java
 */
@Entity
@Table(name = "competencia")
public class Competencia implements java.io.Serializable {

	private String codigoCompetencia;
	private TipoModalidadCompetencia tipoModalidadCompetencia;
	private EstadoCompetencia estadoCompetencia;
	private int cantidadEquipo;
	private int cantidadFase;
	private int cantidadJugador;
	private String condicionesGenerales;
	private String desempate;
	private byte[] documento;
	private String extrainning;
	private Date fechaFin;
	private Date fechaInicio;
	private float montoInscripcion;
	private String nombre;
	private Set<DatoDeportivo> datoDeportivos = new HashSet<DatoDeportivo>(0);
	private Set<CategoriaCompetencia> categoriaCompetencias = new HashSet<CategoriaCompetencia>(
			0);
	private Set<FaseCompetencia> faseCompetencias = new HashSet<FaseCompetencia>(
			0);

	public Competencia() {
	}

	public Competencia(String codigoCompetencia,
			TipoModalidadCompetencia tipoModalidadCompetencia,
			int cantidadEquipo, int cantidadFase, int cantidadJugador,
			String condicionesGenerales, String desempate, byte[] documento,
			String extrainning, Date fechaFin, Date fechaInicio,
			float montoInscripcion, String nombre) {
		this.codigoCompetencia = codigoCompetencia;
		this.tipoModalidadCompetencia = tipoModalidadCompetencia;
		this.cantidadEquipo = cantidadEquipo;
		this.cantidadFase = cantidadFase;
		this.cantidadJugador = cantidadJugador;
		this.condicionesGenerales = condicionesGenerales;
		this.desempate = desempate;
		this.documento = documento;
		this.extrainning = extrainning;
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.montoInscripcion = montoInscripcion;
		this.nombre = nombre;
	}

	public Competencia(String codigoCompetencia,
			TipoModalidadCompetencia tipoModalidadCompetencia,
			EstadoCompetencia estadoCompetencia, int cantidadEquipo,
			int cantidadFase, int cantidadJugador, String condicionesGenerales,
			String desempate, byte[] documento, String extrainning,
			Date fechaFin, Date fechaInicio, float montoInscripcion,
			String nombre, Set<DatoDeportivo> datoDeportivos,
			Set<CategoriaCompetencia> categoriaCompetencias,
			Set<FaseCompetencia> faseCompetencias) {
		this.codigoCompetencia = codigoCompetencia;
		this.tipoModalidadCompetencia = tipoModalidadCompetencia;
		this.estadoCompetencia = estadoCompetencia;
		this.cantidadEquipo = cantidadEquipo;
		this.cantidadFase = cantidadFase;
		this.cantidadJugador = cantidadJugador;
		this.condicionesGenerales = condicionesGenerales;
		this.desempate = desempate;
		this.documento = documento;
		this.extrainning = extrainning;
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.montoInscripcion = montoInscripcion;
		this.nombre = nombre;
		this.datoDeportivos = datoDeportivos;
		this.categoriaCompetencias = categoriaCompetencias;
		this.faseCompetencias = faseCompetencias;
	}

	@Id
	@Column(name = "codigo_competencia", unique = true, nullable = false)
	public String getCodigoCompetencia() {
		return this.codigoCompetencia;
	}

	public void setCodigoCompetencia(String codigoCompetencia) {
		this.codigoCompetencia = codigoCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_modalidad_competencia", nullable = false)
	public TipoModalidadCompetencia getTipoModalidadCompetencia() {
		return this.tipoModalidadCompetencia;
	}

	public void setTipoModalidadCompetencia(
			TipoModalidadCompetencia tipoModalidadCompetencia) {
		this.tipoModalidadCompetencia = tipoModalidadCompetencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_estado_competencia")
	public EstadoCompetencia getEstadoCompetencia() {
		return this.estadoCompetencia;
	}

	public void setEstadoCompetencia(EstadoCompetencia estadoCompetencia) {
		this.estadoCompetencia = estadoCompetencia;
	}

	@Column(name = "cantidad_equipo", nullable = false)
	public int getCantidadEquipo() {
		return this.cantidadEquipo;
	}

	public void setCantidadEquipo(int cantidadEquipo) {
		this.cantidadEquipo = cantidadEquipo;
	}

	@Column(name = "cantidad_fase", nullable = false)
	public int getCantidadFase() {
		return this.cantidadFase;
	}

	public void setCantidadFase(int cantidadFase) {
		this.cantidadFase = cantidadFase;
	}

	@Column(name = "cantidad_jugador", nullable = false)
	public int getCantidadJugador() {
		return this.cantidadJugador;
	}

	public void setCantidadJugador(int cantidadJugador) {
		this.cantidadJugador = cantidadJugador;
	}

	@Column(name = "condiciones_generales", nullable = false)
	public String getCondicionesGenerales() {
		return this.condicionesGenerales;
	}

	public void setCondicionesGenerales(String condicionesGenerales) {
		this.condicionesGenerales = condicionesGenerales;
	}

	@Column(name = "desempate", nullable = false)
	public String getDesempate() {
		return this.desempate;
	}

	public void setDesempate(String desempate) {
		this.desempate = desempate;
	}

	@Column(name = "documento", nullable = false)
	public byte[] getDocumento() {
		return this.documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	@Column(name = "extrainning", nullable = false)
	public String getExtrainning() {
		return this.extrainning;
	}

	public void setExtrainning(String extrainning) {
		this.extrainning = extrainning;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin", nullable = false, length = 13)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio", nullable = false, length = 13)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name = "monto_inscripcion", nullable = false, precision = 8, scale = 8)
	public float getMontoInscripcion() {
		return this.montoInscripcion;
	}

	public void setMontoInscripcion(float montoInscripcion) {
		this.montoInscripcion = montoInscripcion;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competencia")
	public Set<DatoDeportivo> getDatoDeportivos() {
		return this.datoDeportivos;
	}

	public void setDatoDeportivos(Set<DatoDeportivo> datoDeportivos) {
		this.datoDeportivos = datoDeportivos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competencia")
	public Set<CategoriaCompetencia> getCategoriaCompetencias() {
		return this.categoriaCompetencias;
	}

	public void setCategoriaCompetencias(
			Set<CategoriaCompetencia> categoriaCompetencias) {
		this.categoriaCompetencias = categoriaCompetencias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competencia")
	public Set<FaseCompetencia> getFaseCompetencias() {
		return this.faseCompetencias;
	}

	public void setFaseCompetencias(Set<FaseCompetencia> faseCompetencias) {
		this.faseCompetencias = faseCompetencias;
	}

}
