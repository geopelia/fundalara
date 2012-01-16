package servicio.interfaz;

import java.util.List;

import modelo.ConceptoNomina;
import modelo.CuentaPagar;
import modelo.DatoBasico;
import modelo.EgresoCuentaPagar ;
import modelo.TipoDato;

public interface IServicioEgresoCuentaPagar {
	
	public abstract void eliminar(EgresoCuentaPagar  c);
	
	public abstract void agregar(EgresoCuentaPagar  c);
		
	public abstract void actualizar(EgresoCuentaPagar  c);	
	
	public abstract  List<EgresoCuentaPagar> listar ();
	
	public abstract List<EgresoCuentaPagar> listarActivos();
	
	public abstract List<EgresoCuentaPagar> listarPorOrigen(CuentaPagar td);
	
	public abstract  EgresoCuentaPagar buscarPorCodigo (EgresoCuentaPagar d);



}
