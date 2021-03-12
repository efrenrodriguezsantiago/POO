package practica;

import java.util.Scanner;

public class _6operacions {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		/*
		 * numero1 = a + bi;
		 * numero2 = c + di;
		 */
		
		_6operacion numero1,numero2,suma,mult;
		double a,b,c,d;
		int opcion,numero;
		
		do {
			System.out.println("\t.:operaciones con numero complejos:.");
			System.out.println("1. sumar dos numeros complejos");
			System.out.println("2. multiplicar dos numeros complejos");
			System.out.println("3. comparar dos numeros complejos (iguales o no)");
			System.out.println("4. multiplicar un numero complejo por entero");
			System.out.println("5. salir");
			System.out.println("menu");
			opcion = entrada.nextInt();
			
		switch(opcion) {
		case 1: System.out.println("\n digite el primer numero complejo:");
			System.out.println("digite la parte real");
			a = entrada.nextDouble();
			System.out.println("digite la parte imaginaria");
			b = entrada.nextDouble();
			System.out.println("\n digite el segundo numero complejo:");
			System.out.println("digite la parte real");
			c = entrada.nextDouble();
			System.out.println("digite la parte imaginaria");
			d = entrada.nextDouble();
			
			
			numero1 = new _6operacion(a,b);
			numero2 = new _6operacion(c,d);
			
			suma = numero1.calcularproducto(numero2);
			System.out.println("\nla suma es: "+suma.getA()+"+"+suma.getB()+"i");
			
			break;
			
		case 2: System.out.println("\n digite el primer numero complejo:");
			System.out.println("digite la parte real");
			a = entrada.nextDouble();
			System.out.println("digite la parte imaginaria");
			b = entrada.nextDouble();
			System.out.println("\n digite el segundo numero complejo:");
			System.out.println("digite la parte real");
			c = entrada.nextDouble();
			System.out.println("digite la parte imaginaria");
			d = entrada.nextDouble();
			
			
			numero1 = new _6operacion(a,b);
			numero2 = new _6operacion(c,d);
			
			
			mult = numero1.calcularproducto(numero2);
			System.out.println("\nla multiplicacion es: "+mult.getA()+"+"+mult.getB()+"i");
			
			break;
			
		case 3:System.out.println("\n digite el primer numero complejo:");
		System.out.println("digite la parte real");
		a = entrada.nextDouble();
		System.out.println("digite la parte imaginaria");
		b = entrada.nextDouble();
		System.out.println("\n digite el segundo numero complejo:");
		System.out.println("digite la parte real");
		c = entrada.nextDouble();
		System.out.println("digite la parte imaginaria");
		d = entrada.nextDouble();
		
		
		numero1 = new _6operacion(a,b);
		numero2 = new _6operacion(c,d);
			
		if(numero1.comprobarigualdad(numero2)) {
			System.out.println("\nlos numeros complejos son iguales: ");
		}
		else {
			System.out.println("\nlos numeros complejos no son iguales: ");
		}
			break;
			
		case 4:System.out.println("\n digite el numero complejo:");
			System.out.println("digite la parte real");
			a = entrada.nextDouble();
			System.out.println("digite la parte imaginaria");
			b = entrada.nextDouble();
			System.out.println("digite un numero entero: ");
			numero = entrada.nextInt();
			
			numero1 = new _6operacion(a,b);
			
			mult = numero1.multiplicaentero(numero);
			System.out.println("\nla multiplicacion es: "+mult.getA()+"+"+mult.getB()+"i");
			break;
		
		}
		System.out.println(" ");
		}while(opcion !=5);
		
	}

}
