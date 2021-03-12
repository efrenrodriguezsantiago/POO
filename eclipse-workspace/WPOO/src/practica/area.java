package practica;

import javax.swing.JOptionPane;

public class area {

	public static void main(String[] args) {
		area_perimetro c1;
		float lado1 = 0;
		float lado2 = 0;
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("digite el lado 1: "));
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("digite el lado 2: "));
		
		if(lado1 == lado2){
			c1 = new area_perimetro(lado1);
		}
		else {
			c1 = new area_perimetro(lado1,lado2);
		}
		
		System.out.println("el perimetro es: "+c1.getperimetro());
		System.out.println("el area es: "+c1.getarea());
	}

}
