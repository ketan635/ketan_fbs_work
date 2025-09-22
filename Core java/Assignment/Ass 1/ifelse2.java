public class A {

	public static void main(String[] args) {
		
		int num = 7, i = 2, n = 1; 
	    
	    if (num <= 1) {
	        n = 0; 
	    }
	    while (i < num) {
	        if (num % i == 0) {
	            n = 0; 
	        }
	        i++;
	    }
	    if (n == 1)
	    	System.out.printf("Number is prime = %d\n", num);
	    else
	    	System.out.printf("Number is not prime = %d\n", num);
	    return ;

	}

}
