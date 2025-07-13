//HR (id, name, salary, commission)

typedef struct HR
{  
  int id;
  char name[20];
  float salary;
  float commission;
}HR;

void main()
{
    HR add[2];
    for(int i=0;i<2;i++)
	storeHR(&add[i]);
	for(int j=0;j<2;j++)
	display(add[j]);
}

void storeHR(HR* add)
{
	printf("enter a ID :");
	scanf("%d",&add->id);
	printf("enter a HR Name :");
	scanf("%s",add->name);	
	printf("enter a Salary :");
	scanf("%f",&add->salary);
	printf("enter a commission :");
	scanf("%f",&add->commission);
	
}

void display(HR* a)
{
	printf("HR ID: %d  HR Name : %s  HR Salary : %.2f  HR commission : %.2f\n",a->id,a->name,a->salary,a->commission);

	
}