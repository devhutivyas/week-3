package javaweek3;


	import java.util.*;

	
	abstract class Book{
	    String title;
	    abstract void setTitle(String s);
	    String getTitle(){
	        return title;
	    }
	}


	class MyBook extends Book{

	    @Override
	    void setTitle(String s) {
	        this.title = s;
	    }

	}

	public class Abstractclass{

	    public static void main(String []args){

	        System.out.print("Enter a Title: ");

	        Scanner sc=new Scanner(System.in);
	        String title=sc.nextLine();


	        MyBook novel = new MyBook();
	        novel.setTitle(title);
	        System.out.println("\nThe title is: " + novel.getTitle());

	        sc.close();

	    }
	}

