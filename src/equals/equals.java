package equals;

/*public class equals {
	//基本数据类型跟引用数据类型（复合数据类型）,
	 //在引用数据类型中equals方法被重写，一般用来比较内存地址
	public static void main(String args[])
	{
		String a="zengzhiwei";
		String b="zengzhiwei";//指向同一个引用
		if(a==b)//比较内存地址
		{
			System.out.println("a==b");			
		}
		else{
			System.out.println("a!=b");
		}
		if(a.equals(b))//比较值
		{
			System.out.println("a equals b");
		}
		else{
			System.out.println("a not equals b");
		}
		
	}
		*//**
	 * 		a==b
			a equals b
	 *//*

}*/
/*public class equals{
	public static  void main(String args[])
	{
		String a="zengzhiwei";
		String b=new String("zengzhiwei");
		if(a==b)//比较内存地址
		{
			System.out.println("a==b");			
		}
		else{
			System.out.println("a!=b");
		}
		if(a.equals(b))//比较值
		{
			System.out.println("a equals b");
		}
		else{
			System.out.println("a not equals b");
		}
		
	}
	*//**
	 * 		a!=b
			a equals b
	 *//*
	

}*/
//对于复合型数据，如果没有覆盖（重写）equals（）方法的话还是是比较的“内存地址”
public class equals{
	public static void main(String args[])
	{
		String a="zengzhiwei";
		String b=new String("zengzhiwei");
		b.intern();//检查字符串池里是否存在"zengzhiwei"这么一个字符串，如果存在，就返回池里的字符串；
				   //如果不存在，该方法会 把"zengzhiwei"添加到字符串池中，然后再返回它的引用。
		if(a==b)//比较内存地
		{
			System.out.println("a==b");			
		}
		else{
			System.out.println("a!=b");
		}
		if(a.equals(b))//比较值
		{
			System.out.println("a equals b");
		}
		else{
			System.out.println("a not equals b");
		}
		
	}
	/***
	 * 	a!=b
		a equals b
		但是在
		http://www.cnblogs.com/zhxhdean/archive/2011/03/25/1995431.html#undefined
		中是：说什么内存缓冲池。可是我见不到这种效果
		s1 == s2
		s1 equals s2
	 */
}
