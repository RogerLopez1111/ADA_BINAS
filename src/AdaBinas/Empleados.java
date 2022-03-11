package AdaBinas;

public class Empleados {
	private String nombre;
	private String apellido;
	private String genero;
	private int nacimiento;
	private int ingreso;
	private int salario;
	 public Empleados siguiente;
	 public Empleados anterior;

	 
	public Empleados(String nombre, String apellido, String genero, int nacimiento,int ingreso, int salario) {

		this.nombre=nombre;
		this.apellido=apellido;
		this.genero=genero;
		this.nacimiento=nacimiento;
		this.ingreso=ingreso;
		this.salario=salario;



	}

	public String getNombre() {
		return nombre;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public String getApellido() {
		return apellido;
	}

	public String getGenero() {
		return genero;
	}

	public int getNacimiento() {
		return nacimiento;
	}

	public int getIngreso() {
		return ingreso;
	}

	public int getSalario() {
		
		return salario;
	}

	
	
}
