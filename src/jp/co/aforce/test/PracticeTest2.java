package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {
	public static void main(String args[]) {
		int x=10;
		int y=28;
		double z= 3.14;
		System.out.println(x*y); 
		System.out.println(y/x); 
		
		double a= 87.92 ;
		System.out.println(a);
		System.out.println(++a);
		int age =21;
					
		

		Random rand = new Random();
	    int r = rand.nextInt(100) ;
	    if(age >=r ) {
	      System.out.println(r+"歳で私の方が年上です");
	    }  else if(age ==r ) {
	      System.out.println(r+"歳で私と同い年です");
	    }  else if(age <=r ) {
	      System.out.println(r+"歳で私より年下です");
	      
	   
	      
	  }
	}
	    
}


	  

	
	    
	


