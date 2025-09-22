import java.util.Scanner;


class Car {
	String brand,model;
	int year;
	double price;


	void srtModel (String mod)
	{
		this.model=mod;
	}

	void setBrand (String br)
	{
		this.brand=br;
	}

	void setYear(int y)
	{
		this.year=y;
	}
	
	void setPrice(double pri)
	{
		this.price=pri;
	}

	String getModel()
	{
		return this.model;
	}

	String getBrand()
	{
		return this.brand;
	}

	double getPrice()
	{
		return this.price;
	}

	Car ()
	{
		this.model="2025A";
		this.brand="TATA";
		this.year=2004;
		this.price=1900000;
		System.out.println("in default consttuctor");
	}


Car (String m,String b, int y,double p)

	{
		this.model=m;
		this.brand=b;
		this.year=y;
		this.price=p;
		System.out.println("in parameterized constructor");
	}

	void display()
	{
	System.out.println("model name is :"+this.model);
	System.out.println("brand is :"+this.brand);
	System.out.println("year is :"+this.year);
	System.out.println("price is :"+this.price);
	}
}



	class Test {

		public static void main(String [] args) {
		Scanner sc= new Scanner (System.in);

		Car c1=new Car();
		c1.display();
		System.out.println();

		System.out.println("enter the model name");
		String model = sc.nextLine();

		System.out.println("enter the brand name");
		String brand =sc.nextLine();

		System.out.println("enter the year");
		int year = sc.nextInt();

		System.out.println("enter the price");
		double price = sc.nextDouble();

		System.out.println();



		Car c2=new Car(model,brand,year,price);
		c2.display();
	}
}
