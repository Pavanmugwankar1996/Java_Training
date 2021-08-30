
// Write a program to print Prime number between from given series;

package Loops_Java;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Start And End Number : ");
		int startnum=sc.nextInt();
		int endnum=sc.nextInt();
		
		
		for(int i=startnum; i<=endnum; i++)
		{
			int flag = 0; 
			for(int j=2; j<=i/2; j++)
			{
				if (i%j==0)
				{
				
					flag++;
					break;
					
				}	
				
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
		
		
		

	}

}
