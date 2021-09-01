package Java_Collections;

import java.util.HashMap;

public class HashMap_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm=new HashMap<>();
		for (int i=1; i<=11; i++)
		{
			hm.put(i, "A"+i);
		}
		
		hm.put(17, "A");
		hm.put(17, "B");
		hm.put(17, "C");
		

	}

}
