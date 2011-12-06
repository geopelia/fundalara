package modelo;

// Generated 06-dic-2011 15:00:16 by Hibernate Tools 3.4.0.CR1

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
	private EstadoCompetencia estadoCompetencia;
	private TipoModalidadCompetencia tipoModalidadCompetencia;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private int cantidadEquipo;
	private int cantidadFase;
	private int cantidadJugador;
	private float montoInscripcion;
	private String condicionesGenerales;
	private String desempate;
	private String extrainning;
	private byte[] documento;
	private Set<FaseCompetencia> faseCompetencias = new HashSet<FaseCompetencia>(
			0);
	private Set<DatoDeportivo> datoDeportivos = new HashSet<DatoDeportivo>(0);
	private Set<CategoriaCompetencia> categoriaCompetencias = new HashSet<CategoriaCompetencia>(
			0);
	private Set<CategoriaCompetencia> categoriaCompetencias_1 = new HashSet<CategoriaCompetencia>(
			0);
	private Set<DatoDeportivo> datoDeportivos_1 = new HashSet<DatoDeportivo>(0);
	private Set<FaseCompetencia> faseCompetencias_1 = new HashSet<FaseCompetencia>(
			0);

	public Competencia() {
	}

	public Competencia(String codigoCompetencia,
			EstadoCompetencia estadoCompetencia,
			TipoModalidadCompetencia tipoModalidadCompetencia, String nombre,
			Date fechaInicio, Date fechaFin, int cantidadEquipo,
			int cantidadFase, int cantidadJugador, float montoInscripcion,
			String condicionesGenerales, String desempate, String extrainning,
			byte[] documento) {
		this.codigoCompetencia = codigoCompetencia;
		this.estadoCompetencia = estadoCompetencia;
		this.tipoModalidadCompetencia = tipoModalidadCompetencia;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadEquipo = cantidadEquipo;
		this.cantidadFase = cantidadFase;
		this.cantidadJugador = cantidadJugador;
		this.montoInscripcion = montoInscripcion;
		this.condicionesGenerales = condicionesGenerales;
		this.desempate = desempate;
		this.extrainning = extrainning;
		this.documento = documento;
	}

	public Competencia(String codigoCompetencia,
			EstadoCompetencia estadoCompetencia,
			TipoModalidadCompetencia tipoModalidadCompetencia, String nombre,
			Date fechaInicio, Date fechaFin, int cantidadEquipo,
			int cantidadFase, int cantidadJugador, float montoInscripcion,
			String condicionesGenerales, String desempate, String extrainning,
			byte[] documento, Set<FaseCompetencia> faseCompetencias,
			Set<DatoDeportivo> datoDeportivos,
			Set<CategoriaCompetencia> categoriaCompetencias,
			Set<CategoriaCompetencia> categoriaCompetencias_1,
			Set<DatoDeportivo> datoDeportivos_1,
			Set<FaseCompetencia> faseCompetencias_1) {
		this.codigoCompetencia = codigoCompetencia;
		this.estadoCompetencia = estadoCompetencia;
		this.tipoModalidadCompetencia = tipoModalidadCompetencia;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadEquipo = cantidadEquipo;
		this.cantidadFase = cantidadFase;
		this.cantidadJugador = cantidadJugador;
		this.montoInscripcion = montoInscripcion;
		this.condicionesGenerales = condicionesGenerales;
		this.desempate = desempate;
		this.extrainning = extrainning;
		this.documento = documento;
		this.faseCompetencias = faseCompetencias;
		this.datoDeportivos = datoDeportivos;
		this.categoriaCompetencias = categoriaCompetencias;
		this.categoriaCompetencias_1 = categoriaCompetencias_1;
		this.datoDeportivos_1 = datoDeportivos_1;
		this.faseCompetencias_1 = faseCompetencias_1;
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
	@JoinColumn(name = "estado_competencia_codigo_estado_competencia_seq1", nullable = false)
	public EstadoCompetencia getEstadoCompetencia() {
		return this.estadoCompetencia;
	}

	public void setEstadoCompetencia(EstadoCompetencia estadoCompetencia) {
		this.estadoCompetencia = estadoCompetencia;
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

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio", nullable = false, length = 13)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin", nullable = false, length = 13)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
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

	@Column(name = "monto_inscripcion", nullable = false, precision = 8, scale = 8)
	public float getMontoInscripcion() {
		return this.montoInscripcion;
	}

	public void setMontoInscripcion(float montoInscripcion) {
		this.montoInscripcion = montoInscripcion;
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

	@Column(name = "extrainning", nullable = false)
	public String getExtrainning() {
		return this.extrainning;
	}

	public void setExtrainning(String extrainning) {
		this.extrainning = extrainning;
	}

	@Column(name = "documento", nullable = false)
	public byte[] getDocumento() {
		return this.documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competencia")
	public Set<FaseCompetencia> getFaseCompetencias() {
		return this.faseCompetencias;
	}

	public void setFaseCompetencias(Set<FaseCompetencia> faseCompetencias) {
		this.faseCompetencias = faseCompetencias;
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
	public Set<CategoriaCompetencia> getCategoriaCompetencias_1() {
		return this.categoriaCompetencias_1;
	}

	public void setCategoriaCompetencias_1(
			Set<CategoriaCompetencia> categoriaCompetencias_1) {
		this.categoriaCompetencias_1 = categoriaCompetencias_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competencia")
	public Set<DatoDeportivo> getDatoDeportivos_1() {
		return this.datoDeportivos_1;
	}

	public void setDatoDeportivos_1(Set<DatoDeportivo> datoDeportivos_1) {
		this.datoDeportivos_1 = datoDeportivos_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competencia")
	public Set<FaseCompetencia> getFaseCompetencias_1() {
		return this.faseCompetencias_1;
	}

	public void setFaseCompetencias_1(Set<FaseCompetencia> faseCompetencias_1) {
		this.faseCompetencias_1 = faseCompetencias_1;
	}

}
