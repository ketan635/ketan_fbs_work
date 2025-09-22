import java.util.Scanner;

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
	
	String getName ()
	{
		return this.name;
	}

	double getSalary ()
	{
		return this.salary;
	}

	double getAllowance()
	{
		return this.allowance;
	}

	void display ()
	{
	System.out.println("Admin Id is :" + this.id);
	System.out.println("Admin  Name is :"+this.name);
	System.out.println("Admin Salary is :" +this.salary);
	System.out.println("Admin allowance is :"+this.allowance);
	}

	Admin ()
	{
		this.id=1;
		this.name="Chaitanya";
		this.salary=9922;
		this.allowance=120;
	System.out.println("In default constructor");
	}//default constructor
	

	Admin (int i,String n,double s,double al)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		this.allowance=al;
	System.out.println("In parameterized constructor");
	}//Parameterized constructor
	

}// Admin class ends here



class Test {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		Admin a1=new Admin();
		a1.display ();
			
		System.out.println("Enter the Admin id");
		int id = sc.nextInt ();
		System.out.println("Enter Admin Name");
			sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter Admin Salary");
     	        double salary = sc.nextDouble();
		System.out.println("Enter Admin allowance");
       		double allowance = sc.nextDouble();
	
		Admin a2=new Admin(id,name,salary,allowance);	
		a2.display();
	  
	
		

	}//main method ends here

}//Test class ends here

