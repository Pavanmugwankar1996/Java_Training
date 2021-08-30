package Classes_And_Objects;

public class Calculator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		
		int x=7;
		int y=6;
		
		System.out.println("Addition :"+cal.sum(x,y));
		System.out.println("Substraction :"+cal.sub(x,y));
		System.out.println("Multiplication :"+cal.mul(x,y));
		System.out.println("Division :"+cal.div(x,y));

	}

}
