package String_java;

import java.util.Scanner;

public class String_Methods_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Full Name :");
		String str=sc.nextLine();
		String a=str.toUpperCase();
		String b=str.toLowerCase();
		char c= str.charAt(str.length()-1);
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println(c);

	}

}
