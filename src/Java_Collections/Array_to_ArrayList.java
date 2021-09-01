package Java_Collections;

import java.util.*;

public class Array_to_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"P", "A", "V", "A", "N"};
		for(String a:arr)
		{
			System.out.print(" "+a);
		}
		System.out.println();
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		al.add("D");
		al.add("Y");
		System.out.println(al);

	}

}
