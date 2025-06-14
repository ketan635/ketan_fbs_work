void main()
{
	int unit,totalpay;
	printf("enter the electricity unit :");
	scanf("%d",&unit);
	if(unit>1 && unit <50)
	{
	 totalpay=unit*30;
		printf("your total unit %d your total pay is %d ",unit,totalpay);
	}
	else if(unit>51 && unit <150)
	{
		totalpay=unit*40;
		printf("your total unit %d your total pay is %d ",unit,totalpay);
	}
	else if(unit>0=151)
	{
		totalpay=unit*50;
		printf("your total unit %d your total pay is %d ",unit,totalpay);
	}
}