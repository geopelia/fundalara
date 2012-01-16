package servicio.interfaz;

import java.util.List;
import modelo.DatoBasico;
import modelo.TipoDato;

public interface IServicioDatoBasico {
	public abstract void eliminar(DatoBasico d);
	
	public abstract void agregar(DatoBasico d);
		
	public abstract void actualizar(DatoBasico d);	
	
	public abstract List<DatoBasico> listar();	
	
	public abstract List<DatoBasico> listarPorTipoDato(String s);
	
	public abstract List<DatoBasico> listarPorPadre(String s,Integer i);
	
	public abstract List<DatoBasico> buscarPorTipoDato(TipoDato td);
	
	public abstract DatoBasico buscarPorCodigo(Integer td);
	
	public abstract DatoBasico buscarPorNombre(String td);
	
	

}
