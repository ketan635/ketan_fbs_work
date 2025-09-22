
class HRManager {
	int id;
	String name;
	double salary;
	double commission;

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

	void  setCommission (double c)
	{
		this.commission=c;
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

	double getCommision()
	{
		return this.commission;
	}
 	
	void display()
	{
	System.out.println("Hr id is : " +this.id);
	System.out.println("Hr name is :" +this.name);
	System.out.println("Hr salary is :"+this.salary);
	System.out.println("Hr commission is :" +this.commission);
	}
}


class Test {
	public static void main(String [] args) {
	HRManager h1=new HRManager();

	h1.setId (11);
	h1.setName("don");
	h1.setSalary(1790);
	h1.setCommission(10);


	h1.display();

	}
}