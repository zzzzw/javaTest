package $interface;

public class LeaveHomeImpl extends AbstractTools implements ILeaveHome{
	

	public LeaveHomeImpl(String a,String b){
		super(a, b);//调用父类的构造方法
		
		
	}
	public int  tool2(){
		int a=6666;		
		return a;
		
	}
	public int a(){
		int a=1;
		return a;
	}
	public int b(){
		int b=1;
		return b;
	}
	public int c(){
		int c=1;
		return c;
	}
	public int d(){
		int d=1;
		return d;
	}

	public static void main(String args[])
	{
		String z="z";
		String z6="z6";
		LeaveHomeImpl home=new LeaveHomeImpl(z,z6);
		System.out.println("home.a()="+home.a());
		System.out.println("home.b()="+home.b());
		System.out.println("home.c()="+home.c());
		System.out.println("home.d()="+home.d());	
		System.out.println("home.tool2()="+home.tool2());
		System.out.println("getAbs01="+home.getAbs01());
		System.out.println("getAbs02="+home.getAbs02());
		home.tools1();
		
	}
	

}
