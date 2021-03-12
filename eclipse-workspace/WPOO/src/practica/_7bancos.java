package practica;

public class _7bancos {
		
		String nombre;
		String apellido;
		String dni;
		_7banco cuenta[];

	public _7bancos(String nombre,String apellido,String dni, _7banco[]cuenta){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}
	
	
	
}
