package org.test;

import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		
		int i=0, rev=0;
		
		while(k>0)
		{
			i=k%10;
			rev=rev*10+i;
			k=k/10;
		}

		System.out.println("Enter number"+rev);
		
	}
}
