import java.util.Scanner;


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
	
	PlacedStudent ()
	{
		this.name="chaitanya";
		this.designation="designation";
		this.distance=100;
	System.out.println("Default Constructor");
	
}
	PlacedStudent (String n,String desig,int d)
	{
		this.name=n;
		this.designation=desig;
		this.distance=d;
	System.out.println("Parameterized Constructor");
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
		Scanner sc=new Scanner(System.in);
		PlacedStudent p1 = new PlacedStudent ();
		p1.display ();
		System.out.println("\n");
		
		System.out.println("enter the name : ");
		String name=sc.nextLine();

		System.out.println("enter the designation :");
		String desig=sc.nextLine();

		System.out.println("enter the distance :");
		int distance=sc.nextInt();

	
		PlacedStudent p2=new PlacedStudent (name,desig,distance);
		p2.display();

	}//main method ends here

}//Place student class ends here
	
	
	
