
import java.util.Scanner;

class SalesManager {
	int id;
	String name;
	double salary;
	double insentive;
	int target;

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

	void setInsentive (double ins)
	{
		this.insentive=ins;
	}
	
	void setTarget (int trg)
	{
		this.target=trg;
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
		
	double getInsentive ()
	{
		return this.insentive;
	}

	int getTarget ()
	{
		return this.target;
	}
	
	SalesManager ()
	{
		this.id=1;
		this.name="chaitanya";
		this.salary=80000;
		this.insentive=2000;
		this.target=50;
	System.out.println("In default constructor");
	}

	SalesManager (int i,String n,double s,double ins,int t)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		this.insentive=ins;
		this.target=t;
	System.out.println("In parameterized constructor");
	}
	
	void display ()
	{
	System.out.println("Sales Manager Id is : "+ this.id);
	System.out.println("Sales Manager Name is : "+ this.name);
	System.out.println("Sales Manager Salary is : "+ this.salary);		System.out.println("Sales Manager Insentive is : "+ this.insentive);
	System.out.println("Sales Manager Target is : "+ this.target);

	}


}//SalesManager class ends here

class Test {
	public static void main (String [] args){
		Scanner sc=new Scanner (System.in);
		SalesManager sm = new SalesManager ();
		sm.display();
		System.out.println("\n");
		
		System.out.println("Enter the Id :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name :");
		String name = sc.nextLine();

		System.out.println("Enter the salary :");
		double salary = sc.nextDouble();

		System.out.println("Enter the insentive :");
		double insentive = sc.nextDouble();

		System.out.println("Enter the target :");
		int target= sc.nextInt();



	
		SalesManager sm2=new SalesManager (id,name,salary,insentive,target);
		sm2.display ();
	
	
	}//Main method ends here

}//Test class ends here

