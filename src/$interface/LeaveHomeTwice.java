package $interface;

public class LeaveHomeTwice extends LeaveHomeImpl{
	String a;
	String b;

	public LeaveHomeTwice(){//��һ�ֹ��췽ʽ,
		
		super("a","b");//��ֵ��ȥ��ʱ����Զ����ø�����в����Ĺ��췽��
		
	}
	public LeaveHomeTwice(String a,String b){//�������Ĺ��췽���������˹��췽����overload�����췽��������
		
		super(a,b);//�ı��˸����ֵ
		
	}
	//������override�������ĸ��ǣ��Ը���ĸ���
	public int  tool2(int a){
		
		int  zzw;
		zzw=a;
		return zzw;
		
		
	}
	
	public static void main(String args[])
	{
		int num=123;
		LeaveHomeTwice a=new LeaveHomeTwice();//��Ӧ��һ�ֹ��췽ʽ
		//LeaveHomeTwice a=new LeaveHomeTwice("zzwtwice","aiguotwice");//��Ӧ�ڶ��ֹ��췽ʽ
		System.out.println(a.a()+"\t"+a.b()+"\t"+a.c()+"\t"+a.d()+"\t"+a.tool2(num));
		
		
		a.tools1();
		System.out.println("getAbs01:"+a.getAbs01());
		System.out.println("getAbs02:"+a.getAbs02());
	
		
	}

}
