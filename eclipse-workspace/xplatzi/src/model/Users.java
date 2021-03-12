package model;

public abstract class Users{
	//SUPER USERS-----esta instancuiado por super a doctor y patient
		int id;
	    private String name;
	    private String email;
	    private String address;
	    private String phoneNumber;
	    
	    //METODO CONSTRUCTOR
		public Users(String name, String email) {
			this.name = name;
			this.email = email;
			
		}
		 //GENERAMOS GETERS YS ETERS

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			if (phoneNumber.length() > 8){
	            System.out.println("El n�mero telef�nico debe ser de 8 d�gitos m�ximo");
	        }else if(phoneNumber.length() == 8){
	            this.phoneNumber = phoneNumber;
	        }
		}
	    
		@Override
		public String toString() {
			return "Users: "+ name+", email"+email+
					"\nAddreess:"+address+". phone:"+phoneNumber;
		}
		public abstract void showDataUser();//termina de esta manera
}
