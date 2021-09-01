package Array_Java;

import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nEnter Element for Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Element you want to Search: \n");
		int search=sc.nextInt();
		int flag=0;

		for(int i=0; i<arr.length; i++)
		{
			if(search == arr[i])
			{
				flag=1;
				System.out.println(search+" Element Found on index: "+i);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element Not Found: ");
		}

	}

}
