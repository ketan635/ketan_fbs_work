
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
		e1.setId (1);
		e1.setName ("chaitanya");
		e1.setSalary (50000);
	 		
		e1.getId ();
		e1.getName ();
		e1.getSalary ();
		
		e1.display ();
	}//Main method ends here

}//Test class ends here

