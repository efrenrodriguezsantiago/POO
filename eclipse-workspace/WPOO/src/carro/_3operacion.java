package carro;

import javax.swing.JOptionPane;

public class _3operacion {
	
	//atributos
	int numero1=0;
	int numero2=0;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	//metodos
	//metodo para pedir el usuario para que nos digite 2 numeros
	public void leernumeros(){
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite primer numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite segundo numero: "));
	}
	
	public void suma(int numero1, int numero2) {
		suma = numero1 + numero2;
	}
	
	public void resta(int numero1, int numero2) {
		resta = numero1 - numero2;
	}
	
	public void multiplicacion(int numero1, int numero2) {
		multiplicacion = numero1 * numero2;
	}
	
	public void division(int numero1, int numero2) {
		division = numero1 / numero2;
	}
	
	public void resultado() {
		System.out.println("el resultado de la sumas es:"+suma);
		System.out.println("el resultado de la resta es:"+resta);
		System.out.println("el resultado de la multiplicacion es:"+multiplicacion);
		System.out.println("el resultado de la division es:"+division);
	}
	
}
