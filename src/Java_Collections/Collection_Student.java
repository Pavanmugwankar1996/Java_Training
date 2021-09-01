package Java_Collections;

import java.util.ArrayList;

public class Collection_Student implements Comparable <Collection_Student>
{
	private String name;
	private String qua;
	private int per;
	
	public Collection_Student(String name, String qua, int per) 
	{
		super();
		this.name=name;
		this.qua=qua;
		this.per=per;
	}
	
	public Collection_Student()
	{
		
	}
	

	public String toString()
	{
		return " Student [Name= "+name+", Qualification= "+qua+" Percent= "+per+" ]";
	}
	

}
