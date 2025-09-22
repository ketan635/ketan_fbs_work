
class SumOfDigits {
	public static void main (String [] args){
	int number=124;
	int sum=0,res;
	for(int i=number;i>0;i++){
	res=number%10;
	sum=sum+res;
	number=number/10;
	}	
	System.out.println("Sum = "+sum);
      }
}
