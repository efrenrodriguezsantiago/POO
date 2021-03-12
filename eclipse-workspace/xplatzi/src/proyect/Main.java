package proyect;

import static ui.UIMenu.*;

import java.util.Date;

import model.Doctor;
import model.Patient;
import model.Users;


public class Main {
 public static void main(String[] args) {
	 //nombre de la clase  Y NOMBRE DE MI OBJETO = NEW Doctor;----------lo instanciamos de Doctor

	        //showMenu();
//polimorfismo agrega comportamineto o sustituyendo el comportamineto le estoy dandmo mas
	 //polimorfismo
	 //muchas formas
	 		Doctor myDoctor = new Doctor("Efren Rodriguez "," efren@odontologo.com");//los nombre se coloca con this en doctor
	        myDoctor.avialableapoinment(new Date(), "4pm");//es lo que imprime
	        myDoctor.avialableapoinment(new Date(), "11pm");
	        myDoctor.avialableapoinment(new Date(), "2pm");
	        myDoctor.avialableapoinment(new Date(), "4pm");
	        
	        System.out.println(myDoctor);
	        
	        Doctor user = new Doctor("edgar","edgar@gmil.com");//lo imprime desde la forma del doctor
	        user.showDataUser();
	        
	        
	        Patient userpa = new Patient("juan","juan@gmil.com");//lo imprime desde la forma del doctor
	        userpa.showDataUser();
	        
	        //es un metodo abstracto quue pertenece a metoodo user--------------es una destas aplicaciones es mejor
	        Users user1 = new Users("jose","jose@gmail.com"){
	        	@Override
	        	public void showDataUser() {//control + espacio
	        		
	        		System.out.println("Doctor\n");
	        		System.out.println("Hospital: criz verde");
	        		System.out.println("Departamento pediatria");
	        		
	        	}
	        };
	        //la forma de llamarlo es y lo imprime
	        user1.showDataUser();
	        /*
	        for(Doctor.avialableapoinment aA: myDoctor.avialableapoinment()) {
	        	System.out.println(aA.getDate()+" "+aA.getTime());
	        }
	        */
	        
	        /*
	        System.out.println();
	        System.out.println();
	        Patient patient = new Patient("jose","hernandez");
	        System.out.println(patient);*/
 	}
 
 }
