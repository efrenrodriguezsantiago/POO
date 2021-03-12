package practica;

import java.util.Scanner;

public class _5tri {
	public static double mayorarea(_5triangulo triangulo[]){
		double area;
		
		area = triangulo[0].obtenerarea();
		for(int i=1;i<triangulo.length;i++) {
			if(triangulo[i].obtenerarea()>area) {
				area = triangulo[i].obtenerarea();
			}
		}
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double base,lado;
		int ntriangulo;
		
		System.out.println("digite le numero de tirangulos a ingresas: ");
		ntriangulo = entrada.nextInt();
	
		_5triangulo triangulo[]= new _5triangulo[ntriangulo];
	for(int i=0;i<triangulo.length;i++) {
		System.out.println("\ndigite los valores para el triangulo: ");
		System.out.println("introduzca la base: ");
		base = entrada.nextDouble();
		System.out.println("introduzca el lado: ");
		lado=entrada.nextDouble();
		
		triangulo[i] = new _5triangulo(base,lado);
		System.out.println("\nel perimetro del tringulo es: "+triangulo[i].obtenerperimetro());
		System.out.println("\nel area del triangulo es: "+triangulo[i].obtenerarea());
		
		
		}
	System.out.println("\nel area del triangulo de  mayor superficie es: "+mayorarea(triangulo));
	}

}
