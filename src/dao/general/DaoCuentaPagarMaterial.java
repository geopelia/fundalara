package dao.general;

import java.util.List;

import modelo.CuentaPagarMaterial;
import modelo.DatoBasico;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import dao.generico.GenericDao;

public class DaoCuentaPagarMaterial extends GenericDao {
	/*public CuentaPagarMaterial buscarPorCodigo(Integer td) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx =  session.beginTransaction();
		Criteria c = getSession().createCriteria(DatoBasico.class);
		c.add(Restrictions.eq("codigoDatoBasico", td));
		return (CuentaPagarMaterial) c.list().get(0);
	}*/
	
	public List<CuentaPagarMaterial> listarMaterialesCP(String nf) {
	// TODO Auto-generated method stub
	Session session = getSession();
	Transaction tx =  session.beginTransaction();
	Criteria c = getSession().createCriteria(CuentaPagarMaterial.class);
	c.add(Restrictions.eq("cuentaPagar.origen", nf)).add(Restrictions.eq("estatus",'A')).list();
	return (List<CuentaPagarMaterial>) c.list();
}
	
	
}
