package zzzzw.demo;

public class ExtendsService extends TestService{
	public ExtendsService()
	{
		super("doc");
	}
	/*private String a;
	public ExtendsService(String a)
	{
		super(a);
		this.a=a;
	}*/
	public static void main(String args[]){
		ExtendsService ext=new ExtendsService();
		System.out.println(ext.name());
	}

}
//�ڸ��ӹ�ϵ�������������private��ʱ������Ҫget set���ʵġ�
//super���÷�