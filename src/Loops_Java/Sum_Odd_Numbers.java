package Loops_Java;

import java.util.Scanner;

public class Sum_Odd_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner (System.in);
		int sum=0;
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		System.out.println("Odd Number in The given series are: ");
		for(int i=1; i<=num; i++)
		{
			if (i%2==1)
			{
				System.out.print(" "+i);
				sum=sum+i;
			}
		}
		System.out.println("\nSum of All Odd Numbers is: "+sum);
		

	}

}
