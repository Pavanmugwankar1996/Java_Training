package Java_Collections;

public class Collection_Student implements Comparable <Collection_Student>
{
	private String name;
	private String qualification;
	private int per;
	private long mobile;
	
	public Collection_Student(String name, String qualification, int per, long mobile) 
	{
		super();
		this.name=name;
		this.qualification=qualification;
		this.per=per;
		this.mobile=mobile;
	}
	
	public Collection_Student()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getPercent() {
		return per;
	}

	public void setPercent(int percent) {
		this.per = percent;
	}
	
	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	public String toString() {
		return "Student [name=" + name + ", qualification=" + qualification +  ", percent="+ per + ", mobile=" + mobile + "]";
	}

	
	public int compareTo(Collection_Student o) {
		
		
		  if(o.per<this.per) return -1; 
		  else if(o.per>this.per) return 1; 
		  else 
			  return 0; 
		  //return
		  //o.name.compareTo(this.name);
		 
		
			/*
			 * if(o.name.length()<this.name.length()) return -1; else
			 * if(o.name.length()>this.name.length()) return +1; else return 0;
			 */
			
	}	

}
