package paquete1;

public class clase1 {
	
	// public int atributo1;----------puede accesar quien sea desde paquete a paquete
	//private int atributo1;//no se puede acceder desde paquete mismo o de otro paquete
	
	//metodo accesores al privado
	private int edad;
	private String nombre;
	//metodo seters establecemos edad
	public void setedad(int edad) {
		this.edad = edad;
	}
	
	//metodo geters mostramos edad
	public int getedad() {
		return edad;
	}
	
	
	
	//establecemoos
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodo geters mostramos edad
	public String getnombre() {
		return nombre;
	}
}
