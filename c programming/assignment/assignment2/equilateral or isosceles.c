// triangle is equilateral, isosceles, or scalene.
void main()
{
    int s1 = 22;
	int s2 = 26;
	int s3 = 29;
	if(s1==s2 && s2==s3)
	{
		printf("equilateral");
	}
	else if(s1==s2||s2==s3||s3==s1)
	{
		printf("isosceles");
	}else
     	{
		    printf("scalene");
    	}
			
}