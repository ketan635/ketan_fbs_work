//Write a C program to convert given minutes into hours and remaining minutes
void main()
{
	int h = 1,m=44,s=35;
	
	int minits = h*60*60+m*60+s;
	printf("%d",minits);
	int nh = s/3600;
	int nm=3600;
	int temp=m/60;
	int ns =m%60;
	printf("\n%d :%d : %d",h,m,s);
	
}