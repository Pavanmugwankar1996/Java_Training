package Array_Java;

import java.util.Iterator;

public class Copy_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,2,3,4,5};
		for(int a: arr)
		{
			System.out.print(" "+a);
		}
		System.out.println("\n");
		int [] arr2 = arr;
		for(int b: arr2)
		{
			System.out.print(" "+b);
		}
		


	}

}
