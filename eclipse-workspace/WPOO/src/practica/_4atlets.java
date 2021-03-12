package practica;

import java.util.Scanner;

public class _4atlets {
	//creamos un nuevo metodo al fianl
	public static int indiceganador(_4atleta atletas[]) {
		float tiempocarrera;
		int indice = 0;
		tiempocarrera = atletas[indice].getTiempocarrera();
		for(int i=1;i<atletas.length;i++) {
			if(atletas[i].getTiempocarrera()<tiempocarrera) {
				tiempocarrera = atletas[i].getTiempocarrera();
				indice = i;
			}
		}
		return indice;
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int numeroatleta,numeroatletas,indiceatletaganador;
		float tiempocarrera;
		
		System.out.println("digite el numero de atletas a participar");
		numeroatletas = entrada.nextInt();
		
		//creamos los objetos para cad atleta
		_4atleta atletas[] = new _4atleta[numeroatletas];
		
		for(int i=0;i<atletas.length;i++){
		System.out.println("\ndigite los datos del atleta: "+(i+1)+" ");
		System.out.println(" introduzca el numero del atleta");
		numeroatleta = entrada.nextInt();
		
		System.out.println(" introduzca el nombre del atleta");
		nombre = entrada.next();
		
		System.out.println(" introduzca el tiempo del carrera");
		tiempocarrera = entrada.nextFloat();
		
		
		atletas[i] = new _4atleta(numeroatletas,nombre,tiempocarrera);
		
		}
		indiceatletaganador = indiceganador(atletas);
		System.out.println("\nel atleta ganador es: ");
		System.out.println(atletas[indiceatletaganador].mostrardatosdelganador());
				
	}
}