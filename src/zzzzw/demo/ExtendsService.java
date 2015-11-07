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
//在父子关系，父类中如果是private的时候是需要get set访问的。
//super的用法