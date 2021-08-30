
// Program for printing a tabale for given number.

package Loops_Java;

import java.util.Scanner;

public class Ptint_Table_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Number: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}

	}

}
