class Armstrong {
public static void main(String [] args){
		int number=153,sum=0,digit=1;
		int temp=number;
		int power=1;
		for(int i=number;i>0;i++){
		digit=number%10;
		power=digit*digit*digit;
		sum=sum+power;
		number=number/10;
		}
		if(temp==sum)
		System.out.println("Number is Armstrong");
		else
		System.out.println("Number is not Armstrong");
	}
}
