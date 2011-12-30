package servicio.implementacion;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import dao.general.DaoPersonaJuridica;

import modelo.PersonaJuridica;
import servicio.interfaz.IServicioPersonaJuridica;

public class ServicioPersonaJuridica implements IServicioPersonaJuridica {
	
	DaoPersonaJuridica daoPersonaJuridica;
	public DaoPersonaJuridica getDaoPersonaJuridica() {
		return daoPersonaJuridica;
	}

	public void setDaoPersonaJuridica(DaoPersonaJuridica daoPersonaJuridica) {
		this.daoPersonaJuridica = daoPersonaJuridica;
	}

	@Override
	public void eliminar(PersonaJuridica c) {
		daoPersonaJuridica.eliminar(c);

	}

	@Override
	public void agregar(PersonaJuridica c) {
		daoPersonaJuridica.guardar(c);
	}

	@Override
	public void actualizar(PersonaJuridica c) {
		daoPersonaJuridica.actualizar(c);
	}

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return daoPersonaJuridica.listar(PersonaJuridica.class);
	}
	
	
	public PersonaJuridica buscarPorCedulaRif(String s){
		return (PersonaJuridica) daoPersonaJuridica.buscarByCedulaRif(s);
	}

	@Override
	public List<PersonaJuridica> listarActivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonaJuridica buscarPorCodigo(PersonaJuridica d) {
		// TODO Auto-generated method stub
		return null;
	}

}
