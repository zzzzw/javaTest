package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*public class HelloA{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("输入一个数字");
		int a=in.nextInt();
		System.out.println("输入一个double类型");
		double b=in.nextDouble();
		System.out.println("输入一个string类型");
		String c=in.next();
		System.out.println("输入一个float类型");
		float d=in.nextFloat();
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t");
	}
}*/
//string-->double
/*public class HelloA{
	public static void main(String agrs[])
	{
		while(true)//实现多次输入,跟c中 while(scanf("%d",&a)!=EOF)一样
		{
			try{
				Scanner in=new Scanner (System.in);
				System.out.println("请输入一个String类型");
				String a=in.next(); //如果输入"12.12",下面就可以运行，但是输入a这个字符就出现异常了
				//String-->double
				double a1=Double.parseDouble(a);
				//System.out.println("String-->double\t"+a+"\t"+a1);
				System.out.println("string-->double："+a1);
		
					
				
				
			}catch(NumberFormatException a){
				System.out.println("请输入数字字符串/请输入");
				//a.getMessage().contains("123);
			}finally{
				System.out.println("这是一个Finally");   //顺便试了一下try catch finally
			}
			
		}		
	}
}*/
//String--->float
/*public class HelloA{
	public static void main(String agrs[])
	{
		while(true)//实现多次输入,跟c中 while(scanf("%d",&a)!=EOF)一样
		{
			try{
				Scanner in=new Scanner (System.in);
				System.out.println("请输入一个String类型");
				String a=in.next(); //如果输入"12.12",下面就可以运行，但是输入a这个字符就出现异常了
			
				float a2=Float.parseFloat(a);
				System.out.println("String-->float："+a2);
			
					
				
				
			}catch(NumberFormatException a){
				System.out.println("请输入数字字符串/请输入");
				//a.getMessage().contains("123);
			}finally{
				System.out.println("这是一个Finally");   //顺便试了一下try catch finally
			}
			
		}		
	}
}*/
//String--->int
/*public class HelloA{
	public static void main(String agrs[])
	{
		while(true)//实现多次输入,跟c中 while(scanf("%d",&a)!=EOF)一样
		{
			try{
				Scanner in=new Scanner (System.in);
				System.out.println("请输入一个String类型");
				String a=in.next(); //如果输入"12.12",下面就可以运行，但是输入a这个字符就出现异常了
				
				int a3=Integer.parseInt(a);
				System.out.println("String-->int："+a3);//string转为int的时候要求String没有小数点的才可以
					
				
				
			}catch(NumberFormatException a){
				System.out.println("请输入数字字符串,同时不带小数点/请输入");
				//a.getMessage().contains("123);
			}finally{
				System.out.println("这是一个Finally");   //顺便试了一下try catch finally
			}
			
		}		
	}
}*/
//接受一个double,float,int,boolean类型
public class HelloA{
	public static void main(String agrs[])
	{
		Scanner in=new Scanner(System.in);
		while(true)
		{
			try{
				System.out.println("输入一个整形");
				int a=in.nextInt();
				System.out.println("输入一个double");
				double b=in.nextDouble();
				System.out.println("输入一个float");
				float c=in.nextFloat();
				System.out.println("输入一个boolean");
				boolean d=in.nextBoolean();//这句肯定是会报错。如果不是输入true或则false
				System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				System.out.println("我来看热闹的，我是finally");
			}
			
			
		}
	}
}				