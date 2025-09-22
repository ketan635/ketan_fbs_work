
	
class Bank {
	
	void approveLoan (Student s)
	{
		s.getPercentage ();
		System.out.println("Percentage :"+s.getPercentage ());

		if (s.getPercentage () > 80)
		System.out.println("Loan approved 2 lakhs");
	
		else if (s.getPercentage () > 60 && s.getPercentage () < 80)
		System.out.println("Loan approved 1 lakhs");

		else if (s.getPercentage () > 40 && s.getPercentage () < 60)
		System.out.println("Loan approved 50 Thousands");

		else 
		System.out.println("NO Loan approved");
		
	}

	void approveLoan (Employee e)
	{
		e.getSalary ();
		System.out.println("Annual Salary :"+e.getSalary ());
			
		if (e.getSalary () > 1200000 )
		System.out.println("Loan approved 7 lakh");
		
		else if (e.getSalary () >1000000 && e.getSalary () < 1200000 )
		System.out.println("Loan approved 6 lakh");

		else if (e.getSalary () > 600000 && e.getSalary () < 1000000 )
		System.out.println("Loan approved 5 lakh");
		
		else if (e.getSalary () >400000 && e.getSalary () < 600000 )
		System.out.println("Loan approved 4 lakh");

		else 
		System.out.println("No Loan approved ");
	}

}//bank class ends here

class Student {
	int rollNo;
	String name;
	double percentage;
	
	//

	//setters
	
	void setRollNo (int r)
	{
		this.rollNo = r;
	}

	void setName (String n)
	{
		this.name=n;
	}

	void setPercentage (double p)
	{
		this.percentage =p;
	}

	int getRollNo ()
	{
		return this.rollNo;
	}

	String getName ()
	{
		return this.name;
	}

	double getPercentage ()
	{
		return this.percentage;
	}
}//Student class ends here

class Employee {
	int id;	
	String name;
	double salary;
	
//Setters
	void setId (int i)
	{
		this.id=i;
	}

	void setName (String n)
	{
		this.name=n;
	}

	void setSalary (double s)
	{
		this.salary=s;
	}


//Getters

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
}//Employee class ends here



class Test {
	public static void main (String [] args){
		Student s = new Student ();
		Bank b=new Bank ();
		s.setRollNo (5);
		s.setName ("chaitanya");	
		s.setPercentage (99.90);

		Employee e=new Employee ();
		e.setId (2);
		e.setName ("ketan");
		e.setSalary (700000);

		
		b.approveLoan (s);
		b.approveLoan (e);
	}//Main method ends here

}//Test class ends here
	

		
