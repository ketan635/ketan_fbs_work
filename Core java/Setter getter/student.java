
class Student {
	int roll;
	String name;
	int marks;

	void setRoll(int r)
	{
		this.roll=r;

	}

	void setName(String n)
	{
		this.name=n;

	}

	void setMarks(int m)
	{
		this.marks=m;
	}

	int getRoll ()
	{
		return this.roll;

	}

	String getName()
	{
		return this.name;
	}

	int getMarks()
	{
		return this.marks;
	}

	
	void display()
	{
	System.out.println("roll no is : "+this.roll);
	System.out.println("name is : "+this.name);
	System.out.println("marks is : "+this.marks);

	}
}

class Test {
	public static void main (String [] args) {
	Student s1= new Student ();
	s1.setRoll (11);
	s1.setName ("chetan");
	s1.setMarks (100);

	s1.display();

	}
}

	