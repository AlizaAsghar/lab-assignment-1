class Date{

	private int day, month, year;

   	 public Date(int day, int month, int year) {
        	this.day = day;
        	this.month = month;
        	this.year = year;
    	}

	Date(Date other) {
        	this.day = other.day;
        	this.month = other.month;
        	this.year = other.year;
        }

    	public void showDate() {
        	System.out.println(day + "/" + month + "/" + year);
    	}

	boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (!(obj instanceof Date)) return false;
        	Date other = (Date) obj;
        	return day == other.day && month == other.month && year == other.year;
        }

	public int getDay() {
        	return day;
    	}

	public void setDay(int day) {
        	this.day = day;
    	}

	public int getMonth() {
        	return month;
    	}

        public void setMonth(int month) {
        	this.month = month;
    	}

	    public int getYear() {
        	return year;
    	}

	    public void setYear(int year) {
        	this.year = year;
    	}

}