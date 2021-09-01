package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add("P");
		a1.add("A");
		a1.add("V");
		a1.add("A");
		a1.add("N");
		a1.add("M");
		a1.add("U");
		a1.add("G");
		a1.add("W");
		a1.add("A");
		a1.add("N");
		a1.add("K");
		a1.add("A");
		a1.add("R");
		System.out.println(a1);
		//Collections.reverse(a1);
		//System.out.println(a1);
		
		int c=Collections.frequency(a1,"A");
		System.out.println("Frequency: "+c);
		
		//Collections.shuffle(a1);
		//System.out.println(a1);
		
		Collections.swap(a1,0,2);
		System.out.println(a1);
		
		Collections.sort(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		

	}

}
