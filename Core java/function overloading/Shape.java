class Shape {
 	void calculateArea (Triangle t)
	{
		double area=0.5*t.getHeight()*t.getBase () ;
		System.out.println("Area of Triangle :"+area);

	}

	void calculateArea (Circle c)
	{
		double area=3.14 * (c.getRadius () * c.getRadius ());
		System.out.println("Area of Circle :"+area);

	}


	void calculateArea (Rectangle r)
	{
		double area=r.getLength()*r.getBreadth();
		System.out.println("Area of Rectangle :"+area);
	
	}
}//Shape class ends here

class Triangle {
	double base,height;
	
	Triangle (){
		this.base = 0;
		this.height=0;
	}
	
	Triangle (double base,double height){
		this.base = base;
		this.height=height;
	}
	
	//Setters
	
	void setBase (double b)
	{
		this.base=b;
	}

	void setHeight (double h)
	{
		this.height=h;
	}
															
	//getters
	
	double getBase ()
	{
		return this.base;
	}

	double getHeight ()
	{
		return this.height;
	}
	
	void display ()
	{
		System.out.println("Base ="+this.base);
		System.out.println("Base ="+this.height);
	}

}//Triangle class ends here

class Circle {
	double radius;
	
	Circle (){
		this.radius=4;
	}
	
	Circle (double r){
		this.radius=r;
	}

	void setRadius (double r)
	{
		this.radius=r;
	}
	
	double getRadius ()
	{
		return this.radius;
	}

	void display ()
	{
		System.out.println("Radius :"+this.radius);
	}

}//class circle ends here

class Rectangle {
	double length;
	double breadth;
	
	Rectangle (){
		this.length=1;
		this.breadth=1;
	}

	Rectangle (double l, double b){
		this.length=l;
		this.breadth=b;
	}

	void setLength (double l)
	{
		this.length=l;
	}

	void setBreadth (double b)
	{
		this.breadth=b;
	}

	double getLength ()
	{
		return this.length;	
	}

	double getBreadth ()
	{
		return this.breadth;	
	}

	void display ()
	{
		System.out.println ("Lenght :"+this.length);
		System.out.println ("Breadth :"+this.breadth);
	}
	
	
}//Rectangle ends here
	
class Test {	
	public static void main (String [] args){
		Shape s1=new Shape();
		
		Triangle t1=new Triangle(5,3);
		t1.display ();
		s1.calculateArea (t1);
		
		Circle c1 = new Circle (5);
		c1.display();
		s1.calculateArea (c1);
		
		Rectangle r1=new Rectangle (5,3);
		r1.display();
		s1.calculateArea(r1);
	
	}//main method ends here

}//test class ends here
		
 	




	
	