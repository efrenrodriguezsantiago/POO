package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Users{//LA CLASE ES DOCTOR   objeto
	//-------------------------------------------------------------------
	//PASO 1 CREAR ATRIBUTOS
	private String speciality;
	//-------------------------------------------------------------------es un METODO
	 //concatenamos name
	public Doctor(String name,String email){
		 super(name,email);
		 System.out.println("el nombre del doctor asignado es: "+name);
		 this.speciality = speciality;
	 }
//metodo contrusctor geters y seters
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	ArrayList<avialableapoinment> avialableapoinment = new ArrayList<>();//es un metodo 2---CADA QUE AÑADO UNA CITA AQUI SE VE
	public void avialableapoinment(Date date, String time) {
		avialableapoinment.add(new Doctor.avialableapoinment(date,time));
	}
	
	
	
	public ArrayList<avialableapoinment>avialableapoinment(){
		return avialableapoinment;
	}
	
	@Override
	public String toString(){
		return super.toString()+"\nspeciality"+speciality+"\navialable"+avialableapoinment.toString();
	}
	
	
	public static class avialableapoinment{//es una clase1
		private int id_avialableapoinment;
		private Date date;
		private String time;
		
		//le colocamos el constructor
		public avialableapoinment(Date date, String time) {
			this.date = date;
			this.time = time;
		}
		//geters y seters

		public int getId_avialableapoinment() {
			return id_avialableapoinment;
		}

		public void setId_avialableapoinment(int id_avialableapoinment) {
			this.id_avialableapoinment = id_avialableapoinment;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
		@Override
		public String toString() {
			return "cita disponible \nDate: "+date+"\ntime: "+time;
		}
	}


	@Override
	public void showDataUser() {
		// TODO Auto-generated method stub
		System.out.println("Epleando del hospital: cruz roja:");
		System.out.println("departamento: cancerologia:");
		System.out.println("departamento: oncologia");
	}
}