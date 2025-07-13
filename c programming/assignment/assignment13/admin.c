typedef struct admin
{  
  int id;
  char name[20];
  float salary;
  float allowance;
}admin;

void main()
{
    admin add[5];
    for(int i=0;i<5;i++)
	storeadmin(&add[i]);
	for(int j=0;j<5;j++)
	display(add[j]);
}

void storeadmin(admin* add)
{
	printf("enter a ID :");
	scanf("%d",&add->id);
	printf("enter a Admin Name :");
	scanf("%s",add->name);	
	printf("enter a Salary :");
	scanf("%f",&add->salary);
	printf("enter a Allowance :");
	scanf("%f",&add->allowance);
	
}

void display(admin* a)
{
	printf("Admin ID: %d\nAdmin Name : %s\nAdmin Salary : %f\nAdmin Allowance : %f\n",a->id,a->name,a->salary,a->allowance);

	
}