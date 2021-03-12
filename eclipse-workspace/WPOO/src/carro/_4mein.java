package carro;

import javax.swing.JOptionPane;

public class _4mein {

	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite primer numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite primer numero: "));
		
		_3operacion op = new _3operacion();
		
		op.suma(numero1, numero2);
		op.resta(numero1, numero2);
		op.multiplicacion(numero1, numero2);
		op.division(numero1, numero2);
		op.resultado();
		
	}

}
