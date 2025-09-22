
class Student {
	int roll;
	String name;
	int marks;

	void setRoll (int r)
	{
		this.roll=r;
	}
	
	void setName (String n)
	{
		this.name=n;
	}
	
	void setMarks (int m)
	{
		this.marks=m;

	}

	int getRoll ()
	{
		return this.roll;
	}

	String getName ()
	{
		return this.name;

	}

	int getMarks ()
	{
		return this.marks;
	}

	Student ()
	{
		this.roll=1;	
		this.name="chaitanya";
		this.marks=90;
	System.out.println("In default constructor");
	}

	Student (int r,String n,int m)
	{
		this.roll=r;	
		this.name=n;
		this.marks=m;
	System.out.println("In parameterized constructor");
	}
	
	void display ()
	{
	System.out.println("Roll No is : "+this.roll);
	System.out.println("Name is : "+this.name);
	System.out.println("Marks is : "+this.marks);
	}

}//Student class ends here

class Test {
	public static void main (String [] args){
		Student s1 = new Student ();
		s1.display ();
		System.out.println("\n");
		
		Student s2 = new Student (2,"ketan",90);
		s2.display ();

	
	/*	s1.setRoll (2);
		s1.setName ("ketan");
		s1.setMarks (90);
		
	s1.display();*/
	
	}// test class ends here

}// Test class ends here

						
