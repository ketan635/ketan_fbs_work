
#include <stdio.h>
typedef struct Admin{
	int id;
	char name[30];
	double salary;
	double allowance;
}Admin;
void main (){
	Admin emp;
	printf("Enter the id : ");
	scanf("%d",&emp.id);
	printf("Enter the name :");
	scanf("%s",emp.name);
	printf("Enter the salary :");
	scanf("%lf",&emp.salary);
	printf("Enter the allowance :");
	scanf("%lf",&emp.allowance);
	
	printf("Admin id	 :%d\n",emp.id);
	printf("Name 		 :%s\n",emp.name);
	printf("Salary  	 :%.1lf\n",emp.salary);
	printf("Total salary :%.1lf",emp.allowance+emp.salary);
}
