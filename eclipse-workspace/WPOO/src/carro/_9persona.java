package carro;

public class _9persona {
	// ATRIBUTOS
			String nombre;
			int edad;
			String dni;
			
			//Metodo contructor
			
			public _9persona (String nombre, int edad) {
				this.nombre = nombre;
				this.edad = edad;
			}
			
			public _9persona (String dni) {
				this.dni = dni;
			}
			
			
		public void correr() {
			System.out.println("soy: "+nombre+" tengo "+26+" años "+" y corro una maraton");
			
		}
		
		public void correr(int km) {
			System.out.println("he corrido: "+km);
			
		}

}
