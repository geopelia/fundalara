package servicio.implementacion;

import java.util.List;

import servicio.interfaz.IServicioDatoBasico;

import dao.general.DaoDatoBasico;

import modelo.DatoBasico;
import modelo.TipoDato;

public class ServicioDatoBasico implements IServicioDatoBasico {
	DaoDatoBasico daoDatoBasico;
	
	@Override
	public void eliminar(DatoBasico d) {
		
	}

	@Override
	public void agregar(DatoBasico d) {
		daoDatoBasico.guardar(d);

	}

	@Override
	public void actualizar(DatoBasico d) {
		daoDatoBasico.actualizar(d);
	}

	@Override
	public List<DatoBasico> listar() {
		return daoDatoBasico.listar(DatoBasico.class);
	}

	@Override
	public List<DatoBasico> buscarPorTipoDato(TipoDato td) {
		// TODO Auto-generated method stub
		return daoDatoBasico.buscarPorTipoDato(td);
	}
	


	public DaoDatoBasico getDaoDatoBasico() {
		return daoDatoBasico;
	}

	public void setDaoDatoBasico(DaoDatoBasico daoDatoBasico) {
		this.daoDatoBasico = daoDatoBasico;
	}

	@Override
	public DatoBasico buscarPorCodigo(String td) {
		// TODO Auto-generated method stub
		return daoDatoBasico.buscarPorCodigo(td);
	}	

}
