public class A {

	public static void main(String[] args) {
		

		
		 float price = 3500;
		 double final_amount;
		 double discount = 10;
		    char student = 5;
		    
		    if (student == 'y' || student == 'Y') {
		        if (price > 500) {
		            discount = 0.20 * price;
		        } else {
		            discount = 0.10 * price;
		        }
		    } else {
		        if (price > 600) {
		            discount = 0.15 * price;
		        } else {
		            discount = 0.0;
		        }
		    }
		    final_amount = price - discount;
		    System.out.printf("Discount: %.2f\n", discount);
		    System.out.printf("Final amount to pay: %.2f\n", final_amount);

		    return ;
	}

}
