class Address{
	String street;
	String city;
	
	\\constructor
	Address(String street,String city){
		this.street=street;
		this.city=city;
	}
	
	\\copy constructor
	Address(Address other) {
        	this.street = other.street;
        	this.city = other.city;
        }

	void showAddress(){
		System.out.println(this.Address);
	}

	boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (!(obj instanceof Address)) return false;
        	Address other = (Address) obj;
        	return street.equals(other.street) && city.equals(other.city);
   	 }


	String getStreet(){
		return this.street;
	}
	
	void setStreet(String street){
		this.street=street;
	}
	
	String getCity(){
		return this.city;
	}
	
	void setCity(String city){
		this.street=city;
	}
	

}