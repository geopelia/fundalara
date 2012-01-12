package controlador.administracion;

import java.util.ArrayList;
import java.util.List;

import modelo.DatoBasico;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Doublebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.ListSubModel;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Row;
import org.zkoss.zul.SimpleListModel;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.event.ListDataListener;

import servicio.implementacion.ServicioDatoBasico;
import servicio.implementacion.ServicioTipoDato;

public class CntrlDonacion extends GenericForwardComposer {
	DatoBasico datobasico = new DatoBasico();
	ServicioTipoDato servicioTipoDato;
	ServicioDatoBasico servicioDatoBasico;
	Panel pnlDinero,pnlMateriales;
	Row row1,row2;
	Intbox intCantMaterial;
	Doublebox dbmontoDonacion;
	Combobox cmbFormaPago,cmbBanco,cmbTarjeta;
	Textbox  txtCedula,txtNombre,txtNroDocumento,txtIdMaterial,txtDescMaterial;
	Button btnGuardar,btnImprimir,btnCancelar,btnSalir;
	Component donaciones;
	DatoBasico formaPago,banco,tarjeta;
	AnnotateDataBinder binder;
	List<DatoBasico> lstFormaPago = new ArrayList<DatoBasico>();
	List<DatoBasico> lstBanco = new ArrayList<DatoBasico>();
	List<DatoBasico> lstTarjeta = new ArrayList<DatoBasico>();
	List<String> lista;
	
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		comp.setVariable("cntrl", this, true);
		this.donaciones = comp;
		lstFormaPago = (List<DatoBasico>) servicioDatoBasico.listarPorTipoDeDato("FORMA DE PAGO");
		lstBanco = servicioDatoBasico.listarPorTipoDeDato("ENTIDAD BANCARIA");
		lstTarjeta = servicioDatoBasico.listarPorTipoDeDato("TARJETA CREDITO");
		
	}
	
	public void onSelect$cmbFormaPago(){
		String var = cmbFormaPago.getSelectedItem().getLabel().toString();
		if (var.equals("EFECTIVO") ) {
			row1.setVisible(false);
			row2.setVisible(false);
			cmbBanco.setValue("Seleccione--");
			cmbTarjeta.setValue("Seleccione--");

		} else if (var.equals("TARJETA DE CREDITO") || var.equals("TARJETA DE DEBITO")) {
			row1.setVisible(true);
			row2.setVisible(true);

		} else {
			row1.setVisible(true);
			row2.setVisible(false);
			cmbTarjeta.setValue("Seleccione--");

		}
		
	}
	
	public void onClick$btnSalir(){
		donaciones.detach();
	}
	
	public void clear(){
		intCantMaterial.setValue(0);
		dbmontoDonacion.setValue(0);
		txtCedula.setValue(null);
		txtDescMaterial.setValue(null);
		txtIdMaterial.setValue(null);
		txtNombre.setValue(null);
		txtNroDocumento.setValue(null);
		cmbBanco.setValue("Seleccione--");
		cmbFormaPago.setValue("Seleccione--");
		cmbTarjeta.setValue("Seleccione--");
		pnlDinero.setOpen(false);
		pnlMateriales.setOpen(false);
	}
	
	public void onClick$btnCancelar(){
		clear();
		
	}


	public DatoBasico getDatobasico() {
		return datobasico;
	}


	public void setDatobasico(DatoBasico datobasico) {
		this.datobasico = datobasico;
	}


	public Combobox getCmbFormaPago() {
		return cmbFormaPago;
	}


	public void setCmbFormaPago(Combobox cmbFormaPago) {
		this.cmbFormaPago = cmbFormaPago;
	}


	public Textbox getTxtCedula() {
		return txtCedula;
	}


	public void setTxtCedula(Textbox txtCedula) {
		this.txtCedula = txtCedula;
	}


	public Component getDonaciones() {
		return donaciones;
	}


	public void setDonaciones(Component donaciones) {
		this.donaciones = donaciones;
	}


	public DatoBasico getFormaPago() {
		return formaPago;
	}


	public void setFormaPago(DatoBasico formaPago) {
		this.formaPago = formaPago;
	}


	public List<DatoBasico> getLstFormaPago() {
		return lstFormaPago;
	}


	public void setLstFormaPago(List<DatoBasico> lstFormaPago) {
		this.lstFormaPago = lstFormaPago;
	}


	public List<String> getLista() {
		return lista;
	}


	public void setLista(List<String> lista) {
		this.lista = lista;
	}


	public Combobox getCmbBanco() {
		return cmbBanco;
	}


	public void setCmbBanco(Combobox cmbBanco) {
		this.cmbBanco = cmbBanco;
	}


	public DatoBasico getBanco() {
		return banco;
	}


	public void setBanco(DatoBasico banco) {
		this.banco = banco;
	}


	public List<DatoBasico> getLstBanco() {
		return lstBanco;
	}


	public void setLstBanco(List<DatoBasico> lstBanco) {
		this.lstBanco = lstBanco;
	}


	public Combobox getCmbTarjeta() {
		return cmbTarjeta;
	}


	public void setCmbTarjeta(Combobox cmbTarjeta) {
		this.cmbTarjeta = cmbTarjeta;
	}


	public DatoBasico getTarjeta() {
		return tarjeta;
	}


	public void setTarjeta(DatoBasico tarjeta) {
		this.tarjeta = tarjeta;
	}


	public List<DatoBasico> getLstTarjeta() {
		return lstTarjeta;
	}


	public void setLstTarjeta(List<DatoBasico> lstTarjeta) {
		this.lstTarjeta = lstTarjeta;
	}
	
	
	
	
	

}
