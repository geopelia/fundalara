package dao.general;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import dao.generico.GenericDao;
import modelo.DatoBasico;
import modelo.Personal;
import modelo.PersonalCargo;

public class DaoPersonalCargo extends GenericDao {

	public PersonalCargo buscarCargoActual (Personal p){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(PersonalCargo.class);
		c.add(Restrictions.eq("personal",p)).list();
		c.add(Restrictions.eq("estatus", "A"));
		return (PersonalCargo)c.list().get(0);
	}

}
