class Book{
    	private String title;
    	private String issn;
    	private Date publicationDate;
   	private Person author;
    
    	Book(String title, String issn, Date publicationDate, Person author) {
        	this.title = title;
        	this.issn = issn;
        	this.publicationDate = new Date(publicationDate);
        	this.author = new Person(author);
    	}
    
    	Book(Book other) {
       		 this(other.title, other.issn, other.publicationDate, other.author);
    	}
    
    	void showBookDetails() {
        	System.out.println("Title: " + title + ", ISSN: " + issn);
        	System.out.print("Publication Date: ");
	        publicationDate.showDate();
        	System.out.println("Author: " + author.getName());
	    }
    
   	boolean equals(Object obj) {
        	if (this == obj) return true;
	        if (!(obj instanceof Book)) return false;
	        Book other = (Book) obj;
	        return title.equals(other.title) && issn.equals(other.issn) && publicationDate.equals(other.publicationDate) && author.equals(other.author);
    	}
    
	String getTitle(){
		return title; 
	}

    	void setTitle(String title) { 
		this.title = title; 
	}

    	String getIssn() {
		return issn;
	 }

    	void setIssn(String issn) { 
		this.issn = issn; 
	}
}

}