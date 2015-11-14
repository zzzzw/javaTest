package $interface;

public class LeaveHomeTwice extends LeaveHomeImpl{
	String a;
	String b;

	public LeaveHomeTwice(){//第一种构造方式,
		
		super("a","b");//传值进去的时候会自动调用父类的有参数的构造方法
		
	}
	public LeaveHomeTwice(String a,String b){//带参数的构造方法，体现了构造方法的overload，构造方法的重载
		
		super(a,b);//改变了父类的值
		
	}
	//方法的override，方法的覆盖，对父类的覆盖
	public int  tool2(int a){
		
		int  zzw;
		zzw=a;
		return zzw;
		
		
	}
	
	public static void main(String args[])
	{
		int num=123;
		LeaveHomeTwice a=new LeaveHomeTwice();//对应第一种构造方式
		//LeaveHomeTwice a=new LeaveHomeTwice("zzwtwice","aiguotwice");//对应第二种构造方式
		System.out.println(a.a()+"\t"+a.b()+"\t"+a.c()+"\t"+a.d()+"\t"+a.tool2(num));
		
		
		a.tools1();
		System.out.println("getAbs01:"+a.getAbs01());
		System.out.println("getAbs02:"+a.getAbs02());
	
		
	}

}
