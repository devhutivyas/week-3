package javaweek3;

 
	import java.util.Scanner;


     class MyCalculator {

	    long power(int n, int p) throws Exception{

	        long pwr = 1;

	        if ((n==0) || (p==0)) {
	           throw new Exception("n and p should not be zero");
	        } else if ((n<0) || (p<0)) {
	           throw new Exception("n or p should not be negative");
	        }


	        for (int i=0;i<p; i++) {
	            pwr *= n;
	        }

	        return pwr;
	    }
	    
	    public class ExceptionGeneration {


	    static MyCalculator myCalculator = new MyCalculator();
	    static Scanner in = new Scanner(System.in);

	    public static void main(String[] args) {

	        System.out.print("Enter n: ");
	        int n = in.nextInt();

	        System.out.print("\nEnter p: ");
	        int p = in.nextInt();

	        try {

	            System.out.printf("%n%d to the power of %d is: %d %n",n,p,myCalculator.power(n,p));
	            
	        } catch (Exception e) {
	            System.out.println(e.getMessage());

	        }

	    }
	

}
