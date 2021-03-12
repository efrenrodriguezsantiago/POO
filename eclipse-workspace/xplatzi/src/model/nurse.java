package model;

public class nurse extends Users{
	
	private String speciality;
	
	public nurse(String name, String email) {
		super(name,email);
	}
	
	public String geSpeciality() {
		return speciality;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public void showDataUser() {
		// TODO Auto-generated method stub
		System.out.println("Empleado del hospital: cruz verde:");
		System.out.println("departamento: pediatria:");
		System.out.println("departamento: nutriologia");
	}}
