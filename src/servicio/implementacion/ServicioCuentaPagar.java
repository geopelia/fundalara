package servicio.implementacion;

import java.text.ParseException;
import java.util.List;

import servicio.interfaz.IServicioCuentaPagar;

import dao.general.DaoCuentaPagar;

import modelo.CuentaPagar;
import modelo.DatoBasico;
import modelo.Divisa;
import modelo.Persona;


public class ServicioCuentaPagar implements IServicioCuentaPagar {

	DaoCuentaPagar daoCuentaPagar;
	public DaoCuentaPagar getDaoCuentaPagar() {
		return daoCuentaPagar;
	}

	public void setDaoCuentaPagar(DaoCuentaPagar daoCuentaPagar) {
		this.daoCuentaPagar = daoCuentaPagar;
	}

	@Override
	public void eliminar(CuentaPagar c) {
		daoCuentaPagar.eliminar(c);

	}

	@Override
	public void agregar(CuentaPagar c) {
		daoCuentaPagar.guardar(c);

	}

	@Override
	public void actualizar(CuentaPagar c) {
		daoCuentaPagar.actualizar(c);

	}


	@Override
	public List<CuentaPagar> listar() {
		return (List<CuentaPagar>) daoCuentaPagar.listar(CuentaPagar.class);
	}

	@Override
	public List<CuentaPagar> listarActivos() {
		return daoCuentaPagar.listarActivos(CuentaPagar.class);
	}

	@Override
	public CuentaPagar buscarPorCodigo(CuentaPagar d) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public CuentaPagar buscarByCedulaRif(String d){
		return (CuentaPagar) daoCuentaPagar.buscarByCedulaRif(d);
	}

	@Override
	public List<CuentaPagar> listarCuentaPorPagar(DatoBasico dato) {
		// TODO Auto-generated method stub
		return  daoCuentaPagar.listarCuentaPorPagar(dato);
	}

	@Override
	public CuentaPagar buscarOrigen(String cp) {
		// TODO Auto-generated method stub
		return daoCuentaPagar.buscarOrigen(cp);
	}

	@Override
	public List<CuentaPagar> listarCuentaPorPagarPorFecha(DatoBasico dato,
			String inicio, String fin, String filtro) throws ParseException {
		// TODO Auto-generated method stub
		return daoCuentaPagar.listarCuentaPorPagarPorFecha(dato, inicio, fin,filtro);
	}

	@Override
	public List<CuentaPagar> listarCuentaPorPagarFiltro(DatoBasico dato,String filtro) {
		// TODO Auto-generated method stub
		return daoCuentaPagar.listarCuentaPorPagarFiltro(dato,filtro);
	}
	

}
