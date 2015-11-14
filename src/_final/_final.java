package _final;

public class _final extends A{
	public _final(){
		 super(); //构造函数调用必须是构造函数中的第一个语句，对了 ,此处这句话隐士调用
		super.name="zzw1"; //使用super.xx 就可以调用父类的属性了
//		super.name1="zzw12";//zz这句话会报错，不能对终态字段 A.name1 赋值
		
    
	}


	public static void main(String[] args){
		
	}
	/**
	 * ，如果父类中是用的final那个方法，这时候会提示"不能覆盖 A 中的终态方法";
	 */
	public void getName(){
		
	}
}
/**
 * 
 * 类加上这个字段的时候，会提示，子类不可以继承"终态类"
 *
 */
/*final */class A{
	public static  String name="zzw";//空白终态字段 name 可能尚未初始化
	public static final String name1="zzw";
	
	
	
	
	
	/**
	      * 因为private修饰，子类中不能继承到此方法，因此，子类中的getName方法是重新定义的、
	      * 属于子类本身的方法，编译正常
	      */
	private final void getName(){
		
	}
	
	/*public final void getName(){
		
	}
	*/
	
}
