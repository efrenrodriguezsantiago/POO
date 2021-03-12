package ui;

import java.util.Scanner;

public class UIMenu {
	
	public static String[] MESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};//ESTA CLASE SE PUEDE ACCEDER DESDE CUALQUIER LUGGAR
	//ES EL MANEJO DE UN MENU DE DOCTOR hay que dejarlo public
		public static void showMenu(){
	        System.out.println("Binvenido a mis citas");
	        System.out.println("Selecciona la opción deseada");

	        int response = 0;
	        do {
	            System.out.println("1. Doctor");
	            System.out.println("2. Paciente");
	            System.out.println("0. Salir");

	            Scanner sc = new Scanner(System.in);
	            response = Integer.valueOf(sc.nextLine());
	            
//------------------------------------------------------------------------------------------------------------
	            
	            switch (response){
	                case 1:
	                    System.out.println("Doctor");
	                    break;
	                case 2:
	                    response = 0;
	                    showPatientMenu();//ES OTRO METODO ANIDADO

	                    break;
	                case 0:
	                    System.out.println("Gracias por tu visita");
	                    break;
	                default:
	                    System.out.println("Porfavor selecciona la siguiente opcion");
	            }
	        }while (response != 0);
	    
	}
	 
	
	//MANEJO MENU DE PACIENTE--------------------------------------------------------------------------------
	
	
		 public static void showPatientMenu(){
		        int response = 0;
		        do {
		            System.out.println("\n\n");
		            System.out.println("Paciente");
		            System.out.println("1. Libro de citas");
		            System.out.println("2. Mis citas");
		            System.out.println("0. Return");

		            Scanner sc = new Scanner(System.in);
		            response = Integer.valueOf(sc.nextLine());

		            switch (response){
		                case 1:
		                    System.out.println("::Libro de citas");
		                    //para que imprima los 3 meses
		                    for(int i=1;i<4;i++) {
		                    	System.out.println(i+"."+MESES[i]);//la lista de los 3 primeros meses
		                    }
		                    break;
		                case 2:
		                    System.out.println("::Mi citas");
		                    break;
		                case 0:
		                    showMenu();
		                    break;
		            }
		        }while (response != 0);
		    
	 }
}
