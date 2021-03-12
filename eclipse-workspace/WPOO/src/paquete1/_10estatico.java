package paquete1;

public class _10estatico {
	//miesmbro estatico de una clase
	private static String frase = "primera frase";
	
	
	public static int sumar(int numero1, int numero2) {
		int suma = numero1 + numero2;//static pertenece a objeto no a la clase
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println(_10estatico.frase);
		System.out.println("la suma es: "+_10estatico.sumar(2, 12));
	}
}
