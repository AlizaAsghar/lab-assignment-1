class Main{
  public static void main(String[] args) {

	Employee employee1= new Employee("liz","Incharge");

	SystemUnit system1= new SystemUnit("Intel i7", 16, 512, "SYS001", "Dell 24-inch");
	SystemUnit system2= new SystemUnit("Intel i7", 16, 512, "SYS001", "Dell 24-inch");
	SystemUnit system3= new SystemUnit("Intel i7", 16, 512, "SYS001", "Dell 24-inch");
	
	SystemUnit[] systems = { system1, system2, system3 };
	
	Lab obj1=new Lab("Maths",employee1,systems,false);
	  System.out.println(obj1.toString());
  }
}
