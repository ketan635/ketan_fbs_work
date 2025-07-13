typedef struct date
{
	int day,month ,year;
}date;

typedef struct student
{    char name[20];
	int rollno;
	date dob;
}student;

void main()
{
	student s1,s2;
	storestudent(&s1);
	storestudent(&s2);
	display(&s2);

void storestudent(student* stud)
{
	printf("enter a name :");
	scanf("%s",stud->name);
	printf("enter a rollno :");
	scanf("%d",&stud->rollno);	
}

void display(student* s1)
{
	printf("name %s \n:",s1->name);
	printf("roll no %d \n:",s1->rollno);
	
}