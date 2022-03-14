package AdaBinas;

import javax.swing.JOptionPane;


public class operaciones {
	public Empleados primero;
	public Empleados ultimo;
	public Empleados actual;


	public void ingresarAlFinal (Empleados nuevo) {
		if(primero == null) {
			ultimo = primero = nuevo;
		}
		else {
			ultimo.siguiente = nuevo;
			ultimo = nuevo; 
		}
	}
	
	public void ingresarAlInicio(Empleados nuevo) {
		if(primero == null)
			ultimo = primero = nuevo;
		else {
			nuevo.siguiente = primero;
			primero = nuevo;
		}
	}
	
	public void ingresarEnMedio(Empleados nuevo) {
		Empleados aux=primero;
		Empleados aux1=aux;
		if(primero == null) {
			ultimo = primero = nuevo;
		}else	 
			while(aux.getNombre().compareToIgnoreCase(nuevo.getNombre())<0) {
				aux1=aux;
				aux=aux.siguiente;
			}
		    aux.siguiente = nuevo;
			nuevo.siguiente = aux;
	}
	 
	 public void InsertarOrdenado(Empleados nuevo) {
			if(primero == null) {
				ultimo = primero = nuevo;
			}else {
				if(nuevo.getNombre().compareTo(primero.getNombre())<0) {
					ingresarAlInicio(nuevo);
				}else {
					if(nuevo.getNombre().compareTo(ultimo.getNombre())>0) {
						ingresarAlFinal(nuevo);
					}else {
						ingresarEnMedio(nuevo);
					}
				}
			}
		}
	 
	 public void editarLista(String NombBusc, String ApeBusc, int NuevoSal) {
		  Empleados aux=primero;
	       while(aux!=null) {
	    	   if(aux.getNombre().equals(NombBusc) && aux.getApellido().equals(ApeBusc)) {
	    		   aux.setSalario(NuevoSal);

	    		   }
	    	   aux=aux.siguiente;
	       }		
	}
	public void imprimeLista() {
		//inicio el reccorrido de la lista con aux
				Empleados aux= primero;
				//verifico si la lista tiene nodos
				if(primero!= null) {
					//inicio el recorrido y cada que pase por un nodo lo imprimo
					do {
						JOptionPane.showMessageDialog(null, aux.getNombre()+" "+aux.getApellido() +" "+aux.getSalario());
						aux = aux.siguiente;
					}while(aux!=null);
				}		
	}
	public void EDAD (String nombBusc, String apeBusc) {
		Empleados aux = primero;
		 while(aux!=null) {
	    	   if(aux.getNombre().equals(nombBusc) && aux.getApellido().equals(apeBusc)) {
	    		   int r =2022-aux.getNacimiento();
					JOptionPane.showMessageDialog(null, "La edad es " +r +" años");

	    		   }
	    	   aux=aux.siguiente;
	       }	
		
				
		
		
	}
	public void ANTIGUEDAD (String nombBusc, String apeBusc) {
		Empleados aux = primero;
		
		 while(aux!=null) {
	    	   if(aux.getNombre().equals(nombBusc) && aux.getApellido().equals(apeBusc)) {
	    		   int r =2022-aux.getIngreso();
					JOptionPane.showMessageDialog(null, "Tiene " +r +" años laborando");

	    		   }
	    	   aux=aux.siguiente;
	       }
	}
	
	
}
