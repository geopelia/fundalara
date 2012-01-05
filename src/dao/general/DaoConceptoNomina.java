package dao.general;

import modelo.ConceptoNomina;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import dao.generico.GenericDao;

public class DaoConceptoNomina extends GenericDao {

	public ConceptoNomina buscarPorDescripcion(String td) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx =  session.beginTransaction();
		Criteria c = getSession().createCriteria(ConceptoNomina.class);
		c.add(Restrictions.eq("descripcion", td));
		return (ConceptoNomina) c.list().get(0);
	}
	
}
