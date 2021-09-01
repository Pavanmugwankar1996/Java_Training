package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Custom_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Collection_Student> al = new ArrayList<>();
		al.add(new Collection_Student("Pavan", "BE",90,9890007878l));
		al.add(new Collection_Student("Om", "BE",87,9890007878l));
		al.add(new Collection_Student("Raj", "BE",89,9890007878l));
		al.add(new Collection_Student("Anand", "BE",91,9890007878l));
		al.add(new Collection_Student("Priya", "BE",92,9890007878l));
		al.add(new Collection_Student("Ayushi", "BE",93,9890007878l));
		al.add(new Collection_Student("Abhijeet", "BE",90,9890007878l));
		
		Collections.sort(al);
		
		for(Collection_Student ob:al)
			System.out.println(ob);

	}

}
