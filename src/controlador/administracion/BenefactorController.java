package controlador.administracion;


import modelo.Benefactor;
import modelo.Parroquia;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.*;

import servicio.administracion.ServicioBenefactor;
import servicio.administracion.ServicioParroquia;
import java.util.*;

public class BenefactorController extends GenericForwardComposer {
	Benefactor benefactor = new Benefactor();

	
    ServicioBenefactor servicioBenefactor;
    ServicioParroquia servicioParroquia;
    
    AnnotateDataBinder binder;

	
	List<Parroquia> parroquias;
	List<String> lista;
	Combobox cbEstado, cbParroquia, cbMunicipio;	
	public void doAfterCompose (Component comp) throws Exception{
		 super.doAfterCompose(comp);
		 comp.setAttribute("cntrl", this);
//		 int codigo =  servicioFactura.listar().size();
//		 factura = new Factura();
//		 factura.setCodigofactura(String.valueOf(codigo+1));
		 parroquias = servicioParroquia.listar();
		 System.out.println("sadsasad");
		 lista = new ArrayList<String>();		
		 for (int i=0;i<parroquias.size();i++){
			  lista.add(parroquias.get(i).getNombre().toString());
		 }     
		 
	}
	public List<String> getLista() {
		return lista;
	}
	public void setLista(List<String> lista) {
		this.lista = lista;
	}
   
	
	
	
	

}
