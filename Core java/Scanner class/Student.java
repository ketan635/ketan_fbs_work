import java.util.Scanner;



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
		this.marks=99;
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
		Scanner sc=new Scanner (System.in);
		Student s1 = new Student ();
		s1.display ();
		System.out.println("\n");
		

		System.out.println("Enter the roll No:");
		int roll =  sc.nextInt ();
		sc.nextLine();
		System.out.println("Enter the name:");
		String name =  sc.nextLine ();
		
		System.out.println("Enter the marks:");
		double marks =  sc.nextDouble ();
		
		Student s2 = new Student (roll,name,marks);
		s2.display ();

	
	}// test class ends here

}// Test class ends here

						
