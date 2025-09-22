
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
		Book b1=new Book();
			
		b1.setISBN (2458);
		b1.setTitle ("global");
		b1.setAuthor ("J.Tata");
		b1.setPublisher("tata grp");		
		b1.setPrice (457);
		b1.display ();

	}//main method ends here

}//Test class ends here


			
