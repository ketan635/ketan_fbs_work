public class Leapyear{

	public static void main(String[] args) {
		

		int year = 2004;
		
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	{
		System.out.printf(" leap year %d",year);
	}
	else
	{
		System.out.printf(" not leap year %d",year);
	}
		
	}

}
   