package dao.general;

import java.util.List;

import modelo.PersonaJuridica;
import modelo.ProveedorBanco;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;



import dao.generico.GenericDao;

public class DaoProveedorBanco extends GenericDao {
	
	public List<ProveedorBanco> buscarByCedulaRif(String d){	
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(ProveedorBanco.class);
		c.add(Restrictions.eq("personaJuridica.cedulaRif",d)).add(Restrictions.eq("estatus",'A')).list();
		return (List<ProveedorBanco>) c.list();

	}

	public List<ProveedorBanco> listarPorProveedor(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
