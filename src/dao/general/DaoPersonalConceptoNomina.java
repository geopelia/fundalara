package dao.general;

import java.util.List;
import modelo.Personal;
import modelo.PersonalConceptoNomina;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import dao.generico.GenericDao;

public class DaoPersonalConceptoNomina extends GenericDao {
	public List<PersonalConceptoNomina> listarConceptosByPersonal(Personal d){	
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(PersonalConceptoNomina.class);
		c.add(Restrictions.eq("personal",d)).list();
		return c.list();
	}
}