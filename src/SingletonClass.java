/***
 * 1. 最简单的实现
 * 
 * 
 */

/*
public class SingletonClass {
	private SingletonClass(){}
	private static final SingletonClass instance=new SingletonClass();
	private static SingletonClass getInstance(){
		return instance;
	}

}
*/
/**
 * 
 * 2.性能优化
 *
 */
/*public class SingletonClass{
	private SingletonClass(){}
	private static SingletonClass instance=null;
	public static SingletonClass getInstance(){
		if(instance==null){
			instance=new SingletonClass();
		}
		return instance;
	}
}*/
/***
 * 
 * 3、同步，应对多线程
 *
 */
/*public class SingletonClass{
	private SingletonClass() {
	}
	private static SingletonClass instance=null;
	public synchronized static SingletonClass getInstance(){
		if(instance==null){		
			instance=new SingletonClass();
		}
		return instance;
		
	}
}
	*/
/***
 * 4.又是性能
 */
/*public class SingletonClass{
	private SingletonClass(){}
	private static SingletonClass instance=null;
	public static SingletonClass  getInstance(){
		synchronized(SingletonClass.class){
			if(instance==null){
				instance=new SingletonClass();
			}
		}
		return instance;
	}
}
*/
//double-checked locking设计
/*public class SingletonClass{
	private SingletonClass(){}
	private static SingletonClass instance=null;
	public SingletonClass getInstance(){
		if(instance==null){
			synchronized(SingletonClass.class){
				if(instance==null){
					instance=new SingletonClass();
				}
			}			
		}
		return instance;
	}
}*/
/***
 * 5. 从源头检查   
 */
/**
 * 
 * 创建一个变量需要哪些步骤呢？一个是申请一块内存，调用构造方法进行初始化操作，另一个是分配
 * 一个指针指向这块内存。这两个操作谁在前谁在后呢？JVM规范并没有规定。那么就存在这么一种情况，
 * JVM是先开辟出一块内存，然后把指针指向这块内存，最后调用构造方法进行初始化。下面我们来考虑
 * 这么一种情况：线程A开始创建SingletonClass的实例，此时线程B调用了getInstance()方法，首先
 * 判断instance是否为null。按照我们上面所说的内存模型，A已经把instance指向了那块内存，只是
 * 还没有调用构造方法，因此B检测到instance不为null，于是直接把instance返回了——问题出现了，
 * 尽管instance不为null，但它并没有构造完成，就像一套房子已经给了你钥匙，但你并不能住进去，
 * 因为里面还没有收拾。此时，如果B在A将instance构造完成之前就是用了这个实例，程序就会出现错误了！
 *
 */
/*public class SingletonClass{//wrong job
	private SingletonClass(){}
	private static SingletonClass instance=null;
	public static SingletonClass getInstance(){
		if(instance==null){
			SingletonClass sc;
			synchronized(SingletonClass.class){
				sc=instance;
				if(sc==null){
					synchronized(SingletonClass.class){
						if(sc==null){
							sc=new SingletonClass();
						}
					}
				}
				instance=sc;				
			}
			
		}
		return instance;
	}	
}*/

/***
 * 
 * 6.解决方案 
 *
 */
//在JDK 5之后，Java使用了新的内存模型。volatile关键字有了明确的语义——在JDK1.5之前，
//volatile是个关键字，但是并没有明确的规定其用途——被volatile修饰的写变量不能和之前的读写代码调整，
//读变量不能和之后的读写代码调整！因此，只要我们简单的把instance加上volatile关键字就可以了。
/*public class SingletonClass{
	private SingletonClass(){}
	private volatile static SingletonClass instance=null;
	public static SingletonClass getInstance(){
		if(instance==null){
			synchronized(SingletonClass.class){
				if(instance==null){
					instance=new SingletonClass();
				}			
			}		
		}
		return instance;
	}
}*/
/***
 * 推荐用法
 */
/*public class SingletonClass{
	private SingletonClass(){}
	//Java的静态内部类
	private static class SingletonClassInstance{
		private  static final SingletonClass instance=new SingletonClass();
	}
	public static SingletonClass getInstance(){
		return SingletonClassInstance.instance;
	}	
}
*/


