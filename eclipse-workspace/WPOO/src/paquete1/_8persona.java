package paquete1;

public class _8persona {

	private final String nombre;//cuando ponemos final es constante
	private int edad;//si no ponemos final es variable
	
	//constructor
	public _8persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrardatos() {
		System.out.println("el nombre es: "+nombre);
		System.out.println("la edad es: "+edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
