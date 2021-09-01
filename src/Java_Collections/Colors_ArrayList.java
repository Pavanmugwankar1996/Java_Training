package Java_Collections;

import java.util.ArrayList;

public class Colors_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Green");
		al.add("Yellow");
		al.add("Green");
		al.add("Blue");
		al.add("Orange");
		al.add("White");
		
		System.out.println(al);
		
		al.set(1, "Red");
		System.out.println(al);
		
		

	}

}
