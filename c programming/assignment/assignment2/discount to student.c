
void main()
{
	double prise,tprise;
	char student ;
	printf("is student to press 'y' or not to press 'n' :");
	scanf("%c",&student);
	printf("enter a prise =");
	scanf("%lf",&prise);
	if(student=='y')
	{
		if(prise>500)
		{
			tprise=prise-prise*0.20;
			printf("total prise to paid is =%.2lf",tprise);
		}else
		{
			tprise=prise-prise*0.10;
		printf("total prise to paid is =%.2lf",tprise);
		}
	}else if(student=='n')
	{
		if(prise>600)
		{
			tprise=prise-prise*0.15;
			printf("total prise to paid is =%.2lf",tprise);
		}else
		{
		tprise=prise;
			printf("total prise to paid is =%.2lf",tprise);
		}
	}
}