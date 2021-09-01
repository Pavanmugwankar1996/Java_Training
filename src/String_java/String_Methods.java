package String_java;

import java.util.Arrays;
import java.util.Scanner;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1 = new String("Pavan");
		String s2 = new String("Mugwankar");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s1.concat(s2));
		
		int idx = s1.indexOf('v');
		System.out.println(idx);
		int idx1 = s1.indexOf('a');
		System.out.println(idx1);
		int idx2 = s1.indexOf('a',idx+1);
		System.out.println(idx2);
		
		String str = new String("ThinkQuotient");
		String str1 = str.substring(2,5);
		System.out.println(str1);
		
	}

}
