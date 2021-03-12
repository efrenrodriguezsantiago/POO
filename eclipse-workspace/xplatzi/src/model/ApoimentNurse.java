package model;

import java.util.Date;
//implementamos metodos an el azul
public class ApoimentNurse implements ISchedulable{
	private int id;
	private nurse nurse;
	private Patient patient;
	private Date date;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public nurse getNurse() {
		return nurse;
	}
	public void setNurse(nurse nurse) {
		this.nurse = nurse;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
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
	
	
	//aqui se implementa estos metodos
	
	
	@Override
	public void schedule(Date date, String time) {
		// TODO Auto-generated method stub
		
	}
	
	
}
