package comun.converter;

import modelo.*;

import org.zkoss.zkplus.databind.TypeConverter;

public class NameConverter implements TypeConverter {
 
  private static String nombreCompleto = "";
  private static PersonaNatural persona;
  
  public Object coerceToBean(java.lang.Object val,
          org.zkoss.zk.ui.Component comp) {
    return null;
  }
 
  public Object coerceToUi(java.lang.Object val,
          org.zkoss.zk.ui.Component comp) {
	  if (val instanceof PersonaNatural){
	  persona = ((PersonaNatural) val);
	  nombreCompleto = persona.getPrimerNombre() + " " + persona.getSegundoNombre()
			 + " " + persona.getPrimerApellido() + " " + persona.getSegundoApellido();
	  }
	  else if (val instanceof PersonaJuridica){
		  
	  }
	  return nombreCompleto;
  }
}