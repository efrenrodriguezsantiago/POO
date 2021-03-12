package practica;
/*
 * construor un programa para traajar con 
 * 2 numeros complejos implemente el siguiente menu
 */
public class _6operacion {
	
	private double a;//parte real
	private double b;//parte imaginaria
	
	//metodo constructor
	public _6operacion(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	//metodos geter
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	/*
	 * numero1 = 3 + 4i
	 * numero2 = 2 + 5i
	 * 
	 * suma = 5 + 9i
	 * 
	 * 
	 * _9operacion numero1 = new _9operacion(3,4);
	 * numero1.calcularsuma(numero2);
	 */
	public _6operacion calcularsuma(_6operacion c) {
		_6operacion suma = new _6operacion(a+c.getA(),b+c.getB());
		return suma;
	}
	
	/*multiplicamos 2 numero complejos
	 * numero1 = 3 + 4i;
	 * numero2 = 2 + 5i;
	 * mult = (3*2 - 4*5)+(3*5 + 4*2)i
	 */
	public _6operacion calcularproducto(_6operacion c) {
		_6operacion mult = new _6operacion((a*c.getA()-b*c.getB()),(a*c.getB()+b*c.getA()));
		return mult;
	}
	
	/*
	 * numero 1 = 3 + 4i
	 * numero2 = 3 + 4i
	 */
	//si la parte imaginaria es igual si si o no 
	boolean igualdad = false;
	public boolean comprobarigualdad(_6operacion c) {
		if((a==c.getA())&&(b==c.getB())) {
			igualdad = true;
			
		}
		return igualdad;
	}
	/*
	 * numero cmplejo  = 3 + 4i
	 * entero = 2
	 * mult = 6 + 8i
	 */
	//parte real por parte imaginario por el entero
	public _6operacion multiplicaentero(int x) {
		_6operacion mult = new _6operacion(a*x,b*x);
		return mult;
	}
}
