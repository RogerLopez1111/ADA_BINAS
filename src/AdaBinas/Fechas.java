package AdaBinas;
import java.util.*;
public class Fechas {
	public static void main(String[] args) {
		 
        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
  
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente                                                     
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
  
        //Mostramos por pantalla dia/mes/año
        System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + año);
        
        //Mostramos por pantalla hora:minuto:segundo
        System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto, segundo);                               
    }
}
