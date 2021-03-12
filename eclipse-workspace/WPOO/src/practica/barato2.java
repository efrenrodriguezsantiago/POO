package practica;

import java.util.Scanner;

public class barato2 {
	public static int indicecochembarato(barato1 coche[]) {
		float precio;
		int indice=0;
		//aqui es donde comenzamos con los metodos de escoger barato
		precio=coche[0].getprecio();
		for(int i=1;i<coche.length;i++) {
			if(coche[i].getprecio()<precio) {
				precio = coche[i].getprecio();
				indice = i;
			}
		}
		return indice;
	}
	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		String marca,modelo;
		float precio=0;
		int numerovehiculo,indicebarato;
		
		System.out.print("digite la cantidad de vehiculo: ");
		numerovehiculo = entrada.nextInt();
		
		//creramos los objetos para los coches
		barato1 coche[] =  new barato1[numerovehiculo];
		
		//aqui le pedimos el usuario la marca modelo y el precio
		for(int  i=0;i<coche.length;i++){
			entrada.nextLine();//--------como si guardaramos un string
			System.out.println("\ndigite las caracteristicas del coche"+(i+1));
		System.out.println("\nintroduzca la marca");
		marca=entrada.nextLine();
		System.out.println("\nintroduzca el modelo");
		modelo=entrada.nextLine();
		System.out.println("\nintroduce el precio");
		precio =entrada.nextFloat();
		
		coche[i] = new barato1(marca,modelo,precio);
		
		}
		
		indicebarato = indicecochembarato(coche);
		System.out.println("\nel coche mas barato es: ");
		System.out.println(coche[indicebarato].mostraDatos());
		
	}

}
