package org.test;

public class Hello {
	
	  public static void main(String[] args) {
		
		  int i=45612;
		  int j=0, k=0, n;
		  
		  n=i;
		  
		  while (i>0)
		  {
		  k=i%10;
		  j=(j*10)+k;
		  i=i/10;
		  }
		  System.out.println(j);
		  
		  }
	  
}
