
import java.util.Scanner;
	
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

//Constructors

	Student (){
		this.rollNo=2;
		this.name="Dhananjay";
		this.percentage=94;
	}

	Student (int i,String n,double p){
		this.rollNo=i;
		this.name=n;
		this.percentage=p;
	}

	void display ()
	{
		System.out.println("Roll is :"+this.rollNo);
		System.out.println("Name is :"+this.name);
		System.out.println("Percentage is :"+this.percentage);
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

//constructors

	Employee ()
	{
		this.id=1;
		this.name="Chaitanya";
		this.salary=10000;
	}

	Employee (int i,String n,double s){
		this.id=i;
		this.name=n;
		this.salary=s;
	}

	void display ()
	{
		System.out.println("Id is :"+this.id);
		System.out.println("Name is :"+this.name);
		System.out.println("Salary is :"+this.salary);
	}
	
	
}//Employee class ends here



class Test {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		
		Student s1 = new Student ();
		s1.display();
		
		System.out.println ("Enter the Student rollNo :");
		int rollNo = sc.nextInt ();

		sc.nextLine();
		System.out.println ("Enter the Student name :");
		String name = sc.nextLine();

		System.out.println ("Enter the Student percentage :");	
		double percentage = sc.nextDouble ();
		
		Student s2 = new Student (rollNo,name,percentage);
		s2.display();
		

		Employee e1=new Employee ();
 		e1.display ();

			
		System.out.println ("Enter the employee id :");
		int eid = sc.nextInt ();

		sc.nextLine();
		System.out.println ("Enter the employee name :");
		String ename = sc.nextLine();

		System.out.println ("Enter the salary :");	
		double esalary = sc.nextDouble ();
		
		Employee e2 = new Employee (eid,ename,esalary);
		e2.display ();

		Bank b=new Bank ();
		b.approveLoan (s2);
		b.approveLoan (e2);
	}//Main method ends here

}//Test class ends here
	

		
