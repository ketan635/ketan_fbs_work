struct employee
{
	int id;
	char name[20];
	float salary;
};
void main()
{
	struct employee e1,e2;
    e1.id;
    printf("enter the employee ID :");
    scanf("%d",&e1.id);
    
    e1.name;
    printf("enter the employee Name :");
    scanf("%s",&e1.name);
    
    e1.salary;
    printf("enter the employee salary :");
    scanf("%f",&e1.salary);
    
     printf("Emp ID :%d\nEmp Name :%s\nEmp Salary :%f\n",e1.id,e1.name,e1.salary);
     
    e2.id;
    printf("enter the employee ID :");
    scanf("%d",&e2.id);
    
    e2.name;
    printf("enter the employee Name :");
    scanf("%s",&e2.name);
    
    e2.salary;
    printf("enter the employee salary :");
    scanf("%f",&e2.salary);
    
    
      printf("Emp ID :%d\nEmp Name :%s\nEmp Salary :%f\n",e2.id,e2.name,e2.salary);
}