package AdaBinas;

import javax.swing.JOptionPane;

public class operaciones {
	public Empleados primero;
	public Empleados ultimo;
	public Empleados actual;


	public void insertarAlFinal(Empleados nuevo) {
		 if(primero==null)
			 primero=ultimo = nuevo;
		 else{
			 primero.anterior = nuevo;
		     nuevo.siguiente = primero;
		     primero = nuevo;
		 }
		  actual = nuevo;
		
	}
	
	public void imprimeLista() {
		//inicio el reccorrido de la lista con aux
				Empleados aux= primero;
				//verifico si la lista tiene nodos
				if(primero!= null) {
					//inicio el recorrido y cada que pase por un nodo lo imprimo
					do {
						JOptionPane.showMessageDialog(null, aux.getNombre()+" "+aux.getApellido());
						aux = aux.siguiente;
					}while(aux!=null);
				}		
	}
	
}
