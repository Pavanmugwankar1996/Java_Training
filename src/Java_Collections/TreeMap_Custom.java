package Java_Collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_Custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Employee,Integer> tm=new TreeMap<>(new myEmployeeComparator());
		tm.put(new Employee(101,"Pavan",90000), 90);
		tm.put(new Employee(100,"Aniket",80000), 90);
		tm.put(new Employee(11,"Amar",100000), 90);
		tm.put(new Employee(120,"Om",60000), 90);
		
		System.out.println(tm);

	}

}
