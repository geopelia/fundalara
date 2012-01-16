package servicio.interfaz;


import java.text.ParseException;
import java.util.List;

import modelo.AfeccionPersonal;
import modelo.ConceptoNomina;
import modelo.CuentaPagar;
import modelo.DatoBasico;
import modelo.Persona;

public interface IServicioCuentaPagar {
	
	public abstract void eliminar(CuentaPagar c);
	
	public abstract void agregar(CuentaPagar  c);
		
	public abstract void actualizar(CuentaPagar  c);	
	
	public abstract  List<CuentaPagar> listar ();
	
	public abstract List<CuentaPagar> listarActivos();
		
	public abstract List<CuentaPagar> listarCuentaPorPagar(DatoBasico dato);
	
	public abstract CuentaPagar buscarPorCodigo (CuentaPagar d);
	
	public abstract CuentaPagar buscarByCedulaRif(String d);
	
	public abstract CuentaPagar buscarOrigen(String d);

	public abstract List<CuentaPagar> listarCuentaPorPagarPorFecha(DatoBasico dato,
			String inicio, String fin, String filtro) throws ParseException;

	public abstract List<CuentaPagar> listarCuentaPorPagarFiltro(DatoBasico dato, String filtro);
	


}
