public class Library{
	private String name;
		Book book;
		Person incharge;
		Person staff;
	
	Library(String name, Book book,Person incharge,Person staff){
		this.name = name;
        	this.book = book;
        	this.incharge = incharge;
        	this.staff = staff;
	}

	public Library(Library other) {
	        this(other.name, other.book, other.incharge, other.staff);
    	}


	void showLibraryDetails(){
		System.out.println("Library: " + name);
        	book.showBookDetails();
	}

	public String getName() {
	        return name;
    	}	

	public void setName(String name) {
	        this.name = name;
    	}


}