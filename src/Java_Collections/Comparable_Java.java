package Java_Collections;
import java.util.*;

public class Comparable_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Collection_Student> stud = new ArrayList<>();
		
		stud.add(new Collection_Student("Pavan", "BE", 90, 9896541224L));
		stud.add(new Collection_Student("Anand", "BE", 93, 7896541235L));
		stud.add(new Collection_Student("Rihan", "BE", 89, 8826541242L));
		stud.add(new Collection_Student("Priyanka", "BE", 80, 6796541225L));
		stud.add(new Collection_Student("Ayush", "BE", 83, 7989654127L));
		stud.add(new Collection_Student("Om", "BE", 97, 9679654120L));
		
		Collections.sort(stud);
		stud.forEach(System.out::println);
		
	}

}
