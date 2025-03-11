class Person{

	String name;
	Adsress address;

	Person(String name,Adsress address){
		this.name=name;
		this.address=address;
	}

	//copy constructor
	Person(Person other){
	
	}

	void showPersonDetails{
		System.out.println("Name: " +this.name);
		System.out.println("Address: " +this.address);
	}

	boolean equla(Object obj){

	}

	String getName(){
		return this.name;
	}
	
	void setName(String name){
		this.name=name;
	}
}