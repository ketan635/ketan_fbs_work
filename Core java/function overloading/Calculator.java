
class Calculator {
	
	//Addition Functions
	
	void add (int a,int b){
		System.out.println("\nAddition");
		System.out.println("Result is " +(a+b));
		System.out.println("void add (int a,int b)");
	}

	void add (int a,double d1){
		
		double c=a+d1;
		System.out.println("Result is "+c);
		System.out.println("void add (int a,double d1)");
	}

	void add (double d1,double d2){
		double d3=d1+d2;
		System.out.println("Result is "+d3);
		System.out.println("void add (double d1,double d2)");
	}

	void add (double d1,int a){
		double d3 = d1+a;
		System.out.println("Result is "+d3);
		System.out.println("void add (double d1,int a)");
	}

	//Substraction Functions
	
	void sub (int a,int b)
	{
		System.out.println("\nSubstraction");
		int c=a-b;
		System.out.println("Result is "+c);
	}
	
	void sub (double d1,double d2)
	{
		double d3=d1-d2;
		System.out.println("Result is "+d3);
	}

	void sub (int a,double d)
	{
		double c=a-d;
		System.out.println("Result is "+c);
	}

	void sub (double d,int a)
	{
		double c=d-a;
		System.out.println("Result is "+c);
	}

	//Multiplication Functions

	void multiply (int a,int b)
	{
		System.out.println("\nMultiplication");
		int c=a*b;
		System.out.println("Result is "+c);
	}
	
	void multiply (double d1,double d2)
	{
		double d3=d1*d2;
		System.out.println("Result is "+d3);
	}

	void multiply (int a,double d)
	{
		double c=a*d;
		System.out.println("Result is "+c);
	}

	void multiply (double d,int a)
	{
		double c=d*a;
		System.out.println("Result is "+c);
	}

	//Division Functions

	void divide (int a,int b)
	{
		System.out.println("\nDivision");
		int c=a/b;
		System.out.println("Result is "+c);
	}
	
	void divide (double d1,double d2)
	{
		double d3=d1/d2;
		System.out.println("Result is "+d3);
	}

	void divide (int a,double d)
	{
		double c=a/d;
		System.out.println("Result is "+c);
	}

	void divide (double d,int a)
	{
		
		double c=d/a;
		System.out.println("Result is "+c);
	}
	

}//Calculator class ends here

class Test {
	public static void main (String [] args){
		Calculator c1=new Calculator ();
		
		//addition function call	

		c1.add(23,49);
		c1.add(98,34.0);
		c1.add(678.98,789.78);
		c1.add(678.0,345);

		//substract function call

		c1.sub(90,40);
		c1.sub(98,34.0);
		c1.sub(678.98,789.78);
		c1.sub(678.0,345);		

		//Multiply function call
	
		c1.multiply(23,49);
		c1.multiply(98,34.0);
		c1.multiply(678.98,789.78);
		c1.multiply(678.0,345);

		//Devision function call

		c1.divide(123,49);
		c1.divide(98,14.0);
		c1.divide(978.98,89.78);
		c1.divide(678.0,45);
		
	}//Main method ends here

}//test class ends here
