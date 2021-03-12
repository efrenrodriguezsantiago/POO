package practica;
/*
 * construir un programa que permita dirigir el mivimieno de un onjeto dentro de un tablero 
 * y actualice su posicion dentro del mismo 
 * los mivimientos posibles son arriba abajo izquierda derecha 
 * tras cada movimiento el progrma mostrara la nuev direcio elegida 	y las cordenadas
 * de situacion del objeto dentro del tablero
 */
public class _1movimiento {
	private int x;
	private int y;
	
	
	public _1movimiento(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void moverarriba(int incremento) {
		y += incremento;
	}
	
	public void moverabajo(int incremento) {
		y -= incremento;
	}
	
	
	public void moverderecha(int incremento) {
		x += incremento;
	}
	
	public void moverizquierda(int incremento) {
		x -= incremento;
	}
	
	public int getx() {
		return x;
		
	}
	
	public int gety() {
		return y;
		
	}
	
}
