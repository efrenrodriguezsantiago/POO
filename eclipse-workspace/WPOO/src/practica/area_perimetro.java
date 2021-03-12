package practica;
/*
 * construir un programa que calcule el area y el perimetro de un cuadrilatero
 * dada la longitud de sus dos lados. los valores de la longitud
 * debera introducirse por linea de ordenes 
 * si es un cuadrado solo se proporcionara la longitud de uno de los dos lados al constructor
 */
public class area_perimetro {
		//Atributo encapsulamiento private
		private float lado1;
		private float lado2;
		
		//Metodo constructor1
		public area_perimetro(float lado1,float lado2) {//si lado 1 y lado 2 son difeentes
			this.lado1 = lado1;
			this.lado2 = lado2;
		}
		
		public area_perimetro(float lado1) {//en un cuadrado todos son iguales
			this.lado1 = this.lado2 = lado1;
		}
		
		public float getperimetro() {
			float perimetro = 2 * (lado1 + lado2);
			return perimetro;
		}
		
		public float getarea() {
			float area = (lado1 * lado2);
			return area;
		}
		
}
