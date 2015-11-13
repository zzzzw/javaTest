package $interface;

public abstract class AbstractTools {
	private String abs01;
	private String abs02;
	public AbstractTools(String abs01,String abs02)
	{
		this.abs01=abs01;
		this.abs02=abs02;
	}
	
	public void tools1() {
		System.out.println("zzw abstract");
	}
	public abstract int tool2();
	
	
	public void setAbs01(String abs01)
	{
		this.abs01=abs01;
	}
	public String getAbs01()
	{
		return abs01;
	}
	public void setAbs02(String abs02)
	{
		this.abs02=abs02;
	}
	public String getAbs02()
	{
		return abs02;
	}
}
