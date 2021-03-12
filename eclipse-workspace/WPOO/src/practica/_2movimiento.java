package practica;

import java.util.Scanner;

public class _2movimiento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		_1movimiento t1;
		int x, y,opcion,incremento=0;
		
		System.out.println("digite la cordenada x");
		x = entrada.nextInt();
		
		System.out.println("digite la cordenada y");
		y = entrada.nextInt();
		//posicion inicial del objeto
		t1 = new _1movimiento(x,y);
		
		
		do {
			System.out.println("\n\t.:MENU:.");
			System.out.println("1.Mover hacia arriba");
			System.out.println("2.Mover hacia abajo");
			System.out.println("3.Mover hacia derecha");
			System.out.println("4.Mover hacia izquierda");
			System.out.println("5.salir");
			System.out.print("digite la opcion de menu");
			opcion = entrada.nextInt();
			
			if(opcion != 5) {
				System.out.println("\ndigite cuantos espacios quiere mover");
				incremento = entrada.nextInt();
			}
			
			
			switch(opcion) {
			case 1: t1.moverarriba(incremento);break;
			case 2: t1.moverabajo(incremento);break;
			case 3: t1.moverderecha(incremento);break;
			case 4: t1.moverizquierda(incremento);break;
			case 5: break;
			default: System.out.println("error se equivoco opcion de menu");break;
			}
			
			System.out.println("\nposicion actual del objeto(x,y):("+t1.getx()+" , "+t1.gety()+")");
			
			
		}while(opcion != 5);
	}

}
