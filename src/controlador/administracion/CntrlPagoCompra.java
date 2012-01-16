	package controlador.administracion;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import modelo.ConceptoNomina;
import modelo.CuentaPagar;
import modelo.CuentaPagarMaterial;
import modelo.CuentaPagarMaterialId;
import modelo.DatoBasico;
import modelo.Egreso;
import modelo.EgresoCuentaPagar;
import modelo.EgresoCuentaPagarId;
import modelo.EgresoFormaPago;
import modelo.EgresoFormaPagoId;
import modelo.Material;
import modelo.Movimiento;
import modelo.Persona;
import modelo.PersonaJuridica;
import modelo.PersonaNatural;
import modelo.Personal;
import modelo.PersonalConceptoNomina;
import modelo.TipoDato;

import org.hibernate.cfg.AnnotationBinder;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Doublebox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listheader;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Row;
import org.zkoss.zul.Spinner;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabpanel;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import servicio.implementacion.ServicioCuentaPagar;
import servicio.implementacion.ServicioCuentaPagarMaterial;
import servicio.implementacion.ServicioDatoBasico;
import servicio.implementacion.ServicioEgreso;
import servicio.implementacion.ServicioEgresoCuentaPagar;
import servicio.implementacion.ServicioEgresoFormaPago;
import servicio.implementacion.ServicioMaterial;
import servicio.implementacion.ServicioPersona;
import servicio.implementacion.ServicioPersonaJuridica;
import servicio.implementacion.ServicioTipoDato;

public class CntrlPagoCompra extends GenericForwardComposer {
	Material mat;
	PersonaJuridica personaJuridica;
	CuentaPagar cuentaPagar, CP, cuentaPagarFact;
	CuentaPagarMaterial material, material2;
	CuentaPagarMaterialId cuentaPagarMaterialId;
	Persona persona;
	Egreso egreso;
	EgresoCuentaPagar egresoCuentaPagar;

	EgresoFormaPago egresoFormaPago;

	DatoBasico datoBasico;
	TipoDato tipoDato;

	Component formulario, formularioProv;

	ServicioCuentaPagar servicioCuentaPagar;
	ServicioCuentaPagarMaterial servicioCuentaPagarMaterial;
	ServicioDatoBasico servicioDatoBasico;
	ServicioTipoDato servicioTipoDato;
	ServicioMaterial servicioMaterial;
	ServicioEgreso servicioEgreso;
	ServicioEgresoCuentaPagar servicioEgresoCuentaPagar;
	ServicioPersona servicioPersona;
	ServicioPersonaJuridica servicioPersonaJuridica;
	ServicioEgresoFormaPago servicioEgresoFormaPago;

	Button btnBuscar, btnSalir, btnSalir2, btnConsultarFactura, btnBuscar2,
			btnNuevoProveedor, btnBuscar3, btnNuevoArticulo, btnAgregar1,
			btnAgregar2, btnAgregar3, btnQuitar1, btnQuitar2, btnQuitar3,
			btnBuscar4, btnBuscar5, btnBuscar6, btnCancelar, btnRegistrar,
			btnPagar, btnAnular, btnCancelar2, btnEditar1, btnEditar2,
			btnCancelar3, btnBuscarFact;

	Textbox txtProveedor, txtNroFactura, txtNombreProveedor, txtRif,
			txtCodigoProveedor, txtCodigoMaterial, txtNombreMaterial,
			txtSubTotal, txtCodigoProveedor2, txtNroFactura2, txtMonto,
			txtNroDocumento, txtRif2;

	Intbox ibPrecioMaterial, ibSubTotal, ibIva, ibTotal;
	Spinner spMaterial;

	Datebox dtFactura, dtFactura2, dtFactura3, dtFechaVencimiento;
	Combobox CB, CBBanco, CBTarjeta, cmbCodigoMaterial, cmbFormaPago,
			cmbEntidadBancaria, cmbTipoTarjeta;

	Row row1, row2;
	Doublebox dbMontoaCancelar, dbMonto, dboxMonto, dboxSubTotal, dboxMontoIva,
			dboxMontoTotal, dboxIva, dboxSubTotalMat, dboxValorIva;
	Grid gridDatosFactura, gridFormaPago, gridDiferentesFormasPago;

	Tab tabPagar;
	Tabpanel tabPagarFacturas;

	Groupbox gropboxListaMateriales;

	Listbox lbxListaMateriales, lbxListaFacturas, lbxListaPagos, lbxCuentas;
	Listheader lhSubtotal;
	List<DatoBasico> datoBasicos;
	List<CuentaPagarMaterial> materiales = new ArrayList<CuentaPagarMaterial>();
	List<CuentaPagarMaterial> materiales2 = new ArrayList<CuentaPagarMaterial>();
	List<Material> listaMateriales;
	List<Persona> personas = new ArrayList<Persona>();
	List<PersonaJuridica> proveedores = new ArrayList<PersonaJuridica>();
	List<DatoBasico> formaPago, banco, tipoDocumento,
			tipoTarjeta = new ArrayList<DatoBasico>();
	List<EgresoCuentaPagar> listaEgresoCP = new ArrayList<EgresoCuentaPagar>();
	List<EgresoFormaPago> listaEgresoFormaPago = new ArrayList<EgresoFormaPago>();
	Listitem columnas;

	AnnotateDataBinder binder;
	Window Factura;
	double valorIva = 12;
	Boolean flag = false;
	int indice;
	double a = 0;
	double montoIva = 0;
	double montoTotal = 0;
	double subTotalEP = 0;
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		comp.setVariable("cntrlfactura", this, true);
		formulario = comp;
		formularioProv = comp;
		mat = new Material();
		cuentaPagar = new CuentaPagar();
		egreso = new Egreso();
		datoBasico = new DatoBasico();
		persona = new Persona();
		personaJuridica = new PersonaJuridica();
		material = new CuentaPagarMaterial();
		egresoCuentaPagar = new EgresoCuentaPagar();
		formaPago = servicioDatoBasico.listarPorTipoDato("FORMA DE PAGO");
		banco = servicioDatoBasico.listarPorTipoDato("ENTIDAD BANCARIA");
		tipoTarjeta = servicioDatoBasico.listarPorTipoDato("TARJETA CREDITO");
		tipoDocumento = servicioDatoBasico.listarPorTipoDato("DOCUMENTO");
		listaMateriales = servicioMaterial.listarMateriales();
		limpiarFormulario();
		limpiarFormularioPagar();

	}

	/* Consulta Si la Factura ya esta Registrada */
	public void onClick$btnBuscarFact() {
		if (txtNroFactura.getText().trim() == "") {
			alert("Escriba un numero de factura");
		} else {
			CP = servicioCuentaPagar
					.buscarOrigen(this.txtNroFactura.getValue());
			if (CP == null) {
				try {
					Integer qs = Messagebox
							.show("Esta Factura no se encuentra registrada, �Desea registrarla ahora?",
									"Importante", Messagebox.OK
											| Messagebox.CANCEL,
									Messagebox.QUESTION);
					if (qs.equals(1)) {

						ActivarRegistrarFacturas();
						
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.print("Si");
				alert("Esta factura ya se encuentra registrada");
				txtNroFactura.setText("");
				

			}

		}
		
	}

	/* ---------------------------------------------------------------- */
	public void onClick$btnRegistrar() {

		tipoDato = new TipoDato();

		datoBasico = servicioDatoBasico.buscarPorNombre("FACTURA");

		cuentaPagar.setDatoBasicoByCodigoTipoDocumento(datoBasico);
		cuentaPagar.setDatoBasicoByCodigoTipoEgreso(servicioDatoBasico
				.buscarPorNombre("ADQUISICION"));

		cuentaPagar.setPersona(servicioPersona.buscarByCedulaRif(persona
				.getCedulaRif().toString()));

		cuentaPagar.setMontoTotal(dboxMontoTotal.getValue());
		cuentaPagar.setSubtotal(dboxSubTotalMat.getValue());
		System.out.print("A" + dboxMontoTotal.getValue());
		System.out.print("A" + dboxSubTotalMat.getValue());
		cuentaPagar.setConcepto("FACTURA POR PAGAR");
		cuentaPagar.setEstado('P');
		cuentaPagar.setEstatus('A');
		/* cuentaPagar.setSubtotal(1200.00); */

		servicioCuentaPagar.agregar(cuentaPagar);

		for (int i = 0; i < materiales.size(); i++) {
			materiales.get(i).setId(
					new CuentaPagarMaterialId(materiales.get(i).getMaterial()
							.getCodigoMaterial(), cuentaPagar.getOrigen()));
			servicioCuentaPagarMaterial.agregar(materiales.get(i));

		}
		binder.loadAll();
		/* cuentaPagar = new CuentaPagar(); */
		// material = new CuentaPagarMaterial();

		limpiarListaMateriales();
		limpiarFormulario();
		alert("Guardado");
	}

	public void onClick$btnPagar() {

		tipoDato = new TipoDato();

		datoBasico = servicioDatoBasico.buscarPorNombre("FACTURA");

		/* egreso.setNumeroDocumento("01"); */
		egreso.setCodigoEgreso(servicioEgreso.listar().size() + 1);
		egreso.setEstatus('A');
		egreso.setNumeroDocumento(cuentaPagarFact.getOrigen());
		servicioEgreso.agregar(egreso);

		for (int i = 0; i < listaEgresoFormaPago.size(); i++) {
			listaEgresoFormaPago.get(i).setEgreso(egreso);
			listaEgresoFormaPago.get(i).setEstatus('A');
			listaEgresoFormaPago.get(i).setId(
					new EgresoFormaPagoId(servicioEgresoFormaPago.listar()
							.size() + 1, egreso.getCodigoEgreso()));
			servicioEgresoFormaPago.agregar(listaEgresoFormaPago.get(i));
		}

		egresoCuentaPagar.setEstatus('A');
		egresoCuentaPagar.setId(new EgresoCuentaPagarId(
				cuentaPagar.getOrigen(), egreso.getCodigoEgreso()));
		egresoCuentaPagar.setMontoAbonado(dboxSubTotal.getValue());
		egresoCuentaPagar.setCuentaPagar(cuentaPagarFact);
		if (cuentaPagarFact.getMontoTotal() == egresoCuentaPagar
				.getMontoAbonado())

		{
			System.out.print("--C--");
			cuentaPagarFact.setEstado('C');
			cuentaPagarFact.setConcepto("FACTURA CANCELADA");
		} else {
			System.out.print("--P--");
			cuentaPagarFact.setEstado('P');

		}
		servicioCuentaPagar.actualizar(cuentaPagarFact);
		servicioEgresoCuentaPagar.agregar(egresoCuentaPagar);

		egreso = new Egreso();
		int ii = 0;
		while (ii < materiales2.size()) {
			materiales2.remove(0);
			ii++;
		}
		;
		binder.loadComponent(lbxListaMateriales);
		binder.loadAll();

		alert("Guardado");
		limpiarFormularioPagar();
		limpiarListaFacturas();
	}

	public void onClick$btnAnular() {
		cuentaPagarFact.setEstado('E');
		cuentaPagarFact.setConcepto("FACTURA ANULADA");
		cuentaPagarFact.setEstatus('E');
		servicioCuentaPagar.actualizar(cuentaPagarFact);
		alert("Factura Anulada");

	}

	public void onClick$btnAgregar3() {
		EgresoFormaPago egresoFormaPago = new EgresoFormaPago();

		String var = cmbFormaPago.getSelectedItem().getLabel().toString();
		if ((var.equals("CHEQUE")) || (var.equals("TRANSFERENCIA"))
				|| (var.equals("DEPOSITO"))
				|| (var.equals("TARJETA DE DEBITO"))) {
			egresoFormaPago
					.setDatoBasicoByCodigoBanco((DatoBasico) cmbEntidadBancaria
							.getSelectedItem().getValue());
			egresoFormaPago.setNumeroDocuemntoPago(txtNroDocumento.getValue());
		} else if (var.equals("TARJETA DE CREDITO")) {
			egresoFormaPago
					.setDatoBasicoByCodigoTarjeta((DatoBasico) cmbTipoTarjeta
							.getSelectedItem().getValue());
			egresoFormaPago
					.setDatoBasicoByCodigoBanco((DatoBasico) cmbEntidadBancaria
							.getSelectedItem().getValue());
			egresoFormaPago.setNumeroDocuemntoPago(txtNroDocumento.getValue());
		}

		egresoFormaPago
				.setDatoBasicoByCodigoFormaPago((DatoBasico) cmbFormaPago
						.getSelectedItem().getValue());
		egresoFormaPago.setMonto(dboxMonto.getValue());

		listaEgresoFormaPago.add(egresoFormaPago);
		
		
		binder.loadComponent(lbxCuentas);
		TotalFormaPago();
		limpiarFP();
	}
	
	public void TotalFormaPago(){
		for (int ep = 0; ep < listaEgresoFormaPago.size(); ep++) {
			
			subTotalEP = subTotalEP + listaEgresoFormaPago.get(ep).getMonto();
			dboxSubTotal.setValue(subTotalEP);}
		subTotalEP = 0;
	}

	public void SubTotal() {
		

		for (int k = 0; k < materiales.size(); k++) {
			a = a + materiales.get(k).getCantidad()
					* materiales.get(k).getPrecioUnitario();

			montoIva = a * (valorIva / 100);
			montoTotal = a + (montoIva);

			dboxSubTotalMat.setValue(a);
			dboxMontoIva.setValue(montoIva);
			dboxMontoTotal.setValue(montoTotal);
			dboxValorIva.setValue(valorIva);

		}
		a = 0;
		montoIva = 0;
		montoTotal = 0;

	}

	public void onClick$btnAgregar1() {

		CuentaPagarMaterial material = new CuentaPagarMaterial();

		if (lbxListaMateriales.getItemCount() == 0) {

			material.setMaterial((Material) cmbCodigoMaterial.getSelectedItem()
					.getValue());
			material.setPrecioUnitario(ibPrecioMaterial.getValue());
			material.setCantidad(spMaterial.getValue());
			System.out.print("--No hay nada--");

		} else {
			int i = 0;
			do {

				Listcell celda1 = (Listcell) lbxListaMateriales
						.getItemAtIndex(i).getChildren().get(0);
				if (this.cmbCodigoMaterial.getSelectedItem().getLabel()
						.equals(celda1.getLabel())) {

					alert("Este concepto ya ha sido incluido.");
					return;
				}
				i++;

			} while (i < lbxListaMateriales.getItemCount());

			material.setMaterial((Material) cmbCodigoMaterial.getSelectedItem()
					.getValue());
			material.setPrecioUnitario(ibPrecioMaterial.getValue());
			material.setCantidad(spMaterial.getValue());
			System.out.print("--Si hay--");

		}

		material.setEstatus('A');
		materiales.add(material);

		binder.loadComponent(lbxListaMateriales);
		SubTotal();
		limpiarFM();
		validarBotonesRegistrar();
	}
	
	public void limpiarFM() {
		cmbCodigoMaterial.setValue("--Seleccione--");
		ibPrecioMaterial.setText("");
		spMaterial.setText("");
		
	}

	public void onClick$btnQuitar1() {
		if (lbxListaMateriales.getItemCount() == 0) {
			alert("No hay conceptos de n�mina agregados.");
		} else {
			if (lbxListaMateriales.getSelectedIndex() == -1) {
				alert("Debe Seleccionar un concepto de n�mina.");
			} else { if (lbxListaMateriales.getItemCount()==1){
				dboxSubTotalMat.setValue(null);
				dboxMontoIva.setValue(null);
				dboxMontoTotal.setValue(null);
				dboxValorIva.setValue(null);
				materiales.remove(lbxListaMateriales.getSelectedIndex());
				binder.loadComponent(lbxListaMateriales);
			}else{

				
			
				materiales.remove(lbxListaMateriales.getSelectedIndex());
				
				binder.loadComponent(lbxListaMateriales);
				SubTotal();
				binder.loadComponent(lbxListaMateriales);
				validarBotonesRegistrar();
				btnAgregar1.setDisabled(false);
				btnQuitar1.setDisabled(true);}
			}
		}

	}

	public void onSelect$cmbFormaPago() {
		String var = cmbFormaPago.getSelectedItem().getLabel().toString();

		if (var.equals("EFECTIVO")) {
			row1.setVisible(false);
			row2.setVisible(false);

		} else if (var.equals("TARJETA DE CREDITO")) {
			row1.setVisible(true);
			row2.setVisible(true);

		} else {
			row1.setVisible(true);
			row2.setVisible(false);
		}
	}

	public void onClick$btnBuscar2() {

		System.out.println(formularioProv);
		Component catalogo = Executions.createComponents(
				"/Administracion/Vistas/FrmCatalogoProveedor.zul", null, null);

		catalogo.setVariable("formularioProv", formularioProv, false);
		formularioProv.addEventListener("onCatalogoCerrado",
				new EventListener() {
					@Override
					public void onEvent(Event arg0) throws Exception {

						persona = (Persona) formularioProv.getVariable(
								"persona", false);

						binder.loadAll();

					}
				});

	}

	/* LLAMADA AL LO QUE SE ESTA SELECCIONANDO EN EL CATALOGO DE FACTURAS */

	public void onClick$btnBuscar5() {
		System.out.println(formulario);
		Component catalogo = Executions.createComponents(
				"/Administracion/Vistas/FrmCatalogoFacturas.zul", null, null);

		catalogo.setVariable("formulario", formulario, false);
		formulario.addEventListener("onCatalogoCerrado", new EventListener() {
			@Override
			public void onEvent(Event arg0) throws Exception {
				cuentaPagarFact = (CuentaPagar) formulario.getVariable(
						"cuentaPagar", false);
				materiales2 = servicioCuentaPagarMaterial
						.listarMaterialesCP(cuentaPagarFact.getOrigen());
				System.out.print(cuentaPagarFact.getOrigen());

				double acumulador = 0;
				listaEgresoCP = servicioEgresoCuentaPagar
						.listarPorOrigen(cuentaPagarFact);
				for (int k = 0; k < listaEgresoCP.size(); k++) {
					acumulador = acumulador
							+ listaEgresoCP.get(k).getMontoAbonado();
				}
				dbMonto.setValue(cuentaPagarFact.getMontoTotal() - acumulador);
				binder.loadAll();

			}
		});

		ActivarPagarFacturas();

	}

	// -------------------------------------------------------------------------------------------------------

	public void onClick$btnEditar1() {

		if (flag == false) {
			if (materiales.size() == 0) {
				alert("No hay incidencias agregadas para editar.");
			} else {
				if (lbxListaMateriales.getSelectedCount() == 0) {
					alert("Debe seleccionar un material.");
				} else {
					Listitem nuevoItem = lbxListaMateriales
							.getItemAtIndex(lbxListaMateriales
									.getSelectedIndex());
					Listcell celda0 = (Listcell) nuevoItem.getChildren().get(0);
					Listcell celda1 = (Listcell) nuevoItem.getChildren().get(1);
					Listcell celda2 = (Listcell) nuevoItem.getChildren().get(2);

					this.cmbCodigoMaterial.setValue(celda0.getLabel());

					this.ibPrecioMaterial.setText(String.valueOf(celda1
							.getLabel()));
					this.spMaterial.setText(String.valueOf(celda2.getLabel()));

					indice = lbxListaMateriales.getSelectedIndex();

					lbxListaMateriales.removeItemAt(lbxListaMateriales
							.getSelectedIndex());
					btnAgregar1.setDisabled(true);
					btnQuitar1.setDisabled(true);
					// btnAceptar.setDisabled(true);
					flag = true;
				}
			}
		} else if (flag == true) {
			// listaMovimientos.get(indice).setCodigoMovimiento(servicioMovimiento.listar().size()+1);
			materiales.get(indice).setMaterial(
					(Material) cmbCodigoMaterial.getSelectedItem().getValue());
			materiales.get(indice).setPrecioUnitario(
					ibPrecioMaterial.getValue());
			materiales.get(indice).setCantidad(spMaterial.getValue());

			
			binder.loadComponent(lbxListaMateriales);
			SubTotal();
			btnAgregar1.setDisabled(false);
			btnQuitar1.setDisabled(false);
			
			flag = false;
		}
	}

	// ------------------------------------------------------------------------------------------------------
	public void limpiarFP() {
		cmbTipoTarjeta.setValue("--Seleccione--");
		cmbFormaPago.setValue("--Seleccione--");
		cmbTipoTarjeta.setValue("--Seleccione--");
		cmbEntidadBancaria.setValue("--Seleccione--");
		dboxMonto.setValue(null);
		txtNroDocumento.setValue(null);
		row1.setVisible(false);
		row2.setVisible(false);
	}

	public void limpiarListaMateriales() {
		int ind = lbxListaMateriales.getItemCount();
		for (int i = 0; i < ind; i++) {
			lbxListaMateriales.removeItemAt(0);
		}
	}

	public void limpiarListaFacturas() {
		int ind = lbxListaFacturas.getItemCount();
		for (int i = 0; i < ind; i++) {
			lbxListaFacturas.removeItemAt(0);
		}
	}

	public void limpiarFormulario() {

		/* -------------- Formulario Registar Facturas ------------- */

		txtNroFactura.setText("");
		txtNroFactura.setDisabled(false);
		txtProveedor.setText("");
		txtProveedor.setDisabled(true);
		txtRif.setText("");
		txtRif.setDisabled(true);
		dtFactura.setText("");
		dtFactura.setDisabled(true);
		dtFechaVencimiento.setText("");
		dtFechaVencimiento.setDisabled(true);
		cmbCodigoMaterial.setSelectedIndex(-1);
		cmbCodigoMaterial.setValue("--Seleccione--");
		cmbCodigoMaterial.setDisabled(true);
		btnNuevoArticulo.setDisabled(true);
		ibPrecioMaterial.setText("");
		ibPrecioMaterial.setDisabled(true);
		spMaterial.setText("");
		spMaterial.setDisabled(true);
		btnBuscar2.setDisabled(false);
		btnNuevoProveedor.setDisabled(true);
		btnAgregar1.setDisabled(true);
		btnQuitar1.setDisabled(true);
		btnEditar1.setDisabled(true);
		dboxSubTotalMat.setText("");
		dboxSubTotalMat.setDisabled(true);

		dboxValorIva.setDisabled(true);
		dboxMontoIva.setText("");
		dboxMontoIva.setDisabled(true);
		dboxMontoTotal.setText("");
		dboxMontoTotal.setDisabled(true);
		btnRegistrar.setDisabled(true);
		/*
		 * cuentaPagar = new CuentaPagar(); persona = new Persona();
		 * personaJuridica = new PersonaJuridica();
		 */

		/* -------------- Formulario Pagar Facturas ------------- */
	}

	public void validarBotonesRegistrar() {
		if ((txtNroFactura.getText().trim() != "")
				&& (txtProveedor.getText().trim() != "")
				
				&& (dtFactura.getText().trim() != "")
				&& (dtFechaVencimiento.getText().trim() != "")
				&& (lbxListaMateriales.getItemCount() != 0)
		){
			
			
			btnRegistrar.setDisabled(false);
		} else {
			
			btnRegistrar.setDisabled(true);
		
		}

		if (lbxListaMateriales.getItemCount() == 0) {
			
			btnQuitar1.setDisabled(true);
			btnEditar1.setDisabled(true);
			
		} else {
			btnAgregar1.setDisabled(true);
			btnQuitar1.setDisabled(false);
			btnEditar1.setDisabled(false);
		}		

		
	}
	
	

	public Textbox getTxtProveedor() {
		return txtProveedor;
	}

	public void onFocus$txtNroFactura() {
		validarBotonesRegistrar();
	}

	public void onFocus$txtProveedor() {
		validarBotonesRegistrar();
	}

	
	public void onFocus$dtFactura() {
		validarBotonesRegistrar();
	}

	public void onFocus$dtFechaVencimiento() {
		validarBotonesRegistrar();
	}

	
	public void onSelect$lbxListaMateriales() {
		validarBotonesRegistrar();
	}

	public void limpiarFormularioPagar() {
		btnBuscar5.setDisabled(false);
		dtFactura2.setText("");
		dtFactura2.setDisabled(true);
		dtFactura3.setText("");
		dtFactura3.setDisabled(true);
		txtNroFactura2.setText("");
		txtNroFactura2.setDisabled(true);
		txtRif2.setText("");
		txtRif2.setDisabled(true);
		txtCodigoProveedor2.setText("");
		txtCodigoProveedor2.setDisabled(true);
		dbMonto.setText("");
		dbMonto.setDisabled(true);
		cmbFormaPago.setSelectedIndex(-1);
		cmbFormaPago.setValue("--Seleccione--");
		dboxMonto.setText("");
		dboxMonto.setDisabled(true);
		txtNroDocumento.setText("");
		txtNroDocumento.setDisabled(true);
		cmbEntidadBancaria.setSelectedIndex(-1);
		cmbEntidadBancaria.setValue("--Seleccione--");
		cmbEntidadBancaria.setDisabled(true);
		cmbTipoTarjeta.setSelectedIndex(-1);
		cmbTipoTarjeta.setValue("--Seleccione--");
		cmbTipoTarjeta.setDisabled(true);
		btnAgregar3.setDisabled(true);
		btnQuitar3.setDisabled(true);
		btnEditar2.setDisabled(true);
		dboxSubTotal.setText("");
		dboxSubTotal.setDisabled(true);
		btnPagar.setDisabled(true);
		btnAnular.setDisabled(true);
		/*
		 * cuentaPagar = new CuentaPagar(); persona = new Persona();
		 * personaJuridica = new PersonaJuridica(); egreso = new Egreso();
		 * egresoCuentaPagar = new EgresoCuentaPagar(); egresoFormaPago = new
		 * EgresoFormaPago();
		 */

	}

	/*
	 * public void onClick$tabPagar(){ limpiarFormularioPagar();
	 * 
	 * }
	 */
	public void ActivarRegistrarFacturas() {

		txtProveedor.setDisabled(true);
		txtNroFactura.setDisabled(true);
		btnBuscar2.setDisabled(true);
		txtRif.setDisabled(true);

		dtFactura.setDisabled(false);
		dtFechaVencimiento.setDisabled(false);

		cmbCodigoMaterial.setDisabled(false);
		btnNuevoArticulo.setDisabled(false);

		ibPrecioMaterial.setDisabled(false);

		spMaterial.setDisabled(false);
		btnBuscar2.setDisabled(false);
		btnNuevoProveedor.setDisabled(false);
		

		

	}

	public void ActivarPagarFacturas() {
		btnBuscar5.setDisabled(true);
		dtFactura2.setDisabled(false);
		
		cmbFormaPago.setDisabled(false);
		dboxMonto.setDisabled(false);
		txtNroDocumento.setDisabled(false);
		cmbEntidadBancaria.setDisabled(false);
		cmbTipoTarjeta.setDisabled(false);
		
		dboxSubTotal.setDisabled(false);
		btnPagar.setDisabled(false);
		btnAnular.setDisabled(false);

	}

	public void onClick$btnCancelar2() {
		limpiarListaMateriales();
		limpiarFormulario();

	}
	
	public void ValidarFormaPago() {
		String var = cmbFormaPago.getSelectedItem().getLabel().toString();

		
		if (var.equals("EFECTIVO")) {
			if (dboxMonto.getValue() != 0) {
				btnAgregar3.setDisabled(false);
				
			} else {
				btnAgregar3.setDisabled(true);
				
			}
		} else if (var.equals("TARJETA DE CREDITO")) {
			if ((cmbFormaPago.getValue() != "--Seleccione--")
					&& (dboxMonto.getText().trim() != "")
					&& (txtNroDocumento.getText().trim() != "")
					&& (cmbEntidadBancaria.getValue().trim() != "--Seleccione--")
					&& (cmbTipoTarjeta.getValue().trim() != "--Seleccione--")) {
				btnAgregar3.setDisabled(false);
			} else {
				btnAgregar3.setDisabled(true);
			}
		} else {
			if ((cmbFormaPago.getValue() != "--Seleccione--")
					&& (dboxMonto.getText().trim() != "")
					&& (txtNroDocumento.getText().trim() != "")
					&& (cmbEntidadBancaria.getValue() != "--Seleccione--")) {
				btnAgregar3.setDisabled(false);
			} else {
				btnAgregar3.setDisabled(true);
			}
		}
	}
	
	public void ValidarMateriales() {
		if ((cmbCodigoMaterial.getValue() != "--Seleccione--")
				&& (ibPrecioMaterial.getText().trim() != "")
				&& (spMaterial.getText().trim() != "")
			) {
			btnAgregar1.setDisabled(false);
		} else {
			btnAgregar1.setDisabled(true);
		}
		
	}

	public void onFocus$ibPrecioMaterial(){
		lbxListaMateriales.setSelectedIndex(-1);
		ValidarMateriales();
	}
	
	public void onFocus$spMaterial() {
		lbxListaMateriales.setSelectedIndex(-1);
		ValidarMateriales();
		
	}
	public ServicioCuentaPagar getServicioCuentaPagar() {
		return servicioCuentaPagar;
	}

	public void setServicioCuentaPagar(ServicioCuentaPagar servicioCuentaPagar) {
		this.servicioCuentaPagar = servicioCuentaPagar;
	}

	public EgresoCuentaPagar getEgresoCuentaPagar() {
		return egresoCuentaPagar;
	}

	public void setEgresoCuentaPagar(EgresoCuentaPagar egresoCuentaPagar) {
		this.egresoCuentaPagar = egresoCuentaPagar;
	}

	public Component getFormulario() {
		return formulario;
	}

	public void setFormulario(Component formulario) {
		this.formulario = formulario;
	}

	public ServicioDatoBasico getServicioDatoBasico() {
		return servicioDatoBasico;
	}

	public void setServicioDatoBasico(ServicioDatoBasico servicioDatoBasico) {
		this.servicioDatoBasico = servicioDatoBasico;
	}

	public ServicioTipoDato getServicioTipoDato() {
		return servicioTipoDato;
	}

	public void setServicioTipoDato(ServicioTipoDato servicioTipoDato) {
		this.servicioTipoDato = servicioTipoDato;
	}

	public ServicioPersona getServicioPersona() {
		return servicioPersona;
	}

	public void setServicioPersona(ServicioPersona servicioPersona) {
		this.servicioPersona = servicioPersona;
	}

	public Listbox getLbxListaFacturas() {
		return lbxListaFacturas;
	}

	public void setLbxListaFacturas(Listbox lbxListaFacturas) {
		this.lbxListaFacturas = lbxListaFacturas;
	}

	public ServicioEgresoFormaPago getServicioEgresoFormaPago() {
		return servicioEgresoFormaPago;
	}

	public void setServicioEgresoFormaPago(
			ServicioEgresoFormaPago servicioEgresoFormaPago) {
		this.servicioEgresoFormaPago = servicioEgresoFormaPago;
	}

	public Combobox getCmbCodigoMaterial() {
		return cmbCodigoMaterial;
	}

	public void setCmbCodigoMaterial(Combobox cmbCodigoMaterial) {
		this.cmbCodigoMaterial = cmbCodigoMaterial;
	}

	public Combobox getCmbFormaPago() {
		return cmbFormaPago;
	}

	public void setCmbFormaPago(Combobox cmbFormaPago) {
		this.cmbFormaPago = cmbFormaPago;
	}

	public Combobox getCmbEntidadBancaria() {
		return cmbEntidadBancaria;
	}

	public void setCmbEntidadBancaria(Combobox cmbEntidadBancaria) {
		this.cmbEntidadBancaria = cmbEntidadBancaria;
	}

	public Combobox getCmbTipoTarjeta() {
		return cmbTipoTarjeta;
	}

	public void setCmbTipoTarjeta(Combobox cmbTipoTarjeta) {
		this.cmbTipoTarjeta = cmbTipoTarjeta;
	}

	public Grid getGridFormaPago() {
		return gridFormaPago;
	}

	public void setGridFormaPago(Grid gridFormaPago) {
		this.gridFormaPago = gridFormaPago;
	}

	public Grid getGridDiferentesFormasPago() {
		return gridDiferentesFormasPago;
	}

	public void setGridDiferentesFormasPago(Grid gridDiferentesFormasPago) {
		this.gridDiferentesFormasPago = gridDiferentesFormasPago;
	}

	public List<EgresoFormaPago> getListaEgresoFormaPago() {
		return listaEgresoFormaPago;
	}

	public void setListaEgresoFormaPago(
			List<EgresoFormaPago> listaEgresoFormaPago) {
		this.listaEgresoFormaPago = listaEgresoFormaPago;
	}

	public Listitem getColumnas() {
		return columnas;
	}

	public void setColumnas(Listitem columnas) {
		this.columnas = columnas;
	}

	public Listbox getLbxListaPagos() {
		return lbxListaPagos;
	}

	public void setLbxListaPagos(Listbox lbxListaPagos) {
		this.lbxListaPagos = lbxListaPagos;
	}

	public Window getFactura() {
		return Factura;
	}

	public void setFactura(Window factura) {
		Factura = factura;
	}

	public ServicioCuentaPagarMaterial getServicioCuentaPagarMaterial() {
		return servicioCuentaPagarMaterial;
	}

	public void setServicioCuentaPagarMaterial(
			ServicioCuentaPagarMaterial servicioCuentaPagarMaterial) {
		this.servicioCuentaPagarMaterial = servicioCuentaPagarMaterial;
	}

	public Listbox getLbxListaMateriales() {
		return lbxListaMateriales;
	}

	public void setLbxListaMateriales(Listbox lbxListaMateriales) {
		this.lbxListaMateriales = lbxListaMateriales;
	}

	public void onClick$btnBuscar6() {

		Executions.createComponents(
				"/Administracion/Vistas/FrmDetalleFactura.zul", null, null);
	}

	public void onCLick$btnNuevoProveedor() {
		Executions.createComponents(
				"/Administracion/Vistas/FrmProveedores.zul", null, null);

	}

	public void onClick$btnConsultarFactura() {

		Executions.createComponents(
				"/Administracion/FrmConsultaMaterialesFact.zul", null, null);

	}

	public void onClick$btnSalir() {
		Factura.onClose();
	}

	public void onClick$btnSalir2() {
		Factura.onClose();
	}

	public ServicioEgreso getServicioEgreso() {
		return servicioEgreso;
	}

	public void setServicioEgreso(ServicioEgreso servicioEgreso) {
		this.servicioEgreso = servicioEgreso;
	}

	public ServicioEgresoCuentaPagar getServicioEgresoCuentaPagar() {
		return servicioEgresoCuentaPagar;
	}

	public void setServicioEgresoCuentaPagar(
			ServicioEgresoCuentaPagar servicioEgresoCuentaPagar) {
		this.servicioEgresoCuentaPagar = servicioEgresoCuentaPagar;
	}

	public void onCLick$btnCancelar3() {
		limpiarFormularioPagar();
		
	}


	public Datebox getDtFactura2() {
		return dtFactura2;
	}

	public void setDtFactura2(Datebox dtFactura2) {
		this.dtFactura2 = dtFactura2;
	}

	public void onClick$btnQuitar2() {
		lbxListaFacturas.removeChild(lbxListaFacturas.getSelectedItem());
	}

	public void onClick$btnQuitar3() {
		lbxListaPagos.removeChild(lbxListaPagos.getSelectedItem());
	}

	public Button getBtnBuscar5() {
		return btnBuscar5;
	}

	public void setBtnBuscar5(Button btnBuscar5) {
		this.btnBuscar5 = btnBuscar5;
	}

	public Textbox getTxtCodigoMaterial() {
		return txtCodigoMaterial;
	}

	public void setTxtCodigoMaterial(Textbox txtCodigoMaterial) {
		this.txtCodigoMaterial = txtCodigoMaterial;
	}

	public Textbox getTxtNroFactura() {
		return txtNroFactura;
	}

	public void setTxtNroFactura(Textbox txtNroFactura) {
		this.txtNroFactura = txtNroFactura;
	}

	public Textbox getTxtNombreProveedor() {
		return txtNombreProveedor;
	}

	public void setTxtNombreProveedor(Textbox txtNombreProveedor) {
		this.txtNombreProveedor = txtNombreProveedor;
	}

	public Textbox gettxtRif() {
		return txtRif;
	}

	public void settxtRif(Textbox txtRif) {
		this.txtRif = txtRif;
	}

	public Textbox getTxtCodigoProveedor() {
		return txtCodigoProveedor;
	}

	public void setTxtCodigoProveedor(Textbox txtCodigoProveedor) {
		this.txtCodigoProveedor = txtCodigoProveedor;
	}

	public Textbox getTxtNombreMaterial() {
		return txtNombreMaterial;
	}

	public void setTxtNombreMaterial(Textbox txtNombreMaterial) {
		this.txtNombreMaterial = txtNombreMaterial;
	}

	public Intbox getibPrecioMaterial() {
		return ibPrecioMaterial;
	}

	public void setibPrecioMaterial(Intbox ibPrecioMaterial) {
		this.ibPrecioMaterial = ibPrecioMaterial;
	}

	public Spinner getSpMaterial() {
		return spMaterial;
	}

	public void setSpMaterial(Spinner spMaterial) {
		this.spMaterial = spMaterial;
	}

	public Datebox getDtFactura() {
		return dtFactura;
	}

	public void setDtFactura(Datebox dtFactura) {
		this.dtFactura = dtFactura;
	}

	public void setTxtProveedor(Textbox txtProveedor) {
		this.txtProveedor = txtProveedor;
	}

	public Intbox getIbSubTotal() {
		return ibSubTotal;
	}

	public void setIbSubTotal(Intbox ibSubTotal) {
		this.ibSubTotal = ibSubTotal;
	}

	public Intbox getIbIva() {
		return ibIva;
	}

	public void setIbIva(Intbox ibIva) {
		this.ibIva = ibIva;
	}

	public Intbox getIbTotal() {
		return ibTotal;
	}

	public void setIbTotal(Intbox ibTotal) {
		this.ibTotal = ibTotal;
	}

	public Listheader getLhSubtotal() {
		return lhSubtotal;
	}

	public void setLhSubtotal(Listheader lhSubtotal) {
		this.lhSubtotal = lhSubtotal;
	}

	public CuentaPagar getCuentaPagar() {
		return cuentaPagar;
	}

	public void setCuentaPagar(CuentaPagar cuentaPagar) {
		this.cuentaPagar = cuentaPagar;
	}

	public CuentaPagarMaterial getCuentaPagarMaterial() {
		return material;
	}

	public void setCuentaPagarMaterial(CuentaPagarMaterial material) {
		this.material = material;
	}

	public CuentaPagarMaterialId getCuentaPagarMaterialId() {
		return cuentaPagarMaterialId;
	}

	public void setCuentaPagarMaterialId(
			CuentaPagarMaterialId cuentaPagarMaterialId) {
		this.cuentaPagarMaterialId = cuentaPagarMaterialId;
	}

	public DatoBasico getDatoBasico() {
		return datoBasico;
	}

	public void setDatoBasico(DatoBasico datoBasico) {
		this.datoBasico = datoBasico;
	}

	public CuentaPagarMaterial getMaterial() {
		return material;
	}

	public void setMaterial(CuentaPagarMaterial material) {
		this.material = material;
	}

	public Material getMat() {
		return mat;
	}

	public void setMat(Material mat) {
		this.mat = mat;
	}

	public List<Material> getListaMateriales() {
		return listaMateriales;
	}

	public void setListaMateriales(List<Material> listaMateriales) {
		this.listaMateriales = listaMateriales;
	}

	public ServicioMaterial getServicioMaterial() {
		return servicioMaterial;
	}

	public void setServicioMaterial(ServicioMaterial servicioMaterial) {
		this.servicioMaterial = servicioMaterial;
	}

	public TipoDato getTipoDato() {
		return tipoDato;
	}

	public void setTipoDato(TipoDato tipoDato) {
		this.tipoDato = tipoDato;
	}

	public List<DatoBasico> getDatoBasicos() {
		return datoBasicos;
	}

	public void setDatoBasicos(List<DatoBasico> datoBasicos) {
		this.datoBasicos = datoBasicos;
	}

	public List<CuentaPagarMaterial> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<CuentaPagarMaterial> materiales) {
		this.materiales = materiales;
	}

	public PersonaJuridica getProveedor() {
		return personaJuridica;
	}

	public void setProveedor(PersonaJuridica proveedor) {
		this.personaJuridica = proveedor;
	}

	public ServicioPersonaJuridica getServicioPersonaJuridica() {
		return servicioPersonaJuridica;
	}

	public void setServicioPersonaJuridica(
			ServicioPersonaJuridica servicioPersonaJuridica) {
		this.servicioPersonaJuridica = servicioPersonaJuridica;
	}

	public PersonaJuridica getPersonaJuridica() {
		return personaJuridica;
	}

	public void setPersonaJuridica(PersonaJuridica personaJuridica) {
		this.personaJuridica = personaJuridica;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public EgresoFormaPago getEgresoFormaPago() {
		return egresoFormaPago;
	}

	public void setEgresoFormaPago(EgresoFormaPago egresoFormaPago) {
		this.egresoFormaPago = egresoFormaPago;
	}

	public List<PersonaJuridica> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<PersonaJuridica> proveedores) {
		this.proveedores = proveedores;
	}

	public List<DatoBasico> getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(List<DatoBasico> formaPago) {
		this.formaPago = formaPago;
	}

	public List<DatoBasico> getBanco() {
		return banco;
	}

	public void setBanco(List<DatoBasico> banco) {
		this.banco = banco;
	}

	public List<DatoBasico> getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(List<DatoBasico> tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public List<DatoBasico> getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(List<DatoBasico> tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public EgresoCuentaPagar getegresoCuentaPagar() {
		return egresoCuentaPagar;
	}

	public void setegresoCuentaPagar(EgresoCuentaPagar egresoCuentaPagar) {
		this.egresoCuentaPagar = egresoCuentaPagar;
	}

	public Egreso getEgreso() {
		return egreso;
	}

	public void setEgreso(Egreso egreso) {
		this.egreso = egreso;
	}

	public void onClick$btnBuscar() {

		Executions.createComponents(
				"/Administracion/Vistas/FrmCatalogoProveedor.zul", null, null);
	}

	public CuentaPagarMaterial getMaterial2() {
		return material2;
	}

	public void setMaterial2(CuentaPagarMaterial material2) {
		this.material2 = material2;
	}

	public List<CuentaPagarMaterial> getMateriales2() {
		return materiales2;
	}

	public void setMateriales2(List<CuentaPagarMaterial> materiales2) {
		this.materiales2 = materiales2;
	}

	public CuentaPagar getCuentaPagarFact() {
		return cuentaPagarFact;
	}

	public void setCuentaPagarFact(CuentaPagar cuentaPagarFact) {
		this.cuentaPagarFact = cuentaPagarFact;
	}

}
