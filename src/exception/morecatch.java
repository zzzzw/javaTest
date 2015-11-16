package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class morecatch {
	/*多重catch块
	一段代码可能会引发多种类型的异常。这时，我们可以在一个try语句块后紧跟多个catch语句块，分别处理不同的异常。
	这里，需要注意的是:多个catch块中处理的异常类型必须是从特殊到一般，最后一个一般是Exception类*/
	public static void main(String args [])   
    {   
                    Scanner input = new Scanner(System.in);   
                    while(true)
                    {
                    	try  
                        {   
                                 System.out.println("请输入S1的总学时:");   
                                 int totalTime = input.nextInt();   
                                 System.out.println("请输入总科目:");   
                                 int totalCourse = input.nextInt();   
                                  System.out.println("平均课时是:" + totalTime/totalCourse);   
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
	/*一段代码可能会引发多种类型的异常。这时，我们可以在一个try语句块后紧跟多个catch语句块，分别处理不同的异常。
	这里，需要注意的是:多个catch块中处理的异常类型必须是从特殊到一般，最后一个一般是Exception类*/
	
	/*运行时，系统从上到下分别对每个catch语句块处理的异常类型进行检测，并执行第一个与异常类型匹配的catch语句。执行了
	一个catch语句后，其后的catch语句将被忽略。匹配是指catch所处理的异常类型与所生成的异常类型完全一致或是它的超类。
	如果程序产生的异常类型与catch处理的异常都不匹配的话，则这个异常将由JVM捕获并且处理，此时与不使用异常处理是
	一致的。*/

}
