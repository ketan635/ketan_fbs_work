import java.util.Scanner;

class Book {
		long ISBN;
		String title;
		String author;
		String publisher;
		double price;
		
	void setISBN (long isb) 
	{
		this.ISBN=isb;
	
	}

	void setTitle (String t)
	{
		this.title=t;
	}

	void setAuthor (String a)
	{
		this.author=a;
	}

	void setPublisher (String p)
	{
		this.publisher=p;
	}

	void setPrice (double pri)
	{
		this.price=pri;
	}

	long getISBN ()
	{
		return this.ISBN;
	}
	
	String getTitle ()
	{
		return this.title;
	}

	String getAuthor ()
	{
		return this.author;
	}

	String getPublisher()
	{
		return this.publisher;
	}

	double getPrice ()
	{
		return this.price;
	}

	Book ()
	{
		this.ISBN = 1345676543;
		this.title="The Alchemist";
		this.author="Paulo Coelho";
		this.publisher="HarperCollins";
		this.price=765;
	System.out.println("In default constructor");
	}
	
	Book (int isb,String t,String a,String p,double mrp)
	{
		this.ISBN=isb;
		this.title=t;
		this.author=a;
		this.publisher=p;
		this.price=mrp;
		System.out.println("In default constructor");
	}

	
	void display ()
	{
	System.out.println("ISBN is :" + this.ISBN);
	System.out.println("Title Name is :"+this.title);
	System.out.println("Author is :" +this.author);
	System.out.println("Publsher is :"+this.publisher);
	System.out.println("Price is :"+this.price);
	}
			
}//Book class ends here


class Test {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		Book b1=new Book();
		b1.display();
		
		System.out.println("\n");
		System.out.println("Enter ISBN :");
		int isb = sc.nextInt ();
		
		System.out.println("Enter Title :");
		sc.nextLine ();
		String title = sc.nextLine ();
		

		System.out.println("Enter Author Name :");
		String author = sc.nextLine ();
		
	
		System.out.println("Enter publisher Name :");
		String publisher = sc.nextLine ();
		
		System.out.println("Enter price :");
		double price = sc.nextDouble ();
			
		System.out.println();
		
		Book b2=new Book(isb,title,author,publisher,price);
		b2.display ();
 

	}//main method ends here

}//Test class ends here


			