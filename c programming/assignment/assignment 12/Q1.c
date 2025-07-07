//struct student

#include <stdio.h>
#include <string.h>
typedef struct Student {
	int rollno;
	char  name[20];
	int marks ;
	long long int mobno;
} Student;

void main (){
	Student s;
	printf("Enter the student name  :");
	scanf("%s",&s.name);
		
	printf("Enter the student rollno  :");
	scanf("%d",&s.rollno);
	
	printf("Enter the student mobno  :");
	scanf("%lld",&s.mobno);

	printf("Enter the student marks  :");
	scanf("%d",&s.marks);

	printf("Name : %s\n",s.name);
	printf("Rollno : %d\n",s.rollno);
	printf("Mobno : %lld\n",s.mobno);
	printf("Marks : %d\n",s.marks);
}
