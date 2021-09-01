package Java_Collections;

import java.util.ArrayList;

public class Collections_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add("P");
		a1.add("A");
		a1.add("V");
		a1.add(new String("A"));
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
		
		System.out.println(a1.size());
		//a1.clear();
		//System.out.println(a1);
		
		a1.add("Pavan");
		System.out.println(a1);
		
		a1.remove("M");
		System.out.println(a1);
		
		System.out.println(a1.contains("Pavan"));
		
		ArrayList<String> a2=new ArrayList<>();
		a2.add("Ayush");
		a2.add("Anand");
		a2.add("Om");
		a2.add("Akash");
		a2.add("Pavan");
		
		System.out.println(a2);
		
		a2.addAll(a1);
		System.out.println(a1);
		System.out.println(a2);
		
		//a2.removeAll(a1);
		System.out.println(a1);
		System.out.println(a2);
		
		a2.retainAll(a1);
		System.out.println(a1);
		System.out.println(a2);
		
		
		System.out.println(a1.containsAll(a2));
		
		System.out.println(a1.isEmpty());
		
		
		
		

	}

}
