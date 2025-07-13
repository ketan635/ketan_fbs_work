//Product (id, name, quantity, price)
typedef struct product
{  
  int id;
  char name[20];
  int quntity;
  float price;
}product;

void main()
{
    product add[2];
    for(int i=0;i<2;i++)
	storeproduct(&add[i]);
	for(int j=0;j<2;j++)
	display(add[j]);
}

void storeproduct(product* add)
{
	printf("enter a ID :");
	scanf("%d",&add->id);
	printf("enter a product Name :");
	scanf("%s",add->name);	
	printf("enter a quntity :");
	scanf("%d",&add->quntity);
	printf("enter a price :");
	scanf("%f",&add->price);
	
}

void display(product* a)
{
	printf("product ID: %d\nproduct Name : %s\nproduct quntity : %.2d\nproduct price : %.2f\n",a->id,a->name,a->quntity,a->price);
}