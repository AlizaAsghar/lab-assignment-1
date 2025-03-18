class Lab{
	String name;
	Employee labStaff;
	SystemUnit[] system= new SystemUnit[50];
	boolean hasMultiMedia;

	Lab(String name,Employee labStaff,SystemUnit[] system,boolean hasMultiMedia){
		this.name=name;
		this.labStaff=labStaff;
		this.system=system;
		this.hasMultiMedia=hasMultiMedia;
	} 
	
	public String toString(){
		StringBuilder st= new StringBuilder();
		st.append(name);
		st.append(labStaff);
		for(int i=0; i<system.length;i++){
			st.append(system[i]);
		}
		st.append(hasMultiMedia);
		return st.toString();
	}
		
	void setName(String name){
		this.name=name;
	}
	
	void setLabStaff(Employee labStaff){
		this.labStaff=labStaff;
	}

	void setSystem(SystemUnit[] system){
		this.system=system;
	}

	void setHasMultiMedia(boolean hasMultiMedia){
		this.hasMultiMedia=hasMultiMedia;
	}
	
	String getName(){
		return name;
	}
	
	Employee getLabStaff(){
		return labStaff;
	}

	SystemUnit[] getSystemArray(){
		return system;
	}
	
	boolean gethasMultiMedia(){
		return hasMultiMedia;
	}
	
}



















//u use .toString with string builder to change its type into string as our return type is string
//StringBuilder is used to put in stuff at the end of the string while u cant make modifications in the string