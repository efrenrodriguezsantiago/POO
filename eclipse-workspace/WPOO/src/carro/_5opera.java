package carro;

import javax.swing.JOptionPane;

public class _5opera {
	
	//metodos
	//metodo para pedir el usuario para que nos digite 2 numeros
	
	public int sumar(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}
	
	public int restar(int numero1, int numero2) {
		int resta = numero1 - numero2;
		return resta;
	}
	
	public int multiplicar(int numero1, int numero2) {
		int multiplica= numero1 * numero2;
		return multiplica;
	}
	
	public int dividir(int numero1, int numero2) {
		int divide = numero1 / numero2;
		return divide;
	}
	
	public void resultado(int suma, int resta, int multiplicacion, int division) {
		System.out.println("el resultado de la sumas es:"+suma);
		System.out.println("el resultado de la resta es:"+resta);
		System.out.println("el resultado de la multiplicacion es:"+multiplicacion);
		System.out.println("el resultado de la division es:"+division);
	}
}
