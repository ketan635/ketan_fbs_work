
class Date {

	int day,month,year;
	String dow;

	void setDay (int d)
	{
	   this.day=d;
	}

	void setDow(String str)
	{
		this.dow=str;
	}
	
	void setYear(int y)
	{
		this.year=y;
	}

	void setMonth(int m)
	{
		this.month=m;

	}

	int getDay ()
	{
	return this.day;	
	}

	int getMonth ()
	{
	return this.month;	
	}

	int getYear ()
	{
	return this.day;	
	}

	void display ()
	{
	System.out.println(this.day+ "/"+ this.month +"/" +this.year);
	
	}
}// Date class ends here;

class Test {
	public static void main (String [] args){
		Date d1=new Date();
		Date d2=new Date();
		d1.setDay(20);
		d1.setDow("Wed");
		d1.setMonth(9);
		d1.setYear(2025);
	 	
		d2.setDay(21);
		d2.setDow("Wed");
		d2.setMonth(9);
		d2.setYear(2025);
	
		d1.display ();
		d2.display ();

		if(d1.getDay() > d2.getDay() )
		{
		System.out.println("d1 is younger");
		}

		else
		{
		System.out.println("d2 is younger");
		}
		
	}//main method ends here
	
}//test class ends here 

