class Admin {
	int id;
	String name;
	double salary;
	double allowance;

	void setId (int id)
	{
		this.id=id;

	}

	void setName (String n)	
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

	String getName()
	{
		return this.name;
	}

	double getSalary()
	{
		return this.salary;
	}

	double getAllowance()
	{
		return this.allowance;
	}

	void display()
	{
	System.out.println("Admin id is :"+ this.id);
	System.out.println("Admin name is :" + this.name);
	System.out.println("Admin salary is :" +this.salary);
	}

	Admin ()
	{
		this.id=1;
		this.name="chaitanya";
		this.salary=8888;
		this.allowance=120;
	System.out.println("In defauly constructor");
	} //default constructor

	Admin (int i,String n, double s, double a1)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		this.allowance=a1;
	System.out.println("in parameterized constructor");
	}
}

class Test {
	public static void main(String [] args) {

	Admin a1=new Admin();
	a1.display();

	Admin a2=new Admin(2,"ketan",10000,500);
	a2.display();
	}
}