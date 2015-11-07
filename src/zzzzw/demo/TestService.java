package zzzzw.demo;

public class TestService {
	private String name;
	public TestService(String name)
	{		
		this.name=name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String name()
	{
		return name;
	}
	public static void main(String args[])
	{
		TestService a=new TestService("zzw");
		System.out.println(a.name);
	}
	

}
/*public class TestService{
	private String name;
	public TestService(String name){
		this.name=name;
	}
	public void setname(String name){
		this.name=name;
	}
	public String name()
	{
		return name;
	}
	public static void main(String args[])
	{
		TestService a=new TestSerive("zzw");
		System.out.println("a.name");
	}
}*/
