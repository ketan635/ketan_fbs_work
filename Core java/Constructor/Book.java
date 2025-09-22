class Book {
	long ISBN;
	String title;
	String author;
	String publisher;
	double price ;

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
		return this.author;
	}

	String getAuthor()
	{
		return this.author;
	}

	String getPublisher()
	{
		return this.publisher;
	}

	double getPrice()
	{
		return this.price;
	}

	Book ()
	{
		this.ISBN=123456789;
		this.title="core java";
		this.author="chaitanya";
		this.publisher="team java";
		this.price=250;
	System.out.println("in default constructor");
	}

	Book(int isb,String t,String a ,String p,double mrp)
	{
		this.ISBN=isb;
		this.title=t;
		this.author=a;
		this.publisher=p;
		this.price=mrp;
		System.out.println("in default constructor");
		}

	void display()
	{
	System.out.println("ISBN is :" +this.ISBN);
	System.out.println("title is :" +this.title);
	System.out.println("author is :" +this.author);
	System.out.println("publisher is :" +this.publisher);
	System.out.println("price is :" +this.price);
	}
}


class Test {
	public static void main (String [] args) {
		Book b1=new Book();
		b1.display();
		System.out.println("\n");
		Book b2=new Book(123216,"ecozen","team of ecozen","goverment",112);
		b2.display();
	}
}

