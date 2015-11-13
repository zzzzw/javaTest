/***
 * 1. ��򵥵�ʵ��
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
 * 2.�����Ż�
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
 * 3��ͬ����Ӧ�Զ��߳�
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
 * 4.��������
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
//double-checked locking���
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
 * 5. ��Դͷ���   
 */
/**
 * 
 * ����һ��������Ҫ��Щ�����أ�һ��������һ���ڴ棬���ù��췽�����г�ʼ����������һ���Ƿ���
 * һ��ָ��ָ������ڴ档����������˭��ǰ˭�ں��أ�JVM�淶��û�й涨����ô�ʹ�����ôһ�������
 * JVM���ȿ��ٳ�һ���ڴ棬Ȼ���ָ��ָ������ڴ棬�����ù��췽�����г�ʼ������������������
 * ��ôһ��������߳�A��ʼ����SingletonClass��ʵ������ʱ�߳�B������getInstance()����������
 * �ж�instance�Ƿ�Ϊnull����������������˵���ڴ�ģ�ͣ�A�Ѿ���instanceָ�����ǿ��ڴ棬ֻ��
 * ��û�е��ù��췽�������B��⵽instance��Ϊnull������ֱ�Ӱ�instance�����ˡ�����������ˣ�
 * ����instance��Ϊnull��������û�й�����ɣ�����һ�׷����Ѿ�������Կ�ף����㲢����ס��ȥ��
 * ��Ϊ���滹û����ʰ����ʱ�����B��A��instance�������֮ǰ�����������ʵ��������ͻ���ִ����ˣ�
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
 * 6.������� 
 *
 */
//��JDK 5֮��Javaʹ�����µ��ڴ�ģ�͡�volatile�ؼ���������ȷ�����塪����JDK1.5֮ǰ��
//volatile�Ǹ��ؼ��֣����ǲ�û����ȷ�Ĺ涨����;������volatile���ε�д�������ܺ�֮ǰ�Ķ�д���������
//���������ܺ�֮��Ķ�д�����������ˣ�ֻҪ���Ǽ򵥵İ�instance����volatile�ؼ��־Ϳ����ˡ�
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
 * �Ƽ��÷�
 */
/*public class SingletonClass{
	private SingletonClass(){}
	//Java�ľ�̬�ڲ���
	private static class SingletonClassInstance{
		private  static final SingletonClass instance=new SingletonClass();
	}
	public static SingletonClass getInstance(){
		return SingletonClassInstance.instance;
	}	
}
*/


