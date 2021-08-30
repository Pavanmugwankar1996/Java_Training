package Loops_Java;

import java.util.Scanner;

public class Palindrom_Number_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Start and End Number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int rem; 
		
		for(int i=num1; i<=num2; i++)
		{
			int a = i;
			int rev=0;
			
			
			while(a!=0)
			{	
				rem=a%10;
				rev=rev*10+rem;
				a=a/10;
				
			}
			//System.out.println("Reverse Number is : "+rev);
			if (i==rev)
			{
				System.out.println(i);
			}
			
		}
	}

}
