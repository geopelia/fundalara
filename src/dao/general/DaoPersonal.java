package dao.general;


import modelo.Personal;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import dao.generico.GenericDao;

public class DaoPersonal extends GenericDao {
	public Personal buscarByCedulaRif(String d){	
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(Personal.class);
		c.add(Restrictions.eq("cedulaRif",d)).list();
		return (Personal)c.list().get(0);
	}
}