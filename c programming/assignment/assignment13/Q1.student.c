struct student
{
	int rollnum;
	char name[20];
	int mark;
};
void main()
{
	struct student s1,s2;
    s1.rollnum=101;
    
    strcpy(s1.name,"ketan");
    
    s1.mark=55;
     printf("Roll Num :%d\nStudent Name :%s\nSub Mark :%d\n",s1.rollnum,s1.name,s1.mark);
     
    s2.rollnum;
    printf("enter the roll num :");
    scanf("%d",&s2.rollnum);
    
    s2.name;
    printf("enter the Student name :");
    scanf("%s",&s2.name);
    
    s2.mark;
    printf("enter the Sub Mark :");
    scanf("%d",&s2.mark);
    
     printf("Roll Num :%d\nStudent Name :%s\nSub Mark :%d\n",s2.rollnum,s2.name,s2.mark);
}