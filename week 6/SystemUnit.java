class SystemUnit{	
	private String cpuName;
	private double ramSize;
	private double disckSize;
	private String systemID;
	private String lcdModel;

	SystemUnit(String cpuName,double ramSize,double disckSize,String systemID,String lcdModel){
		this.cpuName=cpuName;
		this.ramSize=ramSize;
		this.disckSize=disckSize;
		this.systemID=systemID;
		this.lcdModel=lcdModel;
	}


	void setCpuName(String cpuName){
		this.cpuName=cpuName;
	}

	void setRamSize(double ramSize){
		this.ramSize=ramSize;
	}

	void setDisckSize(double disckSize){
		this.disckSize=disckSize;
	}
	
	void setSystemID(String systemID){
		this.systemID=systemID;
	}
	
	void setLcdModel(String lcdModel){
		this.lcdModel=lcdModel;
	}

	String getCpuName(){
		return cpuName;
	}
	
	double getRamSize(){
		return ramSize;
	}
	
	double getDisckSize(){
		return disckSize;
	}

	String getSystemID(){
		return systemID;
	}
	
	String getLcdModel(){
		return lcdModel;
	}

	public String toString(){
		return String.format("\nSystemUnit Details:\nCPU Size: %s\nRam Size: %2f\nDisck Size: %2f\nSystem ID: %s\nLCD model: %s\n", cpuName, 					ramSize,disckSize,systemID,lcdModel);
	}
	
}