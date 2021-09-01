package Array_Java;

import java.util.Scanner;

public class Even_Odd_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		int[] arr1 = new int[10];
		int[] arr2= new int[10];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nEnter Element for Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("\nEven Numbers: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				arr1[i]=arr[i];
				System.out.print(arr1[i]+" ");
			}
		}
		
		System.out.println("\nOdd Numbers: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==1)
			{
				arr2[i]=arr[i];
				System.out.print(arr2[i]+" ");
			}
		}

	}

}
