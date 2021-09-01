package Java_Collections;

import java.util.*;

public class Swap_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ali= new ArrayList<>();
		ali.add(11);
		ali.add(17);
		ali.add(13);
		ali.add(19);
		ali.add(12);
		ali.add(20);
		ali.add(15);
		ali.add(18);
		ali.add(14);
		ali.add(16);
		System.out.println(ali);
		
		System.out.println();
		Collections.sort(ali);
		System.out.println(ali);

		Collections.swap(ali, 2, 4 );
		System.out.println(ali);
		
	}

}
