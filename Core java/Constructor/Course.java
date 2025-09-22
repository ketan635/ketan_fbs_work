class Course {
	int courseId;
	String courseName;
	double fees;

	void setCourseId (int id)
	{
		this.courseId=id;
	}

	void setCourseName (String n)
	{
		this.courseName=n;
	}

	void setFees (double f)
	{
		this.fees=f;
	}
	
	int getId()
	{
		return this.courseId;
	}

	String getCourseName()
	{
		return this.courseName;
	}

	double getFees()
	{
		return this.fees;
	}

	Course ()
	{
		this.courseId=11;
		this.courseName="java fullstack";
		this.fees=40000;
	System.out.println("In Default Constructor");
}

Course (int i,String n,double f)
{
	this.courseId=i;
	this.courseName=n;
	this.fees=f;
	System.out.println("In Parameterized Constructor");
}

void display ()
	{
	System.out.println("Course Id name is :" + this.courseId);
	System.out.println("Course name  is :"+this.courseName);
 	System.out.println("Course fees is:"+this.fees);
	}
			
}//car class ends here


class Test {
	public static void main (String [] args){
		Course c1=new Course();
		c1.display ();
		System.out.println("\n");	

		Course c2=new Course(31,"python Fullstack",40000);
		c2.display();
	}
}
