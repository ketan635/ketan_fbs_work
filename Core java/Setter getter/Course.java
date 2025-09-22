
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
		this.courseName= n;
	}


	void setFees (double f)
	{
		this.fees=f;
	}

	int getId ()
	{
		return this.courseId;
	}

	String getCourseName ()
	{
		return this.courseName;
	}

	double getFees	()
	{
		return this.fees;
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
			
		c1.setCourseId (30);
		c1.setCourseName ("Java Fullstack");
		c1.setFees (30000);
		c1.display ();

	}//main method ends here

}//Test class ends here

