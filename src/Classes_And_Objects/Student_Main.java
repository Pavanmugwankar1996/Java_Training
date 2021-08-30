package Classes_And_Objects;

public class Student_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student stud = new Student();
		 Student stud1 = new Student();
		 Student stud2 = new Student();
		 
		 //Print Object 
		 System.out.println(stud);
		 System.out.println(stud1);
		 
		 //print values of Student class
		 int id=stud.id;
		 String name=stud.name;
		 System.out.println(id);
		 System.out.println(name);
		 
		 //calling Display Method
		 stud.display(id,name);
		 
		 
		 
		

	}

}
