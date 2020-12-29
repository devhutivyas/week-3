package javaweek3;


	class Arithmetic{

	    int add(int a, int b) {
	        return a + b;
	    }
	}

	class Adder extends Arithmetic{

	}

	public class Inheritance{

	  public static void main(String []args){

	      Adder a = new Adder();

	      System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

	      System.out.printf("%d %d %d %n",a.add(10,32),a.add(10,3),a.add(10,10));
	      
	   }
	}


