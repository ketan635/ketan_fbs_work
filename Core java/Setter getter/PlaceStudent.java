
class PlacedStudent {
	String name,designation;	
	int distance;

	void setName (String n)
	{
		this.name=n;
	}
	
	void setDesignation (String d)
	{
		this.designation=d;
	}
	
	void setDistance (int dis)
	{
		this.distance=dis;
	}

	String getName ()
	{
		return this.name;
	}

	String getDesignation ()
	{
		return this.designation;
	}

	int getDistance ()
	{
		return this.distance;
	}

	void display ()
	{
	System.out.println("Student name is  :"+this.name);
	System.out.println("Designation is :"+this.designation);
	System.out.println("Distance is :"+this.distance +"km");
	}
	

}// PlaceStudent class ends here

class Test {
	public static void main (String [] args){
		PlacedStudent p1 = new PlacedStudent ();
		
		p1.setName("Chaitanya");
		p1.setDesignation("Designation");
		p1.setDistance (255);

		p1.display ();

	}//main method ends here

}//Place student class ends here
	
	
	
