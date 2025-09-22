class Admin {
	int id;
	String name;
	double salary;
	double allowance;

	void setId (int id)
	{
		this.id=id;
	}

	void setname (String n)
	{
		this.name=n;
	}
	
	void setSalary (double s)
	{
		this.salary=s;
	}

	void setAllowance (double a)
	{
		this.allowance=a;
	}

	
	int getId ()
	{
		return this.id;
	}

	String getName ()
	{
		return this.name;
	}
	
	double getSalary ()
	{
		return this.salary;
	}

	double getAllowance ()
	{
		return this.allowance;
	}


Admin ()
	{
	this.id=29;
	this.name="chaitanya";
	this.salary=20000;
	this.allowance=100;
	System.out.println("in default constructor");
	}   // parameterized constructor

Admin (int i,String n, double s, double a1)
{
	this.id=i;
	this.name=n;
	this.salary=s;
	this.allowance=a1;
	System.out.println("in parameterized constructor");
}

	
	void display ()
	{
	System.out.println("Admin Id : "+ this.id);
	System.out.println("Admin name : "+ this.name);
	System.out.println("Admin salary : "+ this.salary);
	System.out.println("Admin allowance : "+ this.allowance);
	}
}

class Test {
	public static void main (String [] args){
		Admin a1=new Admin();
		a1.display ();

		Admin a2=new Admin(2,"chaitanya",70000,3000);
		a2.display();

	}
}

