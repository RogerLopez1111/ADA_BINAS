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
		 actual =primero;
	}
	
	public void ingresarAlInicio(Empleados nuevo) {
		if(primero == null)
			ultimo = primero = nuevo;
		else {
			nuevo.siguiente = primero;
			primero = nuevo;
		}
		 actual =primero;
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
			 actual =primero;
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
	 
	 public Empleados editarLista(String NombBusc, String ApeBusc, int NuevoSal) {
		  Empleados aux=primero;
	       while(aux!=null) {
	    	   if(aux.getNombre().equals(NombBusc) && aux.getApellido().equals(ApeBusc)) {
	    		   aux.setSalario(NuevoSal);
	    		   actual=aux;
	    		   }
	    	   aux=aux.siguiente;
	       }
			 return actual;

	}



	public void EDAD (String nombBusc, String apeBusc) {
		Empleados aux = primero;
		 while(aux!=null) {
	    	   if(aux.getNombre().equals(nombBusc) && aux.getApellido().equals(apeBusc)) {
	    		   int r =2022-aux.getNacimiento();
					JOptionPane.showMessageDialog(null, "La edad es " +r +" a�os");

	    		   }
	    	   aux=aux.siguiente;
	       }	
		
				
		
		
	}


	
	public void ANTIGUEDAD (String nombBusc, String apeBusc) {
		Empleados aux = primero;
		
		 while(aux!=null) {
	    	   if(aux.getNombre().equals(nombBusc) && aux.getApellido().equals(apeBusc)) {
	    		   int r =2022-aux.getIngreso();
					JOptionPane.showMessageDialog(null, "Tiene " +r +" a�os laborando");

	    		   }
	    	   aux=aux.siguiente;
	       }
	}
	

	 public void imprimirLista() {
			Empleados aux=primero;
			if(primero!=null) 
				do {
					JOptionPane.showMessageDialog(null, aux.getNombre()+"\n"+ aux.getApellido()+"\n"+ aux.getSalario());
				aux = aux.siguiente;
			}while(aux!=null);
		}

	 public Empleados irAnodoSiguiente(String NombBusc, String ApeBusc) {
		 Empleados aux=primero;
		 actual=primero;
		 if(actual.siguiente==null){
			 JOptionPane.showMessageDialog(null, "No hay empleados");
		     actual = ultimo;
		 }
		 else
			 
	       while(aux!=null) {
	    	   if(aux.getNombre().equals(NombBusc) && aux.getApellido().equals(ApeBusc)) {
	    		  actual=aux;

	    		   }
	    	   aux=aux.siguiente;
	       }	
			 
		 return actual;
	 }

	
}