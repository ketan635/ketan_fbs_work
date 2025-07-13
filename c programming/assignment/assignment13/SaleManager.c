// SalesManager (id, name, salary, incentive, target)
typedef struct SalesManager
{
	int id;
	char name[20];
	float salary;
	float incentive;
	int target;
}SalesManager;
void main()
{
	SalesManager add[2];
    for(int i=0;i<2;i++)
	storeSalesManager(&add[i]);
	for(int j=0;j<2;j++)
	display(add[j]);
}

void storeSalesManager(SalesManager* add)
{
	printf("enter a ID :");
	scanf("%d",&add->id);
	printf("enter a HR Name :");
	scanf("%s",add->name);	
	printf("enter a Salary :");
	scanf("%f",&add->salary);
	printf("enter a commission :");
	scanf("%f",&add->incentive);
	printf("enter a target :");
	scanf("%f",&add->target);
	
}

void display(SalesManager* S)
{
	printf("SalesManager ID: %d  SalesManager Name : %s  SalesManager Salary : %.2f  SalesManager commission : %.2f\n",S->id,S->name,S->salary,S->incentive,S->target);

	
}