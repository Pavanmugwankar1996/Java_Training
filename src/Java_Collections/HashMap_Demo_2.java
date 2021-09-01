package Java_Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Apple");
		al.add("Mango");
		al.add("Papaya");
		al.add("Apple");
		al.add("Apple");
		al.add("Mango");
		al.add("Cherry");
		
		//frequency
		HashMap<String, Integer> hm=new HashMap<>();
		for(String fruit:al)
		{
			if(hm.containsKey(fruit))
			{
				int curcount=hm.get(fruit);
				hm.put(fruit, curcount+1);
			}
			else
				hm.put(fruit, 1);
		}

	}

}
