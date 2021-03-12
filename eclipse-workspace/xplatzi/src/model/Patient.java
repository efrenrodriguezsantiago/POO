package model;

public class Patient extends Users{
	//Atributos-------SON SUBCLASE DE USERS
    private String birthday;
    private double weight;//peso----------modificador de acceso private le ponemos para que nadie acceda a nada
    private double height;//altura
    private String blood;

    //accesible desde aqui se imprime tambien
    public Patient(String name, String email){
    	super(name,email);//super esta mayor que this
    	//mas instrucciones
    }
       
  //-------------------------------METODOS GETERS Y SETERS----------------------------------------------
    //lee y escribe los valores de las variables del mienbro
    // VARIABLE---GET OBTIENE DATOR DE VARIABLE Y SET ASIGNA O CAMBIA VARIABLE
    
    // 54.5
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 54.5 Kg. String
    public String getWeight(){
        return this.weight + " Kg.";
    }


    public String getHeight() {
        return height + " Mts.";//le concatenamos mts
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }



    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    
    @Override
	public String toString() {
		return super.toString()+"\nAge:"+birthday+"\nweigth"+getWeight()+"\nheight"+getHeight()+"\nblood"+getBlood();
	}

	@Override
	public void showDataUser() {
		// TODO Auto-generated method stub
		System.out.println("paciente:");
		System.out.println("historial desde nacimiento");
	}
    
}
