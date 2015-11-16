package exception;

public class exception {
	public static void main(String args[])
	{
		
			/***
			 * 不能对类型 exception 中的非静态方法 a（int）进行静态引用,想要引用的时候非
			 * 静态的属性是不能够在静态的方法里引用的，想要引用的话必须是用对象来引用
			 */
			//a(1);
			//new exception().a(1);//未处理的异常类型 Exception
			//new exception().a(1);//可以继续抛出声明，这样子就不用try catch了
		try {
			new exception().a(1);
		} catch (Exception e) {
			System.out.println("try\tcatch处理了异常");
		}
			
			
		
	}
	//这种写法会报错
/*	public void a(int i) {
		if(i==1){
			throw  new Exception();//未处理的异常类型 Exception
		}
	}*/
	//这种写法没错，但是把异常自己处理了。相当于没卵用
/*	public void a(int i) {//抛出异常同时自己处理
		if(i==1){
			try {
				throw  new Exception();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}//未处理的异常类型 Exception
		}
	}*/
	public void a(int i) throws Exception {//声明抛出异常
		if(i==1){
			throw  new Exception();//抛出异常
		}
	}

}
