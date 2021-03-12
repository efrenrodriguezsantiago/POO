package practica;
/*
 * construir un programa que para una competencia de atletismo
 * el programa debe gestionar una serie de atletas caracterizados 
 * por su numero de atletas nombre y tiempo de carrera 
 * al final el programa debe mostrar los datos del atleta ganador del 
 * de la carrera
 */
public class _4atleta {
	//tenemos los atributos
	private int numeroatleta;
	private String nombre;
	private float tiempocarrera;
	
	//metodo constructor son tres metodos
	public _4atleta(int numeroatleta, String nombre, float tiempocarrera) {
		this.numeroatleta = numeroatleta;
		this.nombre = nombre;
		this.tiempocarrera = tiempocarrera;
	}

	public float getTiempocarrera() {
		return tiempocarrera;
	}
	
	public String mostrardatosdelganador() {
		return "numero de atleta: "+numeroatleta+"\nnombre del atleta:"+nombre+"\ntiempo de carrera "+tiempocarrera+"\n";
	}
	
}
