
class Employee {
	int id;
	String name;
	double salary;

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

	Employee ()
	{
		this.id=1;
		this.name="chaitanya";
		this.salary=100000;
	System.out.println("In Default constructor");
}

	Employee (int i,String n,double s)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		System.out.println("parameterized constructor");
	}


	void display ()
	{
	System.out.println ("Id is : "+this.id);
	System.out.println ("Name is : "+this.name);
	System.out.println ("Salary is : "+this.salary);
	}

}//Employee class ends here

class Test {
	public static void main (String [] args){
		Employee e1 = new Employee ();
		e1.display();

System.out.println("\n");


Employee e2=new Employee(2,"ketan",200000);
e2.display();


	}//Main method ends here

}//Test class ends here

