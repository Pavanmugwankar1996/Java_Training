package Classes_And_Objects;

import java.util.Scanner;

public class Account {
	
	int balance=0;
	
	
	void Insert(int acc_no, String name)
	{
		acc_no=acc_no;
		name=name;
	}
	
	void Display(int acc_no, String name)
	{
		System.out.println("Customer Account Number is: "+acc_no);
		System.out.println("Customer Name is: "+name);
	}
	
	void Deposite(long dep_amount)
	{
		balance+=dep_amount;
		System.out.println("Deposited Amount : "+dep_amount);
	}
	
	void Withdraw(long wd_amount)
	{
		balance -= wd_amount;
		System.out.println("Withdraw Amount : "+wd_amount);
	}
	
	
	  long Avl_balance(long balance)
	 {
		  return balance;
	  
	 }
	  
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Account ac = new Account();
		System.out.println("Enter Customer Account Number: ");
		int acc_no=sc.nextInt();
		
		System.out.println("Enter Customer Name: ");
		String name=sc.next();
		
		
		System.out.println("Enter Deposite Amount: ");
		long dep_amount=sc.nextLong();
		
		System.out.println("Enter Withdraw Amount: ");
		long wd_amount=sc.nextLong();
		
		
		
		ac.Display(acc_no, name);
		ac.Deposite(dep_amount);
		ac.Withdraw(wd_amount);
		//System.out.println("Available Balance : "+ac.Avl_balance(balance));
		
		
		
		
		
		

	}

}
