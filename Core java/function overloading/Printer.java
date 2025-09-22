
class Printer {
	void print (char c)
	{
	System.out.println(c);
	}
	
	void print (int a)
	{
	System.out.println(a);
	}
	
	void print (String s)
	{
	System.out.println(s);
	}
}//Printer class ends here

class Test {
	public static void main (String [] args){
		Printer p1 = new Printer();
		p1.print('C');
		p1.print(11);
		p1.print("chaitanya");
	
	}//main method ends here

}//Test class ends here




	
