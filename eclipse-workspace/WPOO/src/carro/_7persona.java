package carro;

public class _7persona {
	
	// ATRIBUTOS
		String nombre;
		int edad;
		//Metodo contructor
		//this.nombre es el atributo
		public _7persona (String nombre, int edad) {
			//el nombre son los parametrosdel mismo aqui
			this.nombre = nombre;
			this.edad = edad;
		}
		
	public void mostrardato() {
		System.out.println("el nombre es: "+nombre);
		System.out.println("la edad es: "+edad);
	}

}
