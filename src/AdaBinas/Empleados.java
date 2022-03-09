package AdaBinas;

public class Empleados {
	private String nombre;
	private String apellido;
	private String genero;
	private String nacimiento;
	private String ingreso;
	 public Empleados siguiente;
	 public Empleados anterior;

	 
	public Empleados(String nombre, String apellido, String genero, String nacimiento,String ingreso) {

		this.nombre=nombre;
		this.apellido=apellido;
		this.genero=genero;
		this.nacimiento=nacimiento;
		this.ingreso=ingreso;



	}

	public String getNombre() {
		return nombre;
	}

	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}

	public String getApellido() {
		return apellido;
	}

	public String getGenero() {
		return genero;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public String getIngreso() {
		return ingreso;
	}

	
	
}
