class Date {

	int day,month,year;
	String dow;

	void setDat(int d)
	{
		this.day=d;
	}

	void setDow(int str)
	{
		this.year=str;
	}

	void setYear(int y)
	{
		this.year=y;
	}

	void setMonth(int m)
	{
		this.month=m;
	}

	int getDay()
	{
		return this.day;
	}

	int getMonth()
	{
		return this.month;
	}
	
	int getYear()
	{
		return this.day;
	}

	Date () {
		this.day=1;
		this.month=7;
		this.year=2025;
		this.dow="monday";
	System.out.println("In Default Constructor");
	}

	Date (int d,int m,int y,String dow)
	{
		this.day=d;
		this.month=m;
		this.year=y;
		this.dow=dow;
	System.out.println("In Parameterized Constructor");
	}


	void display()
	{
	System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
}


class Test {
	public static void main(String [] args) {
	Date d1=new Date();
	Date d2=new Date(20,9,2025,"MON");

	d1.display();
	d2.display();
	}
}