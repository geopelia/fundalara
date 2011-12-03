package vista.general;

import org.zkoss.calendar.Calendars;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;

public class agenda extends GenericForwardComposer{
	Window form;
	Calendars calendario;
	String pantalla;
	Label lblC1, lblC2, lblC3;
	
	public void onClick$lblC1(){
		if (lblC1.getValue()=="Plan de Temporada"){
			pantalla = "Entrenamiento/Vistas/Planificacion.zul";
		} else if (lblC1.getValue()=="Cumplimiento de Actividades") {
			pantalla = "Entrenamiento/Vistas/Actividades_Realizadas.zul";
		} else if (lblC1.getValue()=="Cumplimiento de Entrenamiento") {
			pantalla = "Entrenamiento/Vistas/Cumplimiento_Entrenamiento.zul";
		}
	}
	
	public void onClick$lblC2(){
		if (lblC2.getValue()=="Plan de Entrenamiento"){
			pantalla = "Entrenamiento/Vistas/Sesion_Entrenamiento.zul";
		} else if (lblC2.getValue()=="Rendimiento de los Atletas") {
			pantalla = "Entrenamiento/Vistas/Desempeno_Atleta.zul";
		} else if (lblC2.getValue()=="Control de Inventario") {
			pantalla = "Entrenamiento/Vistas/Control_Inventario_Entrenamiento.zul";
		}
	}
	
	public void onClick$lblC3(){
		if (lblC3.getValue()=="Asignar Instalacion"){
			pantalla = "Entrenamiento/Vistas/Asignar_Instalacion.zul";
		} else if (lblC3.getValue()=="Test Aplicado") {
			pantalla = "Entrenamiento/Vistas/Resultados_Evaluativos.zul";
		} else if (lblC3.getValue()=="") {
			pantalla = "";
		}
	}
	
	public void onEventCreate$calendario(){
		form = (Window)Executions.createComponents(pantalla, null, null);
		form.doHighlighted();
	}
}