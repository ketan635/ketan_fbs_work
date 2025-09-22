
import java.util.Scanner;

class Product {
	int id,quantity;
	String name;
	double price;
	
	void setId (int i)
	{
		this.id=i;
	}

	void setName (String n)
	{
		this.name=n;
	}

	void setPrice (double p)
	{	
		this.price=p;
	}
	
	int getId ()
	{
		return this.id;
	}

	String getName ()
	{
		return this.name;
	}
	
	
	double getPrice ()
	{
		return this.price;
	}
	
	Product ()
	{
		this.id=1;
		this.name="TV";
		this.price=12000;
	System.out.println("In default constructor");
	}	

	Product (int i,String n,double p)
	{
		this.id=i;
		this.name=n;
		this.price=p;
	System.out.println("In parameterized constructor");
	}

	void display ()
	{
	System.out.println("Product Id is :" + this.id);
	System.out.println("Product Name is :"+this.name);
	System.out.println("Product price is :" +this.price);
	}
	
}

class Test {
	public static void main (String [] args){
		Scanner sc=new Scanner (System.in);
		Product p1=new Product ();
		p1.display ();
		System.out.println("\n");

		System.out.println("enter the id :");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		String name=sc.nextLine();

		System.out.println("enter the price : ");
		double price=sc.nextDouble();

		
		Product p2=new Product (id,name,price);
		p2.display ();
		

	}//main method ends here

}//Test class ends here
		
