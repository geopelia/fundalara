package dao.general;

import java.util.List;

import modelo.CuentaPagarMaterial;
import modelo.DatoBasico;
import modelo.Persona;
import modelo.PersonaJuridica;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import dao.generico.GenericDao;

public class DaoPersona extends GenericDao {
	public Persona buscarByCedulaRif(String d){	
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(Persona.class);
		c.add(Restrictions.eq("cedulaRif",d)).list();
		return (Persona)c.list().get(0);
	}
	
	public List<Persona> listarPersonas(String d) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx =  session.beginTransaction();
		Criteria c = getSession().createCriteria(Persona.class);
		c.add(Restrictions.eq("persona.cedulaRif", d)).list();
		return (List<Persona>) c.list();
	}
	
	public List<Persona> listarProveedoresMateriales(DatoBasico d) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx =  session.beginTransaction();
		Criteria c = getSession().createCriteria(Persona.class);
		c.add(Restrictions.eq("datoBasicoByCodigoTipoPersona", d)).list();
		return (List<Persona>) c.list();
	}
}
