

import java.util.Scanner;

class Calculator {
	
	//Addition Functions
	
	void add (int a,int b){
		System.out.println("\nAddition");
		System.out.println("Result is " +(a+b));
	}

	void add (int a,double d1){
		
		double c=a+d1;
		System.out.println("Result is "+c);
	
	}

	void add (double d1,double d2){
		double d3=d1+d2;
		System.out.println("Result is "+d3);
	
	}

	void add (double d1,int a){
		double d3 = d1+a;
		System.out.println("Result is "+d3);
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
		
		Scanner sc = new Scanner(System.in);
		Calculator c1=new Calculator ();
		
		//addition function call	
		
		System.out.println("Enter two integers for addition:");
		int a1 = sc.nextInt ();
		int b1 = sc.nextInt ();
		c1.add(a1,b1);
		
		System.out.println("Enter one integer and one double :");
		int a2 = sc.nextInt ();
		double d1 = sc.nextDouble ();
		c1.add(a2,d1);
	
		System.out.println("Enter two double :");
		double d2 =sc.nextDouble ();
		double d3 = sc.nextDouble ();
		c1.add(d2,d3);

		System.out.println("Enter one double and one interger :");
		int a3 = sc.nextInt ();
		double d4 = sc.nextDouble ();
		c1.add(a3,d4);

		//substract function call

		System.out.println("\nEnter two integers for subtraction:");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		c1.sub(s1, s2);

		System.out.println("Enter double and double for subtraction:");
		double s3 = sc.nextDouble();
		double s4 = sc.nextDouble();
		c1.sub(s3, s4);

		System.out.println("Enter int and double for subtraction:");
		int s5 = sc.nextInt();
		double s6 = sc.nextDouble();
		c1.sub(s5, s6);

		System.out.println("Enter double and int for subtraction:");
		double s7 = sc.nextDouble();
		int s8 = sc.nextInt();
		c1.sub(s7, s8);

		// Multiplication call
		System.out.println("\nEnter two integers for multiplication:");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		c1.multiply(m1, m2);

		System.out.println("Enter double and double for multiplication:");
		double m3 = sc.nextDouble();
		double m4 = sc.nextDouble();
		c1.multiply(m3, m4);

		System.out.println("Enter int and double for multiplication:");
		int m5 = sc.nextInt();
		double m6 = sc.nextDouble();
		c1.multiply(m5, m6);

		System.out.println("Enter double and int for multiplication:");
		double m7 = sc.nextDouble();
		int m8 = sc.nextInt();
		c1.multiply(m7, m8);

		// Division call
		System.out.println("\nEnter two integers for division:");
		int d11 = sc.nextInt();
		int d12 = sc.nextInt();
		c1.divide(d11, d12);

		System.out.println("Enter double and double for division:");
		double d13 = sc.nextDouble();
		double d14 = sc.nextDouble();
		c1.divide(d13, d14);

		System.out.println("Enter int and double for division:");
		int d15 = sc.nextInt();
		double d16 = sc.nextDouble();
		c1.divide(d15, d16);

		System.out.println("Enter double and int for division:");
		double d17 = sc.nextDouble();
		int d18 = sc.nextInt();
		c1.divide(d17, d18);
	
	}//Main method ends here

}//test class ends here
	
	
