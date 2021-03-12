package practica;
/*
 * diseñar un programa para traajar con triangulos isoceles
 * para ello defina los atributos necesaros que se requieren 
 * proporcione metodos de consulta
 * un metodo contructor e implemente metodos para clacular el 
 * perimetro y el area de un trialngulo 
 * ademas implementar un metodo que apartir de un arreglo de triangulo devuelva 
 * el area del triangulo de mayor superficie
 */
public class _5triangulo {
	private double base;
	private double lado;
	
	//constructor
	public _5triangulo(double base, double lado) {
		this.base = base;
		this.lado = lado;
	}
	
	
	public double obtenerperimetro() {
		double perimetro = 2 *  lado * base;
		return perimetro;
	}
	
	public double obtenerarea() {
		double area = (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
	return area;
	}
	
	public String mostrardatos() {
		return 	"base: "+base+"\nlado: "+lado+"\nperimetro: "+obtenerperimetro()+"\narea:"+obtenerarea()+"\n";
	}
}
