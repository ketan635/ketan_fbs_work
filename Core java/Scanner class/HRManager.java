import java.util.Scanner;


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
 	

	HRManager()
	{
	this.id=1;
	this.name="chaitanya";
	this.salary=100000;
	this.commission=2;
	System.out.println("In Default Constructor");
	}

	HRManager (int i,String n,double s,double c)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		this.commission=c;
	System.out.println("Parameterized Constructor");
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
	Scanner sc=new Scanner (System.in);
	HRManager h1=new HRManager();
	h1.display();

	System.out.println("\n");
	
	System.out.println("enter the id : ");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("enter the name :");
	String name=sc.nextLine();

	System.out.println("enter the salary");
	double salary=sc.nextDouble();

	System.out.println("enter the commission");
	double commission=sc.nextDouble();

	




	HRManager h2=new HRManager (id,name,salary,commission);
	h2.display();

	}
}