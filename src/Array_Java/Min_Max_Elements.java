package Array_Java;

import java.util.Scanner;

public class Min_Max_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nEnter Element for Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr.length;
		int max=arr.length;
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];	
			}
			else if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minium Element is: "+min);
		System.out.println("Maximum Element is: "+max);

	}

}
