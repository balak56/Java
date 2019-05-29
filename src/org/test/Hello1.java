package org.test;

public class Hello1 {

	 public static void main(String[] args) {
			
		  int i=45612;
		  int j, k=0, n=0;
		  
		  int t=i;
		  
		  while (t>0)
		  {
		  j=t%10;
		  k=(k*10)+j;
		  t=t/10;
		  //n++;
		  }
		  if(k==i)
		  {
		  System.out.println("Palindrome");
	 }
		  else
		  {
			  System.out.println("Not a Palindrome");
		  }
	 }
}
