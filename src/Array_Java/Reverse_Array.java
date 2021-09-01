package Array_Java;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nEnter Element for Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Reverse Array ");
		for(int i=arr.length-1;i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nAlternate Elements ");
		for(int i=arr.length-1;i>=0; i-=2)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
