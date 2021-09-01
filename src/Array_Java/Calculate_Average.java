package Array_Java;

import java.util.Scanner;

public class Calculate_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nEnter Element for Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		int sum=0, avg;
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" " +arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("\nArray length is: "+arr.length);
		avg=sum/arr.length;
		System.out.println("\nAverage of a Array elements is: "+avg);

	}

}
