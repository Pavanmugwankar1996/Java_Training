package Array_Java;

import java.util.Scanner;

public class Print_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr1= {20, 14, 35, 87, 15, 64};
		for(int a:arr1)
		{
			System.out.print(" "+a);
		}
		
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Element for Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" " +arr[i]);
		}

	}

}
