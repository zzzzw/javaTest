package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*public class HelloA{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("����һ������");
		int a=in.nextInt();
		System.out.println("����һ��double����");
		double b=in.nextDouble();
		System.out.println("����һ��string����");
		String c=in.next();
		System.out.println("����һ��float����");
		float d=in.nextFloat();
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t");
	}
}*/
//string-->double
/*public class HelloA{
	public static void main(String agrs[])
	{
		while(true)//ʵ�ֶ������,��c�� while(scanf("%d",&a)!=EOF)һ��
		{
			try{
				Scanner in=new Scanner (System.in);
				System.out.println("������һ��String����");
				String a=in.next(); //�������"12.12",����Ϳ������У���������a����ַ��ͳ����쳣��
				//String-->double
				double a1=Double.parseDouble(a);
				//System.out.println("String-->double\t"+a+"\t"+a1);
				System.out.println("string-->double��"+a1);
		
					
				
				
			}catch(NumberFormatException a){
				System.out.println("�����������ַ���/������");
				//a.getMessage().contains("123);
			}finally{
				System.out.println("����һ��Finally");   //˳������һ��try catch finally
			}
			
		}		
	}
}*/
//String--->float
/*public class HelloA{
	public static void main(String agrs[])
	{
		while(true)//ʵ�ֶ������,��c�� while(scanf("%d",&a)!=EOF)һ��
		{
			try{
				Scanner in=new Scanner (System.in);
				System.out.println("������һ��String����");
				String a=in.next(); //�������"12.12",����Ϳ������У���������a����ַ��ͳ����쳣��
			
				float a2=Float.parseFloat(a);
				System.out.println("String-->float��"+a2);
			
					
				
				
			}catch(NumberFormatException a){
				System.out.println("�����������ַ���/������");
				//a.getMessage().contains("123);
			}finally{
				System.out.println("����һ��Finally");   //˳������һ��try catch finally
			}
			
		}		
	}
}*/
//String--->int
/*public class HelloA{
	public static void main(String agrs[])
	{
		while(true)//ʵ�ֶ������,��c�� while(scanf("%d",&a)!=EOF)һ��
		{
			try{
				Scanner in=new Scanner (System.in);
				System.out.println("������һ��String����");
				String a=in.next(); //�������"12.12",����Ϳ������У���������a����ַ��ͳ����쳣��
				
				int a3=Integer.parseInt(a);
				System.out.println("String-->int��"+a3);//stringתΪint��ʱ��Ҫ��Stringû��С����Ĳſ���
					
				
				
			}catch(NumberFormatException a){
				System.out.println("�����������ַ���,ͬʱ����С����/������");
				//a.getMessage().contains("123);
			}finally{
				System.out.println("����һ��Finally");   //˳������һ��try catch finally
			}
			
		}		
	}
}*/
//����һ��double,float,int,boolean����
public class HelloA{
	public static void main(String agrs[])
	{
		Scanner in=new Scanner(System.in);
		while(true)
		{
			try{
				System.out.println("����һ������");
				int a=in.nextInt();
				System.out.println("����һ��double");
				double b=in.nextDouble();
				System.out.println("����һ��float");
				float c=in.nextFloat();
				System.out.println("����һ��boolean");
				boolean d=in.nextBoolean();//���϶��ǻᱨ�������������true����false
				System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				System.out.println("���������ֵģ�����finally");
			}
			
			
		}
	}
}				