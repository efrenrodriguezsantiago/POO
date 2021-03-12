package practica;
/*
 * construir un programa que dada un a serie de vehiculo caracterizados
 * por su marca modelo y precio  imorima las propiedades del vehiculo
 * mas barato.
 * para ello se deberan leer por teclado  las caracteristicas de cada vehiculo 
 * y crear una clase que representa  a cada uno de ellos
 */
public class barato1 {
	private String marca;
	private String modelo;
	private float precio;
	
	//metodo constructor
	public barato1(String marca,String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	//metodo geters
	
	public float getprecio() {
		return precio;
	}
	
	public String mostraDatos() {
		return "marca: "+marca+"\nmodelo: "+modelo+"\nprecio $"+precio+"\n";
	}
	
}
