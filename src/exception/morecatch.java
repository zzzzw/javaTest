package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class morecatch {
	/*����catch��
	һ�δ�����ܻ������������͵��쳣����ʱ�����ǿ�����һ��try�����������catch���飬�ֱ���ͬ���쳣��
	�����Ҫע�����:���catch���д�����쳣���ͱ����Ǵ����⵽һ�㣬���һ��һ����Exception��*/
	public static void main(String args [])   
    {   
                    Scanner input = new Scanner(System.in);   
                    while(true)
                    {
                    	try  
                        {   
                                 System.out.println("������S1����ѧʱ:");   
                                 int totalTime = input.nextInt();   
                                 System.out.println("�������ܿ�Ŀ:");   
                                 int totalCourse = input.nextInt();   
                                  System.out.println("ƽ����ʱ��:" + totalTime/totalCourse);   
                        }   
                         catch(InputMismatchException ex)   
                        {   
                                   ex.printStackTrace();   
                        }   
                        catch(ArithmeticException ex)   
                       {   
                                    ex.printStackTrace();   
                       }   
                    }
                    
    }   
	/*һ�δ�����ܻ������������͵��쳣����ʱ�����ǿ�����һ��try�����������catch���飬�ֱ���ͬ���쳣��
	�����Ҫע�����:���catch���д�����쳣���ͱ����Ǵ����⵽һ�㣬���һ��һ����Exception��*/
	
	/*����ʱ��ϵͳ���ϵ��·ֱ��ÿ��catch���鴦����쳣���ͽ��м�⣬��ִ�е�һ�����쳣����ƥ���catch��䡣ִ����
	һ��catch��������catch��佫�����ԡ�ƥ����ָcatch��������쳣�����������ɵ��쳣������ȫһ�»������ĳ��ࡣ
	�������������쳣������catch������쳣����ƥ��Ļ���������쳣����JVM�����Ҵ�����ʱ�벻ʹ���쳣������
	һ�µġ�*/

}
