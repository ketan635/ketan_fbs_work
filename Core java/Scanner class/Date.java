import java.util.Scanner;

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
	Scanner sc=new Scanner (System.in);


	Date d1=new Date();
	d1.display();
	
	System.out.println("enter the day : ");
	int day=sc.nextInt();

	System.out.println("enter the month : ");
	int month=sc.nextInt();

	System.out.println("enter the year");
	int year =sc.nextInt();
	sc.nextLine();

	System.out.println("enter the dow");
	String dow=sc.nextLine();



	Date d2=new Date(day,month,year,dow);
	d2.display();
	}
}