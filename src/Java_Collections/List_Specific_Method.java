package Java_Collections;

import java.util.ArrayList;

public class List_Specific_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Ayush");
		al.add("Anand");
		
		al.add("Om");
		al.add("Akash");
		al.add(1,"Pavan");
		al.add(0,"Nisha");
		System.out.println(al.indexOf("Akash"));
		System.out.println(al.lastIndexOf("Akash"));
		
		//al.remove("Om");
		al.remove(4);
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Pavan");
		al2.add("Sachin");
		al2.add(1,"Rihan");
		al2.add(0,"Jayant");
		 
		al2.addAll(1,al);
		String t=al2.get(0);
		System.out.println(t);
		
		System.out.println(al2);
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println();
		for(String str:al2)
		{
			System.out.println(str);
		}

	}

}
