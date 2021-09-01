package Java_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Method {

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
		while(i.hasNext())
		{
			String data =i.next();
			System.out.println(data);
		}

	}

}
