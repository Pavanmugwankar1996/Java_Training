package Loops_Java;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Number: ");
		int num = sc.nextInt();
		int rem, rev=0;
		int a = num;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number is : "+rev);
		if (a==rev)
		{
			System.out.println("Given Number is Palindrom Number");
		}
		else
		{
			System.out.println("Given Number is not Palindrom Number");
		}

	}

}
