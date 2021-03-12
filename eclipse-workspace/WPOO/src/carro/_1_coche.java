package carro;

public class _1_coche{
	//es una clase
	//Atributos
	String color;
	String marca;
	int km;
	
	//metodo
	public static void main(String[]args) {
		
		_1_coche coche1 = new _1_coche();
		
		coche1.color = "blanco";
		coche1.marca = "audi";
		coche1.km = 10;
		
		System.out.println("el color del coche 1 es: "+coche1.color);
		System.out.println("la marca del coche 1 es: "+coche1.marca);
		System.out.println("el km del coche 1 es: "+coche1.km);
		
		//es otra clase
		//atributo
		
		_1_coche coche2 = new _1_coche();
		
		coche2.color = "azul";
		coche2.marca = "nissan";
		coche2.km = 0;
		
		System.out.println("el color del coche 1 es: "+coche2.color);
		System.out.println("la marca del coche 1 es: "+coche2.marca);
		System.out.println("el km del coche 1 es: "+coche2.km);
	}
	
	
}
