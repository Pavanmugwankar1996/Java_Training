package Loops_Java;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Start And End Number : ");
		int startnum=sc.nextInt();
		int endnum=sc.nextInt();
		System.out.println("Even Number in The given series are: ");
		for(int i=startnum; i<=endnum; i++)
		{
			if (i%2==0)
				System.out.print(" "+i);
		}
		
		


	}

}
