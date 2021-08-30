package Loops_Java;

public class Break_Continue_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//..... Break Statement
		for(int i=0; i<=5; i++)
		{
			
			if (i==3)
			{
				System.out.println(" Break.....!");
				break;
				
			}
			System.out.println(i);
				
		}
		
		//......Continue Statement
		
		for(int i=0; i<=5; i++)
		{
			if (i==3)
			{
				System.out.println(" Continue.....!");
				continue;
				
			}
			System.out.println(i);
				
		}

	}

}
