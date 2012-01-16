package controlador.administracion;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import org.zkoss.util.media.AMedia;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Iframe;
import org.zkoss.zul.Window;

import comun.ConeccionBD;

/**
 * @author atilio
 */
public class CntrlReporte extends GenericForwardComposer {
	Button btnReportes, btnSalir, btnCancelar;
	Window ReportesEstadisticos;
	Datebox dtFechaFin,dtFechaInicio;
//	Jasperreport report;
//	Listbox format;
	Iframe ifReporte;
	String reportSrc,jrxmlSrc,folder;
	Groupbox grbFiltros,grbFormatos;
	Map parameters = new HashMap();
	AMedia am,bm;
	Connection con;
	Component reporte;
	Combobox cmbReportes;
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		comp.setVariable("cntrl", this, true);
		reporte = comp;
		dtFechaInicio.setText("01/01/2000");
		dtFechaFin.setText("01/01/2020");
	}	
	
	public CntrlReporte() throws SQLException {
		super();
		con = ConeccionBD.getCon("postgres","postgres","123456");
		//folder = Sessions.getCurrent().getWebApp().getRealPath("/WEB-INF/");
		jrxmlSrc = Sessions.getCurrent().getWebApp().getRealPath("/WEB-INF/reportes/Cuentas Por Pagar.jrxml");
		
		
	}
	
	 
	
	public void showReportfromJrxml() throws JRException, IOException{
		JasperReport jasp = JasperCompileManager.compileReport(jrxmlSrc);
		JasperPrint jaspPrint = JasperFillManager.fillReport(jasp, parameters, con);
		ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
		JRExporter exporter = new JRPdfExporter();
		exporter.setParameters(parameters);
		exporter.setParameter(JRExporterParameter.JASPER_PRINT ,jaspPrint);
		exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,arrayOutputStream);
		exporter.exportReport();
		arrayOutputStream.close();
		final AMedia amedia = new AMedia("reporteEstadistico.pdf","pdf","pdf/application", arrayOutputStream.toByteArray());
		ifReporte.setContent(amedia);
	}

	
	
	
	
	public void onClick$btnReportes() throws JRException, IOException {
		if (dtFechaInicio.getText().equals("") || dtFechaFin.getText().equals("")){
			dtFechaInicio.setText("01/01/2000");
			dtFechaFin.setText("01/01/2020");
			
		}
		parameters.put("fechvendes", dtFechaInicio.getText());
		parameters.put("fechvenchas", dtFechaFin.getText());
		
		showReportfromJrxml();
		
		
	}
	
	public void onClick$btnCancelar(){
		dtFechaInicio.setText("01/01/2000");
		dtFechaFin.setText("01/01/2020");
		
	}
	
	public void onClick$btnSalir(){
		ReportesEstadisticos.detach();
		
	}
	
	public void onChange$cmbReportes(){
		
		if (cmbReportes.getValue().toString().equals("Cuentas por Pagar")){
			grbFiltros.setVisible(true);
		}
			
	}

}

