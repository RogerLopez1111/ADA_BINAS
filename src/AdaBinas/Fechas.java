package AdaBinas;
import java.util.*;
public class Fechas {
	public static void main(String[] args) {
		 
        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
  
        //Obtenemos el valor del a�o, mes, d�a,
        //hora, minuto y segundo del sistema
        //usando el m�todo get y el par�metro correspondiente                                                     
        int a�o = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
  
        //Mostramos por pantalla dia/mes/a�o
        System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + a�o);
        
        //Mostramos por pantalla hora:minuto:segundo
        System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto, segundo);                               
    }
}
