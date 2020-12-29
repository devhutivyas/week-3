package javaweek3;


	import java.util.Scanner;

	
	interface AdvancedArithmetic{
	  int divisorSum(int n);
	}

	class Calculator implements AdvancedArithmetic{

	    
	    public int divisorSum(int n) {

	        int sum = 0;

	        for(int i=1; i<=n; i++) {

	            if ((n%i)==0){
	                sum+=i;
	            }
	        }

	        return sum;
	    }
	}


	class InterfaceImplementation{

	    public static void main(String []args){

	        Calculator myCalculator = new Calculator();

	        System.out.print("I implemented: ");
	        ImplementedInterfaceNames(myCalculator);

	        System.out.print("Enter an integer number : ");

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        System.out.printf("%nThe sum of the divisors of %d is: %d",n,myCalculator.divisorSum(n));

	        sc.close();
	    }

	    
	    
	    static void ImplementedInterfaceNames(Object o){
	        Class[] theInterfaces = o.getClass().getInterfaces();
	        for (int i = 0; i < theInterfaces.length; i++){
	            String interfaceName = theInterfaces[i].getName();
	            System.out.println(interfaceName);
	        }
	    }
	}


