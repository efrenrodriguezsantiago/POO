package carro;

import javax.swing.JOptionPane;

public class _6main {
public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite primer numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite primer numero: "));
		
		_5opera op = new _5opera();
		
		System.out.println("la sumas es:"+op.sumar(numero1, numero2));
		System.out.println("la resta es:"+op.restar(numero1, numero2));
		System.out.println("la multiplicacion es:"+op.multiplicar(numero1, numero2));
		System.out.println("la division es:"+op.dividir(numero1, numero2));

}
}
