package controlador.administracion;

import java.util.ArrayList;
import java.util.List;

import modelo.CuentaPagar;
import modelo.DatoBasico;
import modelo.DocumentoAcreedor;
import modelo.Persona;
import modelo.PersonaJuridica;
import modelo.PersonaNatural;
import modelo.TipoDato;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Button;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import servicio.implementacion.ServicioDatoBasico;
import servicio.implementacion.ServicioDocumentoAcreedor;
import servicio.implementacion.ServicioPersona;
import servicio.implementacion.ServicioPersonaJuridica;
import servicio.implementacion.ServicioPersonaNatural;

public class CntrlCatalogoBenefactores extends GenericForwardComposer {
	DatoBasico datoBasico,datoBasico2;
	DocumentoAcreedor documentoAcreedor;
	TipoDato tipoDato;
	Persona persona;
	PersonaJuridica personaJ;
	PersonaNatural personaN;
	
	ServicioDocumentoAcreedor servicioDocumentoAcreedor;
	ServicioDatoBasico servicioDatoBasico;
	ServicioPersona servicioPersona;
	ServicioPersonaJuridica servicioPersonaJuridica;
	ServicioPersonaNatural servicioPersonaNatural;
	
	List<DocumentoAcreedor> lstDocumentoAcreedor = new ArrayList<DocumentoAcreedor>();
	List<Persona> lstPersona = new ArrayList<Persona>();
	
	Component catalogoBenefactores;
	AnnotateDataBinder binder;
	
	Window winCatalogoBenefactores;
	Listbox lbxBenefactores;
	Textbox txtFiltroCedula,txtFiltroNombre;
	Button btnAceptar, btnSalir;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);
		comp.setVariable("cntrl", this, true);
		catalogoBenefactores = comp;
		datoBasico = servicioDatoBasico.buscarPorNombre("DONACION");
		lstDocumentoAcreedor = servicioDocumentoAcreedor.listarActivos();
		
		//CuentaPagar = ser
	}
	
	
}
