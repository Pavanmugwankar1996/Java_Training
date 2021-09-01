package Java_Collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("Pavan", 90);
		hm.put("Anamd", 80);
		hm.put("Ayush", 93);
		hm.put("Rihan", 87);
		hm.put("Ria", 85);
		
		System.out.println(hm.get("Pavan"));
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("Ayush"));
		System.out.println(hm.containsValue(80));
		System.out.println("----------------");
		
		// 1: To Iterate
		Set<String> kk=hm.keySet();
		System.out.println(kk);
		System.out.println("----------------");
		
		for(String k:kk)
		{
			System.out.println(k+" --> "+hm.get(k));
		}
		
		// 2: Iterate over entry object
		Set<Entry<String, Integer>> ee = hm.entrySet();
		
		for(Entry<String, Integer> e:ee)
		{
			System.out.println(e.getKey()+" --> "+e.getValue());
		}
		System.out.println("----------------");
		
		// 3: Iterrate over values of HashMap
		Collection<Integer> c=hm.values();
		for(Integer i:c)
		{
			System.out.println(i);
		}

	}

}
