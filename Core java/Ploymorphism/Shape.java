
class Shape {
		String color;
		int borderWidth;
		double area;
		double perimeter;
		String shapeType;
		
		Shape() {
	
			this.color = "Red";
			this.borderWidth = 2;
			this.area = 23.0;
			this.perimeter = 2.4;
			this.shapeType = "XYZ" ;
		}
		
		Shape(String color, int borderWidth, double area, double perimeter, String shapeType) {
			this.color = color;
			this.borderWidth = borderWidth;
			this.area = area;
			this.perimeter = perimeter;
			this.shapeType = shapeType;
		}

		String getColor() {
			return color;
		}

		void setColor(String color) {
			this.color = color;
		}

		int getBorderWidth() {
			return borderWidth;
		}

		void setBorderWidth(int borderWidth) {
			this.borderWidth = borderWidth;
		}

		double getArea() {
			return area;
		}

		void setArea(double area) {
			this.area = area;
		}

		double getPerimeter() {
			return perimeter;
		}

		void setPerimeter(double perimeter) {
			this.perimeter = perimeter;
		}

		String getShapeType() {
			return shapeType;
		}

		void setShapeType(String shapeType) {
			this.shapeType = shapeType;
		}
		
		void display () {
			System.out.println("Color : "+this.color);
			System.out.println("Width : "+this.borderWidth);
			System.out.println("Area  : "+this.area);
			System.out.println("Perimeter : "+this.perimeter);
			System.out.println("Shape Type : "+this.shapeType);
		}

		
}// Shape ends here

class Circle extends Shape{
	double radius;
	double diameter;
	double circumference;
	
	Circle() {
		super();
		this.radius = 12.0;
		this.diameter = 5.4;
		this.circumference = 34.0;
	}
	
	Circle(String color, int borderWidth, double area, double perimeter, String shapeType,double radius, double diameter, double circumference) {
		super(color,borderWidth,area,perimeter,shapeType);
		this.radius = radius;
		this.diameter = diameter;
		this.circumference = circumference;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	double getDiameter() {
		return diameter;
	}

	void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	double getCircumference() {
		return circumference;
	}

	void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	
	void display () {
		super.display();
		System.out.println("Radius : "+this.radius);
		System.out.println("Diameter : "+this.diameter);
		System.out.println("Circumference : "+this.circumference);
		
	}
	
}//Circle class ends here

class Triangle extends Shape {
	double base;
	double height;
	double side;

	Triangle() {
		super();
		this.base = 12.2;
		this.height = 14;
		this.side = 12;
	}
	Triangle(String color, int borderWidth, double area, double perimeter, String shapeType,double base, double height, double side) {
		super(color,borderWidth,area,perimeter,shapeType);
		this.base = base;
		this.height = height;
		this.side = side;
	}
	double getBase() {
		return base;
	}
	void setBase(double base) {
		this.base = base;
	}
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		this.height = height;
	}
	double getSide() {
		return side;
	}
	void setSide(double side) {
		this.side = side;
	}
	
	void display () {
		super.display();
		System.out.println("Base  : "+this.base);
		System.out.println("Height : "+this.height);
		System.out.println("Side  :"+this.side);
	}
	
}//Triangle  ends here

class Rectangle extends Shape {
	double length;
	double breadth;
	double diagonal;
	
	Rectangle() {
		super();
		this.length = 12;
		this.breadth = 34;
		this.diagonal = 5;
	}
	
	Rectangle(String color, int borderWidth, double area, double perimeter, String shapeType,double length, double breadth, double diagonal) {
		super(color,borderWidth,area,perimeter,shapeType);
		this.length = length;
		this.breadth = breadth;
		this.diagonal = diagonal;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	double getDiagonal() {
		return diagonal;
	}

	void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}
	
	void display () {
		super.display();
		System.out.println("Length : "+this.length);
		System.out.println("Breadth : "+this.breadth);
		System.out.println("Diagonal : "+this.diagonal);
	}
	
}//Rectangle ends here

class TestShape {
	public static void main (String [] args) {
		Shape s1 = new Shape ();
		s1.display();
		
		System.out.println();
		
		s1 = new Shape("Green",3,54,34,"XYZ");
		s1.display();
		
		System.out.println();
		
		s1 = new Circle ();
		s1.display();
		
		System.out.println();
		
		s1 = new Circle ("Green",3,54,34,"XYZ",12,23,23);
		s1.display();
		
		System.out.println();
		
		s1 = new Triangle ();
		s1.display();
		
		System.out.println();
		
		s1 = new Triangle ("Green",3,54,34,"XYZ",12,32,43);
		s1.display();
		
		System.out.println();
		
		s1 = new Rectangle ();
		s1.display();
		
		System.out.println();
		
		s1 = new Rectangle ("Green",3,54,34,"XYZ",11,12,13);
		s1.display();
	}
}