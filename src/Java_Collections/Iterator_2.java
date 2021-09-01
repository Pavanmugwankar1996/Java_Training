package Java_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Ayush");
		al.add("Anand");
		al.add("Om");
		al.add("Akash");
		al.add("Pavan");
		al.add("Nisha");
		
		Iterator<String> i=al.iterator();
		
		for(String s:al)
		{
			System.out.println(al);
		}


	}

}
