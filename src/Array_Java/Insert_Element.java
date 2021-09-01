package Array_Java;

import java.util.Scanner;

public class Insert_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nEnter Element for Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+" Element: ");
			arr[i]=sc.nextInt();
			System.out.println();
		}
		
		System.out.println("Array Elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
