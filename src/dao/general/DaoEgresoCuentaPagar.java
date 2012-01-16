package dao.general;

import java.util.List;

import modelo.CuentaPagar;
import modelo.EgresoCuentaPagar;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import dao.generico.GenericDao;

public class DaoEgresoCuentaPagar extends GenericDao {
	
	public List<EgresoCuentaPagar> listarPorOrigen(CuentaPagar td) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx =  session.beginTransaction();
		Criteria c = getSession().createCriteria(EgresoCuentaPagar.class);
		c.add(Restrictions.eq("cuentaPagar", td));
		return c.list();
	}

}
