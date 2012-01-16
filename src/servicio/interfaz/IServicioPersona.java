package servicio.interfaz;

import java.util.List;

import modelo.DatoBasico;
import modelo.Nomina;
import modelo.Persona;
import modelo.PersonaJuridica;

public interface IServicioPersona {
	
	public abstract void eliminar(Persona c);
	
	public abstract void agregar(Persona c);
		
	public abstract void actualizar(Persona c);	
	
	public abstract  List<Persona> listar ();
	
	public abstract List<Persona> listarActivos();
	
	public abstract List<Persona> listarPersonas(String d);

	public abstract List<Persona> listarProveedoresMateriales(DatoBasico d);

	
	public abstract Persona buscarPorCodigo (Persona d);

	public abstract Persona buscarByCedulaRif(String d);

}
