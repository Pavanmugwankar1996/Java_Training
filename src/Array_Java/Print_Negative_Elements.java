package Array_Java;

import java.util.Scanner;

public class Print_Negative_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nEnter Element for Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("Negative Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
			{
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("No Negative Elemenets in Array");
		}
		
		System.out.println("\n Total Number of Negative Elemenets: "+count);

	}

}
