
//Program for Print the Square of number 1 to n.
package Loops_Java;

import java.util.Scanner;

public class Number_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Number: ");
		int num = sc.nextInt();
		
		System.out.println("Square of a Numbers :");
		for(int i=1; i<=num; i++)
		{
			System.out.println(i+" Square is : "+i*i);
		}

		

	}

}
